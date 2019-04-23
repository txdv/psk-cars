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
import org.apache.johnzon.mapper.JohnzonIgnore;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "INSURANCE")
@NamedQueries({
        @NamedQuery(name = "Insurance.findAll", query = "SELECT i FROM Insurance i"),
        @NamedQuery(name = "Insurance.findById", query = "SELECT i FROM Insurance i WHERE i.id = :id")
})
@Getter
@Setter
@EqualsAndHashCode(of = "name")
@ToString(of = {"id", "name"})
public class Insurance implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Integer id;

    @Size(min = 4, max = 50)
    @Column(name = "NAME")
    private String name;

    @ManyToMany
    @JohnzonIgnore
    private List<Car> carList = new ArrayList<>();
}
