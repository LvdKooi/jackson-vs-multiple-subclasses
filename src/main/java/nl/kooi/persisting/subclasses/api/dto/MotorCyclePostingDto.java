package nl.kooi.persisting.subclasses.api.dto;

import lombok.Data;
import lombok.ToString;

@Data
@ToString(callSuper = true)
public class MotorCyclePostingDto extends MotorizedVehiclePostingDto {
    private int numberOfWheels;
    private boolean helmetRequired;
}
