package Entity;

import jakarta.persistence.*;

@Entity
@Table(name="equipment")
public class Equipment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name="name")
    private String name;
    @Column(name="description")
    private String description;

    public Equipment(String name,String description){
        this .name=name;
        this.description=description;

    }

    public Long getId(){
        return id;
    }

    public String getDescription(){
        return description;

    }

    public void setName(String name) {

        this.name = name;
    }
    public void setDescription(String description){
        this.description=description;
    }
}
