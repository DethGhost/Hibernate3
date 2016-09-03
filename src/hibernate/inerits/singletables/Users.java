package hibernate.inerits.singletables;

import javax.persistence.*;

@Entity(name = "all_users")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "user_type", discriminatorType = DiscriminatorType.STRING, length = 20)
@DiscriminatorValue("BASIC_USER")
public class Users {
    @Id
    @GeneratedValue
    protected long id;

    @Column(name = "name")
    protected String name;

    @Column(name = "surname")
    protected String surname;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
}
