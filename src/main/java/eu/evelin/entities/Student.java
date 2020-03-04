package eu.evelin.entities;

import javax.persistence.*;

@Entity
@DiscriminatorValue(value = "student")
public class Student extends Person {
    private final static String type = "STUDENT";

    private int grade;
    public Student(){

    }

    public Student(String firstName, String lastName, int grade) {
        super(firstName, lastName, type);
        setGrade(grade);
    }


    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }
}
