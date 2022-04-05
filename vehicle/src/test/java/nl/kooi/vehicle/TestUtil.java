package nl.kooi.vehicle;

import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

import static nl.kooi.vehicle.VehicleFactory.getVehicle;
import static nl.kooi.vehicle.VehicleFactory.getVehicleDto;
import static nl.kooi.vehicle.enums.VehicleType.*;

public class TestUtil {

    public static Stream<Arguments> getStreamAllVehicleTypes() {
        return Stream.of(
                Arguments.of(getVehicle(CAR), getVehicleDto(CAR), nl.kooi.vehicle.api.dto.CarDto.class),
                Arguments.of(getVehicle(BUS), getVehicleDto(BUS), nl.kooi.vehicle.api.dto.BusDto.class),
                Arguments.of(getVehicle(WATERCRAFT), getVehicleDto(WATERCRAFT), nl.kooi.vehicle.api.dto.WatercraftDto.class)
        );
    }

}
