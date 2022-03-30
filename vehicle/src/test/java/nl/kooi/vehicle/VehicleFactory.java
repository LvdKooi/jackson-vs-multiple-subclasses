package nl.kooi.vehicle;

import nl.kooi.vehicle.api.dto.BusDto;
import nl.kooi.vehicle.api.dto.CarDto;
import nl.kooi.vehicle.api.dto.VehicleDto;
import nl.kooi.vehicle.api.dto.WatercraftDto;
import nl.kooi.vehicle.entity.Bus;
import nl.kooi.vehicle.entity.Car;
import nl.kooi.vehicle.entity.Vehicle;
import nl.kooi.vehicle.entity.Watercraft;
import nl.kooi.vehicle.enums.BodyStyle;
import nl.kooi.vehicle.enums.BusType;
import nl.kooi.vehicle.enums.FuelType;
import nl.kooi.vehicle.enums.VehicleType;

import static nl.kooi.vehicle.enums.VehicleType.*;
import static nl.kooi.vehicle.enums.WatercraftType.SPEED_BOAT;

public class VehicleFactory {

    public static Vehicle getVehicle(VehicleType type) {

        if (type != null) {
            switch (type) {
                case BUS:
                    return getBus();
                case CAR:
                    return getCar();
                case WATERCRAFT:
                    return getWatercraft();
                default:
                    throw new IllegalArgumentException(type.name() + " is not yet implemented.");
            }
        }

        return null;
    }

    public static VehicleDto getVehicleDto(VehicleType type) {
        if (type != null) {
            switch (type) {
                case BUS:
                    return getBusDto();
                case CAR:
                    return getCarDto();
                case WATERCRAFT:
                    return getWatercraftDto();
                default:
                    throw new IllegalArgumentException(type.name() + " is not yet implemented.");
            }
        }

        return null;
    }

    private static Vehicle getWatercraft() {
        var watercraft = new Watercraft();
        setBasicVehicleFields(WATERCRAFT, watercraft);
        watercraft.setWatercraftType(SPEED_BOAT);
        watercraft.setDraftMeters(2);
        watercraft.setLengthMeters(12);
        return watercraft;
    }

    private static VehicleDto getWatercraftDto() {
        var watercraft = new WatercraftDto();
        setBasicVehicleFields(WATERCRAFT, watercraft);
        watercraft.setWatercraftType(SPEED_BOAT);
        watercraft.setDraftMeters(2);
        watercraft.setLengthMeters(12);
        return watercraft;
    }

    private static Car getCar() {
        var car = new Car();
        setBasicVehicleFields(CAR, car);
        car.setNumberOfDoors(4);
        car.setBodyStyle(BodyStyle.HATCHBACK);
        car.setLicensePlate("1-TST-5");
        return car;
    }

    private static CarDto getCarDto() {
        var car = new CarDto();
        setBasicVehicleFields(CAR, car);
        car.setNumberOfDoors(4);
        car.setBodyStyle(BodyStyle.HATCHBACK);
        car.setLicensePlate("1-TST-5");
        return car;
    }

    private static Bus getBus() {
        var bus = new Bus();
        setBasicVehicleFields(BUS, bus);
        bus.setBusType(BusType.COACH);
        bus.setLitersLuggageCapacity(50000);
        bus.setFuelType(FuelType.DIESEL);
        bus.setHorsePower(1000);
        return bus;
    }

    private static BusDto getBusDto() {
        var bus = new BusDto();
        setBasicVehicleFields(BUS, bus);
        bus.setBusType(BusType.COACH);
        bus.setLitersLuggageCapacity(50000);
        bus.setFuelType(FuelType.DIESEL);
        bus.setHorsePower(1000);
        return bus;
    }

    private static void setBasicVehicleFields(VehicleType vehicleType, Vehicle vehicle) {
        vehicle.setVehicleType(vehicleType);
        vehicle.setId(1L);
        vehicle.setBrand(String.format("%s-brand", vehicleType.name()));
        vehicle.setModel(String.format("%s-model", vehicleType.name()));
    }

    private static void setBasicVehicleFields(VehicleType vehicleType, VehicleDto vehicle) {
        vehicle.setVehicleType(vehicleType);
        vehicle.setId(1L);
        vehicle.setBrand(String.format("%s-brand", vehicleType.name()));
        vehicle.setModel(String.format("%s-model", vehicleType.name()));
    }
}
