package hibernate.subclasses.strategy;

import javax.persistence.*;

@Entity(name = "strategy_users")
@Inheritance(strategy = InheritanceType.JOINED)
public class Users2 {
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
