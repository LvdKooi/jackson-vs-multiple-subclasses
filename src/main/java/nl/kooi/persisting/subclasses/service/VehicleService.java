package nl.kooi.persisting.subclasses.service;

import lombok.RequiredArgsConstructor;
import nl.kooi.persisting.subclasses.entity.VehicleEntity;
import nl.kooi.persisting.subclasses.infrastructure.VehicleJpaRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class VehicleService {
    private final VehicleJpaRepository repo;

    public VehicleEntity saveVehicle(VehicleEntity vehicle) {
        return repo.save(vehicle);
    }

    public Optional<VehicleEntity> getVehicleById(Long id) {
        return repo.findById(id);
    }
}
