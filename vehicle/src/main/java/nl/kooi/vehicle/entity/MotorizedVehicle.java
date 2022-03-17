package nl.kooi.vehicle.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import nl.kooi.vehicle.enums.FuelType;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Getter
@Setter
public class MotorizedVehicle extends Vehicle {
    private String licensePlate;
    private int horsePower;
    @Enumerated(value = EnumType.STRING)
    private FuelType fuelType;
}
