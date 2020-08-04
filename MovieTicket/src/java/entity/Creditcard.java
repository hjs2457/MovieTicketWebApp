
package entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "CREDITCARD")
@NamedQueries({
    @NamedQuery(name = "Creditcard.findAll", query = "SELECT c FROM Creditcard c"),
    @NamedQuery(name = "Creditcard.findByNumber", query = "SELECT c FROM Creditcard c WHERE c.number = :number"),
    @NamedQuery(name = "Creditcard.findBySecuritycode", query = "SELECT c FROM Creditcard c WHERE c.securitycode = :securitycode"),
    @NamedQuery(name = "Creditcard.findByExpdate", query = "SELECT c FROM Creditcard c WHERE c.expdate = :expdate")})
public class Creditcard implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 16)
    @Column(name = "NUMBER")
    private String number;
    @Size(max = 3)
    @Column(name = "SECURITYCODE")
    private String securitycode;
    @Size(max = 5)
    @Column(name = "EXPDATE")
    private String expdate;

    public Creditcard() {
    }

    public Creditcard(String number) {
        this.number = number;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getSecuritycode() {
        return securitycode;
    }

    public void setSecuritycode(String securitycode) {
        this.securitycode = securitycode;
    }

    public String getExpdate() {
        return expdate;
    }

    public void setExpdate(String expdate) {
        this.expdate = expdate;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (number != null ? number.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Creditcard)) {
            return false;
        }
        Creditcard other = (Creditcard) object;
        if(this.number.equals(other.number) && this.expdate.equals(other.expdate) && this.securitycode.equals(other.securitycode))
            return true;
        return false;
    }

    @Override
    public String toString() {
        return "entity.Creditcard[ number=" + number + " ]";
    }
    
}
