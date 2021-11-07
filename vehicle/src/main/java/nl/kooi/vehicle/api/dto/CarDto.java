package nl.kooi.vehicle.api.dto;

import lombok.Data;

@Data
public class CarDto extends MotorizedVehicleDto {
    private int numberOfDoors;
    private String bodyType;
}
