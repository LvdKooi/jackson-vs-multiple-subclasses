package nl.kooi.persisting.subclasses.Mappers;

import nl.kooi.persisting.subclasses.api.dto.CarDto;
import nl.kooi.persisting.subclasses.api.dto.MotorCycleDto;
import nl.kooi.persisting.subclasses.api.dto.MotorizedVehicleDto;
import nl.kooi.persisting.subclasses.api.dto.VehicleDto;
import nl.kooi.persisting.subclasses.entity.Car;
import nl.kooi.persisting.subclasses.entity.MotorCycle;
import nl.kooi.persisting.subclasses.entity.MotorizedVehicle;
import nl.kooi.persisting.subclasses.entity.Vehicle;
import org.mapstruct.BeforeMapping;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.TargetType;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface VehicleMapper {

    @BeforeMapping
    default void mapVehicleBefore(VehicleDto dto, @TargetType Vehicle vehicle) {

        if (dto instanceof MotorizedVehicleDto) {
            ((MotorizedVehicle) vehicle).setFuelType(((MotorizedVehicleDto) dto).getFuelType());
            ((MotorizedVehicle) vehicle).setHorsePower(((MotorizedVehicleDto) dto).getHorsePower());
            ((MotorizedVehicle) vehicle).setLicensePlate(((MotorizedVehicleDto) dto).getLicensePlate());

        }

        if (dto instanceof CarDto) {
            ((Car) vehicle).setBodyType(((CarDto) dto).getBodyType());
            ((Car) vehicle).setNumberOfDoors(((CarDto) dto).getNumberOfDoors());

        }

        if (dto instanceof MotorCycleDto) {
            ((MotorCycle) vehicle).setHelmetRequired(((MotorCycleDto) dto).isHelmetRequired());
            ((MotorCycle) vehicle).setNumberOfWheels(((MotorCycleDto) dto).getNumberOfWheels());
        }
    }

    @BeforeMapping
    default void mapDtoBefore(Vehicle vehicle, @TargetType VehicleDto dto) {

        if (vehicle instanceof MotorizedVehicle) {
            ((MotorizedVehicleDto) dto).setFuelType(((MotorizedVehicle) vehicle).getFuelType());
            ((MotorizedVehicleDto) dto).setHorsePower(((MotorizedVehicle) vehicle).getHorsePower());
            ((MotorizedVehicleDto) dto).setLicensePlate(((MotorizedVehicle) vehicle).getLicensePlate());

        }

        if (vehicle instanceof Car) {
            ((CarDto) dto).setBodyType(((Car) vehicle).getBodyType());
            ((CarDto) dto).setNumberOfDoors(((Car) vehicle).getNumberOfDoors());

        }

        if (vehicle instanceof MotorCycle) {
            ((MotorCycleDto) dto).setHelmetRequired(((MotorCycle) vehicle).isHelmetRequired());
            ((MotorCycleDto) dto).setNumberOfWheels(((MotorCycle) vehicle).getNumberOfWheels());
        }
    }

    Vehicle map(VehicleDto dto);

    VehicleDto map(Vehicle entity);
}
