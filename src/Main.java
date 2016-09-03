

import hibernate.getData.Jpql.UsersJPQL;
import org.hibernate.SessionFactory;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.Query;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        SessionFactory factory = (SessionFactory) Persistence.
                createEntityManagerFactory("org.hibernate.tutorial.jpa");
        EntityManager em = factory.createEntityManager();
        em.getTransaction().begin();/*
        UsersJPQL users = new UsersJPQL();
        Phones phone1 = new Phones();
        Phones phone2 = new Phones();
        phone1.setPhoneNumber("+380939569622");
        phone2.setPhoneNumber("+380639916252");
        em.persist(phone1);
        em.persist(phone2);
        em.getTransaction().commit();
        em.getTransaction().begin();
        users.setName("Fi222rst");
        users.setSurname("ff2222222ff");
        users.setBalance(122);
        users.setSumm(32);
        users.getPhones().add(phone1);
        users.getPhones().add(phone2);
        users.getAddresses().put(AddresType.HOME, "some home222");
        users.getAddresses().put(AddresType.OFFICE, "some office2222");
        em.persist(users);
        em.getTransaction().commit();
        em.getTransaction().begin();
        phone1.setUsersJPQL(users);
        phone2.setUsersJPQL(users);*/
        Query q = (Query) em.createNamedQuery("selectAllUsers");
        List<UsersJPQL> usersJPQLs = q.getResultList();
         System.out.println(usersJPQLs);
        em.getTransaction().commit();
        em.close();
        factory.close();

    }
}
