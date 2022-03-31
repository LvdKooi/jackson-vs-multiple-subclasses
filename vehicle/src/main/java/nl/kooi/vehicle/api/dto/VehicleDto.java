package nl.kooi.vehicle.api.dto;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import lombok.Data;
import nl.kooi.vehicle.enums.VehicleType;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.EXISTING_PROPERTY,
        property = "vehicleType",
        visible = true)
@JsonSubTypes({
        @JsonSubTypes.Type(value = BusDto.class, name = "BUS"),
        @JsonSubTypes.Type(value = CarDto.class, name = "CAR"),
        @JsonSubTypes.Type(value = WatercraftDto.class, name = "WATERCRAFT")
})
@Data
public abstract class VehicleDto {
    private Long id;
    private VehicleType vehicleType;
    private String brand;
    private String model;
}
