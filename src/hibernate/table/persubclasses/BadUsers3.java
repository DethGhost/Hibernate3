package hibernate.table.persubclasses;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity(name = "bad_users")
public class BadUsers3 extends Users3 {

    @Column(name = "debt")
    private String debt;

    public String getDebt() {
        return debt;
    }

    public void setDebt(String debt) {
        this.debt = debt;
    }


}
