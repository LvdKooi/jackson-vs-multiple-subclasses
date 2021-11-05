package nl.kooi.persisting.subclasses.api.dto;

import lombok.Data;
import lombok.ToString;
import lombok.Value;

@Value
public class MotorCycleDto extends MotorizedVehicleDto {
    private int numberOfWheels;
    private boolean helmetRequired;
}
