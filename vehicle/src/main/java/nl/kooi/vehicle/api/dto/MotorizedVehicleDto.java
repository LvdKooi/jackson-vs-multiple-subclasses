package nl.kooi.vehicle.api.dto;

import lombok.Data;
import nl.kooi.vehicle.enums.FuelType;

@Data
public class MotorizedVehicleDto extends VehicleDto {
    private String licensePlate;
    private int horsePower;
    private FuelType fuelType;
}

