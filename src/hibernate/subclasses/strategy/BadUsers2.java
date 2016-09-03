package hibernate.subclasses.strategy;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity(name = "bad_user")
public class BadUsers2 extends Users2 {

    @Column(name = "debt")
    private String debt;

    public String getDebt() {
        return debt;
    }

    public void setDebt(String debt) {
        this.debt = debt;
    }


}
