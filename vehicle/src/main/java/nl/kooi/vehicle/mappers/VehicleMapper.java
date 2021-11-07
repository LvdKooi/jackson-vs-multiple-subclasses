package nl.kooi.vehicle.mappers;

import nl.kooi.vehicle.api.dto.CarDto;
import nl.kooi.vehicle.api.dto.MotorCycleDto;
import nl.kooi.vehicle.api.dto.MotorizedVehicleDto;
import nl.kooi.vehicle.api.dto.VehicleDto;
import nl.kooi.vehicle.entity.Car;
import nl.kooi.vehicle.entity.MotorCycle;
import nl.kooi.vehicle.entity.MotorizedVehicle;
import nl.kooi.vehicle.entity.Vehicle;
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
