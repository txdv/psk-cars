/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lt.vu.entities;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "UNIVERSITY")
@NamedQueries({
        @NamedQuery(name = "Car.findAll", query = "SELECT c FROM Car c"),
        @NamedQuery(name = "Car.findById", query = "SELECT c FROM Car c WHERE c.id = :id")
})
@Getter
@Setter
@EqualsAndHashCode(of = "title")
@ToString(of = {"id", "title"})
public class Car implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Integer id;

    @Size(max = 50)
    @Column(name = "VIN")
    private String vin;

    @Column(name = "BUILT")
    Instant built;

    @Size(max = 50)
    @Column(name = "COLOR")
    private String color;

    @ManyToMany(mappedBy = "carList")
    private List<Insurance> insuranceList = new ArrayList<>();

    /*
    @OneToMany(mappedBy = "university")
    private List<Student> studentList = new ArrayList<>();
    */
}
