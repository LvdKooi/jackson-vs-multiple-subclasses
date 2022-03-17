package nl.kooi.vehicle.api.dto;

import lombok.Data;
import nl.kooi.vehicle.enums.BodyStyle;

@Data
public class CarDto extends MotorizedVehicleDto {
    private int numberOfDoors;
    private BodyStyle bodyStyle;
}
