package nl.kooi.vehicle.api.dto;

import lombok.Data;
import nl.kooi.vehicle.enums.PropulsionType;
import nl.kooi.vehicle.enums.WatercraftType;

@Data
public class WatercraftDto extends VehicleDto {
    private PropulsionType propulsionType;
    private int lengthMeters;
    private WatercraftType watercraftType;
    private int draftMeters;
}
