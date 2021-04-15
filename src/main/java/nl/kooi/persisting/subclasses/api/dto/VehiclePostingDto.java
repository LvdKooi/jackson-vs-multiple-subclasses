package nl.kooi.persisting.subclasses.api.dto;

import lombok.Data;
import lombok.ToString;


@Data
@ToString(callSuper = true)
public class VehiclePostingDto extends PostingDto {
    private String model;
    private String licensePlate;
}
