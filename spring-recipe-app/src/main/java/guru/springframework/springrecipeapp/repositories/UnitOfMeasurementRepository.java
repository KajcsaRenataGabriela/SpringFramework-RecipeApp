package guru.springframework.springrecipeapp.repositories;

import guru.springframework.springrecipeapp.domain.UnitOfMeasurement;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface UnitOfMeasurementRepository extends CrudRepository<UnitOfMeasurement, Long> {

    Optional<UnitOfMeasurement> findByDescription(String description);
}
