package nl.kooi.persisting.subclasses.api.dto;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import lombok.Data;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "type")
@JsonSubTypes({
        @JsonSubTypes.Type(value = CarDto.class, name = "Car"),
        @JsonSubTypes.Type(value = MotorCycleDto.class, name = "MotorCycle"),
        @JsonSubTypes.Type(value = VehicleDto.class, name = "Vehicle"),
})
@Data
public class VehicleDto {
    private Long id;
    private String model;
    private String title;
    private String color;
    private String brand;
    private String condition;
}
