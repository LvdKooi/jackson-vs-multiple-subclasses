package nl.kooi.persisting.subclasses.api;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import nl.kooi.persisting.subclasses.Mappers.VehicleMapper;
import nl.kooi.persisting.subclasses.api.dto.VehicleDto;
import nl.kooi.persisting.subclasses.exception.NotFoundException;
import nl.kooi.persisting.subclasses.service.VehicleService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/vehicle")
@RequiredArgsConstructor
@Slf4j
public class VehicleController {
    private final VehicleService service;
    private final VehicleMapper mapper;

    @PostMapping
    @ResponseStatus(value = HttpStatus.OK)
    public VehicleDto postVehicle(@RequestBody VehicleDto posting) {
        return mapper.map(service.saveVehicle(mapper.map(posting)));
    }

    @GetMapping("/{id}")
    public VehicleDto getVehicle(Long id) {
        return service.getVehicleById(id)
                .map(mapper::map)
                .orElseThrow(() -> new NotFoundException(String.format("Vehicle with id %d not found.", id)));
    }
}
