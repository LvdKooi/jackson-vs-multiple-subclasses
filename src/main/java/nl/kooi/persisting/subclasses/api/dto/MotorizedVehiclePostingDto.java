package nl.kooi.persisting.subclasses.api.dto;

import lombok.Data;
import lombok.ToString;

@Data
@ToString(callSuper = true)
public class MotorizedVehiclePostingDto extends VehiclePostingDto{
    private Long horsePower;
    private String fuelType;
}
