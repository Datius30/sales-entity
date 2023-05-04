package Entity;

public class EquipmentBuilder {
    private String name;
    private String description;

    public EquipmentBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public EquipmentBuilder setDescription(String description) {
        this.description = description;
        return this;
    }

    public Equipment createEquipment() {
        return new Equipment(name, description);
    }
}