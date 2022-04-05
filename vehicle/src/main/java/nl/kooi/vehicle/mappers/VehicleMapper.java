package nl.kooi.vehicle.mappers;

import nl.kooi.vehicle.entity.*;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface VehicleMapper {


    default Vehicle map(nl.kooi.vehicle.api.dto.VehicleDto dto) {
        if (dto instanceof nl.kooi.vehicle.api.dto.CarDto) {
            return mapCar((nl.kooi.vehicle.api.dto.CarDto) dto);
        }

        if (dto instanceof nl.kooi.vehicle.api.dto.BusDto) {
            return mapBus((nl.kooi.vehicle.api.dto.BusDto) dto);
        }

        if (dto instanceof nl.kooi.vehicle.api.dto.WatercraftDto) {
            return mapWatercraft((nl.kooi.vehicle.api.dto.WatercraftDto) dto);
        }

        return null;

    }

    default nl.kooi.vehicle.api.dto.VehicleDto map(Vehicle vehicle) {
        if (vehicle instanceof Car) {
            return mapCarDto((Car) vehicle);
        }

        if (vehicle instanceof Bus) {
            return mapBusDto((Bus) vehicle);
        }

        if (vehicle instanceof Watercraft) {
            return mapWatercraftDto((Watercraft) vehicle);
        }

        return null;
    }

    Bus mapBus(nl.kooi.vehicle.api.dto.BusDto dto);

    Car mapCar(nl.kooi.vehicle.api.dto.CarDto dto);

    Watercraft mapWatercraft(nl.kooi.vehicle.api.dto.WatercraftDto dto);

    nl.kooi.vehicle.api.dto.BusDto mapBusDto(Bus entity);

    nl.kooi.vehicle.api.dto.CarDto mapCarDto(Car entity);

    nl.kooi.vehicle.api.dto.WatercraftDto mapWatercraftDto(Watercraft entity);
}
