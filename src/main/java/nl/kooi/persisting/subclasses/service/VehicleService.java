package nl.kooi.persisting.subclasses.service;

import lombok.RequiredArgsConstructor;
import nl.kooi.persisting.subclasses.entity.Vehicle;
import nl.kooi.persisting.subclasses.infrastructure.VehicleJpaRepository;
import org.springframework.stereotype.Service;

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
}
