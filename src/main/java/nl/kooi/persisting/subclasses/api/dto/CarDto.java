package nl.kooi.persisting.subclasses.api.dto;

import lombok.Value;

@Value
public class CarDto extends MotorizedVehicleDto {
    private Long numberOfDoors;
    private String bodyType;
}
