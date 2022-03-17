package nl.kooi.vehicle.service;

import lombok.RequiredArgsConstructor;
import nl.kooi.vehicle.entity.Vehicle;
import nl.kooi.vehicle.infrastructure.VehicleJpaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class VehicleService {
    private final VehicleJpaRepository repo;

    public Vehicle saveVehicle(Vehicle vehicle) {
        return repo.save(vehicle);
    }

    public Optional<Vehicle> getVehicleById(Long id) {
        return repo.findById(id);
    }

    public List<Vehicle> getVehicles() {
        return repo.findAll();
    }
}
