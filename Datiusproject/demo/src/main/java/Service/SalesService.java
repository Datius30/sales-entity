package Service;

import Entity.Equipment;
import Entity.Sales;
import Repository.EquipmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class SalesService {
    private EquipmentRepository equipmentRepository;
    @Autowired
    public SalesService(EquipmentRepository equipmentRepository){
        this.equipmentRepository=equipmentRepository;
    }
    public Equipment getEquipmentById(Long id){
        return equipmentRepository.findById(id).orElse(null);
    }
    public List<Equipment> getAllEquipment(){
        return equipmentRepository.findAll();
    }
    public Equipment saveEquipment(Equipment equipment){
        return equipmentRepository.save(equipment);
    }
    public void deleteEquipment(Long id){
        equipmentRepository.deleteById(id);
    }

}
