package nl.kooi.vehicle.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import nl.kooi.vehicle.enums.BodyStyle;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Getter
@Setter
public class Car extends MotorizedVehicle {
    private int numberOfDoors;
    @Enumerated(value = EnumType.STRING)
    private BodyStyle bodyStyle;
}
