package nl.kooi.vehicle;

import nl.kooi.vehicle.api.dto.BusDto;
import nl.kooi.vehicle.api.dto.CarDto;
import nl.kooi.vehicle.api.dto.WatercraftDto;
import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

import static nl.kooi.vehicle.VehicleFactory.getVehicle;
import static nl.kooi.vehicle.VehicleFactory.getVehicleDto;
import static nl.kooi.vehicle.enums.VehicleType.*;

public class TestUtil {

    public static Stream<Arguments> getStreamAllVehicleTypes() {
        return Stream.of(
                Arguments.of(getVehicle(CAR), getVehicleDto(CAR), CarDto.class),
                Arguments.of(getVehicle(BUS), getVehicleDto(BUS), BusDto.class),
                Arguments.of(getVehicle(WATERCRAFT), getVehicleDto(WATERCRAFT), WatercraftDto.class)
        );
    }

}
