import eu.evelin.entities.Person;
import eu.evelin.entities.Student;
import eu.evelin.entities.Teacher;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Temporal;

public class Main {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("school");
        EntityManager em = emf.createEntityManager();
        Student student = new Student("Ivan", "Stamatov",1);
        Person teacher = new Teacher("Chocho", "Chochov", "MA");
        em.getTransaction().begin();
        em.persist(student);
        em.getTransaction().commit();

        em.getTransaction().begin();
        em.persist(teacher);
        em.getTransaction().commit();
    }
}
