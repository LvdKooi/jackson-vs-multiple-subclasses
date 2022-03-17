package nl.kooi.vehicle.api.dto;

import lombok.Data;
import nl.kooi.vehicle.enums.BusType;

@Data
public class BusDto extends MotorizedVehicleDto {
    private BusType busType;
    private int litersLuggageCapacity;
}
