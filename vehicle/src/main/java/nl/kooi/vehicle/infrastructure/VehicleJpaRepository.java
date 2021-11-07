package nl.kooi.vehicle.infrastructure;

import nl.kooi.vehicle.entity.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;


public interface VehicleJpaRepository extends JpaRepository<Vehicle, Long> {
}
