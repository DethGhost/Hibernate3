package hibernate.inerits.singletables;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("BAD_USER")
public class BadUsers extends Users {

    @Column(name = "debt")
    private String debt;

    public String getDebt() {
        return debt;
    }

    public void setDebt(String debt) {
        this.debt = debt;
    }


}
