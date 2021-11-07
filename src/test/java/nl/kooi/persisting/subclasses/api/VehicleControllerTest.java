package nl.kooi.persisting.subclasses.api;

import com.fasterxml.jackson.databind.ObjectMapper;
import nl.kooi.persisting.subclasses.api.dto.CarDto;
import nl.kooi.persisting.subclasses.api.dto.VehicleDto;
import nl.kooi.persisting.subclasses.entity.Car;
import nl.kooi.persisting.subclasses.entity.Vehicle;
import nl.kooi.persisting.subclasses.enums.VehicleType;
import nl.kooi.persisting.subclasses.mappers.VehicleMapperImpl;
import nl.kooi.persisting.subclasses.service.VehicleService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.Import;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(VehicleController.class)
@Import(VehicleMapperImpl.class)
class VehicleControllerTest {
    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private ObjectMapper objectMapper;

    @MockBean
    private VehicleService service;

    @Test
    void postVehicle() throws Exception {
        when(service.saveVehicle(any(Vehicle.class))).thenReturn(getCar());

        var mvcResult = mockMvc.perform(post("/vehicle")
                .contentType(MediaType.APPLICATION_JSON).content(objectMapper.writeValueAsString(getCarDto())))
                .andExpect(status().isOk())
                .andExpect(content().contentTypeCompatibleWith(MediaType.APPLICATION_JSON))
                .andReturn()
                .getResponse();

        var response = objectMapper.readValue(mvcResult.getContentAsString(), VehicleDto.class);

        assertThat(response).isInstanceOf(CarDto.class);
    }


    private Car getCar() {
        var car = new Car();
        car.setVehicleType(VehicleType.CAR);
        car.setId(1L);
        car.setNumberOfDoors(4);
        car.setBodyType("Hatchback");
        car.setBrand("Volkswagen");
        car.setLicensePlate("1-TST-5");
        car.setModel("Golf");
        return car;
    }

    private CarDto getCarDto() {
        var car = new CarDto();
        car.setVehicleType(VehicleType.CAR);
        car.setNumberOfDoors(4);
        car.setBodyType("Hatchback");
        car.setBrand("Volkswagen");
        car.setLicensePlate("1-TST-5");
        car.setModel("Golf");
        return car;
    }

}