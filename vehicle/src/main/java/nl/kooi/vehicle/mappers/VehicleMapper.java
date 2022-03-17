package nl.kooi.vehicle.mappers;

import nl.kooi.vehicle.api.dto.*;
import nl.kooi.vehicle.entity.*;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface VehicleMapper {


    default Vehicle map(VehicleDto dto) {
        if (dto instanceof CarDto) {
            return mapCar((CarDto) dto);
        }

        if (dto instanceof BusDto) {
            return mapBus((BusDto) dto);
        }

        if (dto instanceof MotorizedVehicleDto) {
            return mapMotorizedVehicle((MotorizedVehicleDto) dto);
        }

        if (dto instanceof WatercraftDto) {
            return mapWatercraft((WatercraftDto) dto);
        }

        return null;

    }

    default VehicleDto map(Vehicle vehicle) {
        if (vehicle instanceof Car) {
            return mapCarDto((Car) vehicle);
        }

        if (vehicle instanceof Bus) {
            return mapBusDto((Bus) vehicle);
        }

        if (vehicle instanceof MotorizedVehicle) {
            return mapMotorizedVehicleDto((MotorizedVehicle) vehicle);
        }

        if (vehicle instanceof Watercraft) {
            return mapWatercraftDto((Watercraft) vehicle);
        }

        return null;
    }

    MotorizedVehicle mapMotorizedVehicle(MotorizedVehicleDto dto);

    Bus mapBus(BusDto dto);

    Car mapCar(CarDto dto);

    Watercraft mapWatercraft(WatercraftDto dto);

    MotorizedVehicleDto mapMotorizedVehicleDto(MotorizedVehicle entity);

    BusDto mapBusDto(Bus entity);

    CarDto mapCarDto(Car entity);

    WatercraftDto mapWatercraftDto(Watercraft entity);
}
