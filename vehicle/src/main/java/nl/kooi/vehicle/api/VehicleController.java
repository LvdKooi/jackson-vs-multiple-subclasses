package nl.kooi.vehicle.api;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import nl.kooi.vehicle.api.dto.VehicleDto;
import nl.kooi.vehicle.exception.NotFoundException;
import nl.kooi.vehicle.mappers.VehicleMapper;
import nl.kooi.vehicle.service.VehicleService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/vehicle")
@RequiredArgsConstructor
@Slf4j
public class VehicleController {
    private final VehicleService service;
    private final VehicleMapper mapper;

    @PostMapping
    public VehicleDto postVehicle(@RequestBody VehicleDto posting) {
        return mapper.map(service.saveVehicle(mapper.map(posting)));
    }

    @GetMapping
    public List<VehicleDto> getAllVehicles() {
        return service.getVehicles()
                .stream()
                .map(mapper::map)
                .collect(Collectors.toList());
    }

    @GetMapping("/{id}")
    public VehicleDto getVehicle(Long id) {
        return service.getVehicleById(id)
                .map(mapper::map)
                .orElseThrow(() -> new NotFoundException(String.format("Vehicle with id %d not found.", id)));
    }
}
