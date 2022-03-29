package nl.kooi.vehicle.api;

import com.fasterxml.jackson.databind.ObjectMapper;
import nl.kooi.vehicle.api.dto.VehicleDto;
import nl.kooi.vehicle.entity.Vehicle;
import nl.kooi.vehicle.mappers.VehicleMapperImpl;
import nl.kooi.vehicle.service.VehicleService;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
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

    @ParameterizedTest(name = "#{index} with [{arguments}]")
    @MethodSource("nl.kooi.vehicle.TestUtil#getStreamAllVehicleTypes")
    void postVehicle(Vehicle vehicle, VehicleDto dto, Class<? extends VehicleDto> expectedDtoClass) throws Exception {
        when(service.saveVehicle(any(Vehicle.class))).thenReturn(vehicle);

        var mvcResult = mockMvc.perform(post("/vehicles")
                        .contentType(MediaType.APPLICATION_JSON).content(objectMapper.writeValueAsString(dto)))
                .andExpect(status().isOk())
                .andExpect(content().contentTypeCompatibleWith(MediaType.APPLICATION_JSON))
                .andReturn()
                .getResponse();

        var response = objectMapper.readValue(mvcResult.getContentAsString(), VehicleDto.class);

        assertThat(response).isInstanceOf(expectedDtoClass);
    }
}