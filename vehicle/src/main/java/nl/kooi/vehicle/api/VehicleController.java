package nl.kooi.vehicle.api;

import lombok.RequiredArgsConstructor;
import nl.kooi.vehicle.api.dto.VehicleDto;
import nl.kooi.vehicle.mappers.VehicleMapper;
import nl.kooi.vehicle.service.VehicleService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/vehicles")
@RequiredArgsConstructor
public class VehicleController {
    private final VehicleService service;
    private final VehicleMapper mapper;

    @PostMapping
    public VehicleDto postVehicle(@RequestBody VehicleDto dto) {
        var vehicle = mapper.mapToVehicleEntity(dto);
        service.saveVehicle(vehicle);
        return mapper.mapToVehicleDto(vehicle);
    }

    @GetMapping
    public List<VehicleDto> getAllVehicles() {
        return service.getVehicles()
                .stream()
                .map(mapper::mapToVehicleDto)
                .collect(Collectors.toList());
    }
}
