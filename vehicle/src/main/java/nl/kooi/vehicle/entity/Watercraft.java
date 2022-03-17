package nl.kooi.vehicle.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import nl.kooi.vehicle.enums.FuelType;
import nl.kooi.vehicle.enums.PropulsionType;
import nl.kooi.vehicle.enums.WatercraftType;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Getter
@Setter
public class Watercraft extends Vehicle {
    @Enumerated(EnumType.STRING)
    private PropulsionType propulsionType;
    private int lengthMeters;
    @Enumerated(EnumType.STRING)
    private WatercraftType watercraftType;
    private int draftMeters;
}
