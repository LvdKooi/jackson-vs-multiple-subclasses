package nl.kooi.vehicle.api.dto;

import lombok.Data;

@Data
public class MotorCycleDto extends MotorizedVehicleDto {
    private int numberOfWheels;
    private boolean helmetRequired;
}
