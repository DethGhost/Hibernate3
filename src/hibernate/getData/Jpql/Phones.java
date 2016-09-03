package hibernate.getData.Jpql;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Phones implements Serializable{
    @Id
    @GeneratedValue
    private long id;

    @ManyToOne(fetch = FetchType.LAZY)
    private UsersJPQL usersJPQL;

    @Column(name = "phone_number")
    private String phoneNumber;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public UsersJPQL getUsersJPQL() {
        return usersJPQL;
    }

    public void setUsersJPQL(UsersJPQL usersJPQL) {
        this.usersJPQL = usersJPQL;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    @Override
    public String toString(){
        return phoneNumber;
    }
}
