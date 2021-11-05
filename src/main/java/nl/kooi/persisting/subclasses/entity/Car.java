package nl.kooi.persisting.subclasses.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;

@AllArgsConstructor
@Entity
@Getter
@Setter
public class Car extends MotorizedVehicle {
    private int numberOfDoors;
    private String bodyType;
}
