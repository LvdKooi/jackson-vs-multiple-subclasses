package nl.kooi.persisting.subclasses.api.dto;

import lombok.Data;
import lombok.ToString;

@Data
@ToString(callSuper = true)
public class CarPostingDto extends MotorizedVehiclePostingDto{
    private Long numberOfDoors;
    private String bodyType;
}
