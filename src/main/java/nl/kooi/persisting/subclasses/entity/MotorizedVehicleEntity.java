package nl.kooi.persisting.subclasses.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;

@AllArgsConstructor
@NoArgsConstructor
@Entity
public class MotorizedVehicleEntity extends VehicleEntity {
    private String licensePlate;
    private Long horsePower;
    private String fuelType;
}
