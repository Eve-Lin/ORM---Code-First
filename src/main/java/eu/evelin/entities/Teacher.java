package eu.evelin.entities;

import javax.persistence.*;


@Entity
@DiscriminatorValue(value="eacher")
public class Teacher extends Person{
    private final static String type = "TEACHER";
    private String degree;

    public Teacher(){

    }

    public Teacher(String firstName, String lastName, String degree) {
    super(firstName, lastName, type);
   setDegree(degree);
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }
}
