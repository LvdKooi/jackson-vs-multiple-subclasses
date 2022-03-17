package nl.kooi.vehicle.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import nl.kooi.vehicle.enums.BusType;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Getter
@Setter
public class Bus extends MotorizedVehicle {
    @Enumerated(EnumType.STRING)
    private BusType busType;
    private int litersLuggageCapacity;
}
