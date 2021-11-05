package nl.kooi.persisting.subclasses.Mappers;

import nl.kooi.persisting.subclasses.api.dto.VehicleDto;
import nl.kooi.persisting.subclasses.entity.Vehicle;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface VehicleMapper {

    Vehicle map(VehicleDto dto);

    VehicleDto map(Vehicle entity);
}
