package nl.kooi.vehicle.api.dto;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import lombok.Data;
import lombok.ToString;
import nl.kooi.vehicle.enums.VehicleType;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.EXISTING_PROPERTY,
        property = "vehicleType",
        visible = true)
@JsonSubTypes({
        @JsonSubTypes.Type(value = CarDto.class, name = "CAR"),
        @JsonSubTypes.Type(value = MotorCycleDto.class, name = "MOTOR_CYCLE"),
        @JsonSubTypes.Type(value = VehicleDto.class, name = "VEHICLE"),
})
@Data
@ToString
public class VehicleDto {
    private Long id;
    private VehicleType vehicleType;
    private String model;
    private String color;
    private String brand;
    private String condition;
}
