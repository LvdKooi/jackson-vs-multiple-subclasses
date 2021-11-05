package nl.kooi.persisting.subclasses.infrastructure;

import nl.kooi.persisting.subclasses.entity.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;


public interface VehicleJpaRepository extends JpaRepository<Vehicle, Long> {
}
