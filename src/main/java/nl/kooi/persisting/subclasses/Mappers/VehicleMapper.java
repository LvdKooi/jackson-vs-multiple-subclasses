package nl.kooi.persisting.subclasses.Mappers;

import nl.kooi.persisting.subclasses.api.dto.VehicleDto;
import nl.kooi.persisting.subclasses.entity.VehicleEntity;
import org.mapstruct.Mapper;

@Mapper
public interface VehicleMapper {

    VehicleEntity map(VehicleDto dto);

    VehicleDto map(VehicleEntity entity);
}
