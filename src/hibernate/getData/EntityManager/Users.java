package hibernate.getData.EntityManager;

import org.hibernate.annotations.Formula;

import javax.persistence.*;

@Entity(name = "em_users")
public class Users {
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


    @Formula(value = "balance*100/summ")
    private double percent;

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
        return "name:\n"+name+"\nsurname:\n"+surname+"\nbalance:\n"+balance+"\nsumm:\n"+summ+"\npercent:\n"+percent;
    }
}
