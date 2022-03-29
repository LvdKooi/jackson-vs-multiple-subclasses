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
        return mapper.map(service.saveVehicle(mapper.map(dto)));
    }

    @GetMapping
    public List<VehicleDto> getAllVehicles() {
        return service.getVehicles()
                .stream()
                .map(mapper::map)
                .collect(Collectors.toList());
    }
}
