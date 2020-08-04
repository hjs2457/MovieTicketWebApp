
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
@Table(name = "SHOWING")
@NamedQueries({
    @NamedQuery(name = "Showing.findAll", query = "SELECT s FROM Showing s"),
    @NamedQuery(name = "Showing.findById", query = "SELECT s FROM Showing s WHERE s.id = :id"),
    @NamedQuery(name = "Showing.findByName", query = "SELECT s FROM Showing s WHERE s.name = :name"),
    @NamedQuery(name = "Showing.findByTitle", query = "SELECT s FROM Showing s WHERE s.title = :title"),
    @NamedQuery(name = "Showing.findByListtimes", query = "SELECT s FROM Showing s WHERE s.listtimes = :listtimes")})
public class Showing implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID")
    private Integer id;
    @Size(max = 50)
    @Column(name = "NAME")
    private String name;
    @Size(max = 25)
    @Column(name = "TITLE")
    private String title;
    @Size(max = 100)
    @Column(name = "LISTTIMES")
    private String listtimes;

    public Showing() {
    }

    public Showing(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getListtimes() {
        return listtimes;
    }

    public void setListtimes(String listtimes) {
        this.listtimes = listtimes;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Showing)) {
            return false;
        }
        Showing other = (Showing) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Showing[ id=" + id + " ]";
    }
    
}
