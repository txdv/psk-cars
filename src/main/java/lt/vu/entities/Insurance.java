package lt.vu.entities;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.apache.johnzon.mapper.JohnzonIgnore;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "INSURANCE")
@NamedQueries({
        @NamedQuery(name = "Insurance.findAll", query = "SELECT i FROM Insurance i"),
        @NamedQuery(name = "Insurance.findById", query = "SELECT i FROM Insurance i WHERE i.id = :id")
})
@Getter
@Setter
@ToString(of = {"id"})
public class Insurance implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Integer id;

    @Column(name = "DATE_START")
    private Date dateStart;

    @Column(name = "DATE_END")
    private Date dateEnd;

    @JoinTable(name = "INSURANCE_CAR", joinColumns = {
            @JoinColumn(name = "INSURANCE_ID", referencedColumnName = "ID")}, inverseJoinColumns = {
            @JoinColumn(name = "CAR_ID", referencedColumnName = "ID")})
    @ManyToMany
    @JohnzonIgnore
    private List<Car> carList = new ArrayList<>();
}
