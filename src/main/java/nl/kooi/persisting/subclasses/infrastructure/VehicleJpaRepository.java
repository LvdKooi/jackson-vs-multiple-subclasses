package nl.kooi.persisting.subclasses.infrastructure;

import nl.kooi.persisting.subclasses.entity.VehicleEntity;
import org.springframework.data.jpa.repository.JpaRepository;


public interface VehicleJpaRepository extends JpaRepository<VehicleEntity, Long> {
}
