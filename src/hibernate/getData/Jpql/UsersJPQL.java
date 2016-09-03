package hibernate.getData.Jpql;

import org.hibernate.annotations.Formula;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@NamedQueries(@NamedQuery(name = "selectAllUsers", query = "select u from UsersJPQL u"))
@Entity(name = "UsersJPQL")
public class UsersJPQL {
    @Id
    @GeneratedValue
    private long id;

    @Column(name = "name")
    private String name;

    @Column(name = "surname")
    private String surname;

    @Column(name = "balance")
    private double balance;

    @Column(name = "summ")
    private double summ;

    public List<Phones> getPhones() {
        return phones;
    }

    public void setPhones(List<Phones> phones) {
        this.phones = phones;
    }

    public Map<AddresType, String> getAddresses() {
        return addresses;
    }

    public void setAddresses(Map<AddresType, String> addresses) {
        this.addresses = addresses;
    }

    @Formula(value = "balance*100/summ")
    private double percent;

    @OneToMany(mappedBy = "usersJPQL", cascade = CascadeType.ALL, orphanRemoval = true)
    protected List<Phones> phones = new ArrayList();

    @ElementCollection
    @MapKeyEnumerated(EnumType.STRING)
    private Map<AddresType, String> addresses = new HashMap();

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getSumm() {
        return summ;
    }

    public void setSumm(double summ) {
        this.summ = summ;
    }

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

    public double getPercent() {
        return percent;
    }

    @Override
    public String toString(){
        return "name:\n"+name+"\nsurname:\n"+surname+"\nbalance:\n"+balance+"\nsumm:\n"+summ+"\npercent:\n"+percent+
                "\nphones:\n"+phones + "\naddress:\n"+addresses;
    }
}
