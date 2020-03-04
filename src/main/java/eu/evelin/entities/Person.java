package eu.evelin.entities;

import javax.persistence.*;

@Entity
@Table(name="people")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="type")
public abstract class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private long id;
    @Column(insertable = false,updatable = false)
    private  String type;
    private String firstName;
    private String lastName;

    protected Person(){

    }

    protected Person(String firstName, String lastName, String type){
        this.firstName = firstName;
        this.lastName = lastName;
        this.type = type;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
