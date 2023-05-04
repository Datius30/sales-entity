package controller;

import Entity.Equipment;
import Service.EquipmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/equipments")
public class EquipmentController {
    private EquipmentService equipmentService;
    @Autowired
    public EquipmentController(EquipmentService equipmentService){
        this .equipmentService=equipmentService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<Equipment>getEquipmentById(@PathVariable Long id){
        Equipment equipment=equipmentService.getEquipmentById(id);
        return equipment==null ?
                ResponseEntity.notFound().build():ResponseEntity.ok(equipment);
    }
    @GetMapping
    public ResponseEntity<List<Equipment>>getAllEquipments(){
        List<Equipment> equipments=equipmentService.getAllEquipment();
        return equipments.isEmpty()?
                ResponseEntity.noContent().build():ResponseEntity.ok(equipments);

    }
    @PostMapping
    public ResponseEntity<Equipment>saveEquipment(@RequestBody Equipment equipment){
        Equipment savedequipment=equipmentService.saveEquipment(equipment);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedequipment);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Void>deleteEquipment(@PathVariable Long id){equipmentService.deleteEquipment(id);
    return ResponseEntity.noContent().build();}
}
