package nl.kooi.persisting.subclasses.Mappers;

import nl.kooi.persisting.subclasses.api.dto.CarDto;
import nl.kooi.persisting.subclasses.api.dto.MotorCycleDto;
import nl.kooi.persisting.subclasses.api.dto.MotorizedVehicleDto;
import nl.kooi.persisting.subclasses.api.dto.VehicleDto;
import nl.kooi.persisting.subclasses.entity.Car;
import nl.kooi.persisting.subclasses.entity.MotorCycle;
import nl.kooi.persisting.subclasses.entity.MotorizedVehicle;
import nl.kooi.persisting.subclasses.entity.Vehicle;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface VehicleMapper {


    default Vehicle map(VehicleDto dto) {
        if (dto instanceof CarDto) {
            return mapCar((CarDto) dto);
        }

        if (dto instanceof MotorCycleDto) {
            return mapMotorCycle((MotorCycleDto) dto);
        }

        if (dto instanceof MotorizedVehicleDto) {
            return mapMotorizedVehicle((MotorizedVehicleDto) dto);
        }

        return null;

    }

    default VehicleDto map(Vehicle vehicle) {
        if (vehicle instanceof Car) {
            return mapCarDto((Car) vehicle);
        }

        if (vehicle instanceof MotorCycle) {
            return mapMotorCycleDto((MotorCycle) vehicle);
        }

        if (vehicle instanceof MotorizedVehicle) {
            return mapMotorizedVehicleDto((MotorizedVehicle) vehicle);
        }

        return null;
    }

    MotorizedVehicle mapMotorizedVehicle(MotorizedVehicleDto dto);

    MotorCycle mapMotorCycle(MotorCycleDto dto);

    Car mapCar(CarDto dto);

    MotorizedVehicleDto mapMotorizedVehicleDto(MotorizedVehicle entity);

    MotorCycleDto mapMotorCycleDto(MotorCycle entity);

    CarDto mapCarDto(Car entity);

}
