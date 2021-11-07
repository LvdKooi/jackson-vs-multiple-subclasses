package nl.kooi.vehicle.api.dto;

import lombok.Data;

@Data
public class MotorizedVehicleDto extends VehicleDto {
    private String licensePlate;
    private Long horsePower;
    private String fuelType;
}
