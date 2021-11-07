package nl.kooi.vehicle.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Getter
@Setter
public class Car extends MotorizedVehicle {
    private int numberOfDoors;
    private String bodyType;
}
