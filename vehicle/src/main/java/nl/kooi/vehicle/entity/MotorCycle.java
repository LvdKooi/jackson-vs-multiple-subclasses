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
public class MotorCycle extends MotorizedVehicle {
    private int numberOfWheels;
    private boolean helmetRequired;
}
