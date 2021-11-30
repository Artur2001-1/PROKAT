package edu.javavt19.model;

import org.hibernate.validator.constraints.NotEmpty;
import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "car_class")
@NamedQuery(name = "CarClass.findAll", query = "select c from CarClass c")

public class CarClass implements Serializable {
    @Id @GeneratedValue(strategy= GenerationType.AUTO)
    private int idClass;
    @NotEmpty @Column(name="class", unique=true, nullable=false)
    private String carClass;

    public CarClass() {}

    public void setIdClass(int idClass) {
        this.idClass = idClass;
    }

    public void setCarClass(String carClass) {
        this.carClass = carClass;
    }

    public int getIdClass() {
        return idClass;
    }

    public String getCarClass() {
        return carClass;
    }

    @Override
    public String toString() {
        return "CarClass{" +
                "idClass=" + idClass +
                ", class='" + carClass + "\'" +
                '}';
    }
}
