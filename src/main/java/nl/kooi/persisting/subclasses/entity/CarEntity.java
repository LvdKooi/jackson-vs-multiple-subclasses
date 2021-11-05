package nl.kooi.persisting.subclasses.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

import javax.persistence.Entity;

@AllArgsConstructor
@Entity
public class CarEntity extends MotorizedVehicleEntity {
    private Long numberOfDoors;
    private String bodyType;
}
