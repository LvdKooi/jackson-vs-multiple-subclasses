package nl.kooi.vehicle.api;

import lombok.RequiredArgsConstructor;
import nl.kooi.vehicle.api.dto.VehicleDto;
import nl.kooi.vehicle.mappers.VehicleMapper;
import nl.kooi.vehicle.service.VehicleService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@RestController
public class VehicleController implements nl.kooi.vehicle.api.VehicleApi {
    private final VehicleService service;
    private final VehicleMapper mapper;

    @Override
    public ResponseEntity<VehicleDto> postVehicle(@RequestBody VehicleDto dto) {
        return ResponseEntity.ok(mapper.map(service.saveVehicle(mapper.map(dto))));
    }

    @Override
    public ResponseEntity<List<VehicleDto>> getAllVehicles() {
        return ResponseEntity.ok(service.getVehicles()
                .stream()
                .map(mapper::map)
                .collect(Collectors.toList()));
    }
}
