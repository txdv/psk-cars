package lt.vu.entities;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.apache.johnzon.mapper.JohnzonIgnore;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "OWNER")
@NamedQueries({
    @NamedQuery(name = "Owner.findAll", query = "SELECT o FROM Owner o"),
    @NamedQuery(name = "Owner.findById", query = "SELECT o FROM Owner o WHERE o.id = :id"),
    @NamedQuery(name = "Owner.findByFirstName", query = "SELECT o FROM Owner o WHERE o.firstName LIKE :firstName"),
    @NamedQuery(name = "Owner.findByLastName", query = "SELECT o FROM Owner o WHERE o   .lastName LIKE :lastName"),
})
@Getter
@Setter
@EqualsAndHashCode(of = "registrationNo")
@ToString(of = {"id", "firstName", "lastName", "registrationNo"})
public class Owner implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Integer id;

    @Size(min = 3, max = 20)
    @Column(name = "FIRST_NAME")
    private String firstName;

    @Size(min = 3, max = 20)
    @Column(name = "LAST_NAME")
    private String lastName;

    @Size(min = 3, max = 20)
    @Column(name = "REGISTRATION_NO")
    private String registrationNo;

    @Version
    @Column(name = "OPT_LOCK_VERSION")
    private Integer optLockVersion;

    /*
    @JoinTable(name = "STUDENT_COURSE", joinColumns = {
        @JoinColumn(name = "STUDENT_ID", referencedColumnName = "ID")}, inverseJoinColumns = {
        @JoinColumn(name = "COURSE_ID", referencedColumnName = "ID")})
    @ManyToMany
    @JohnzonIgnore
    private List<Course> courseList = new ArrayList<>();

    @JoinColumn(name = "UNIVERSITY_ID", referencedColumnName = "ID")
    @ManyToOne
    @JohnzonIgnore
    private University university;
*/
}
