package guru.springframework.springrecipeapp.repositories;

import guru.springframework.springrecipeapp.domain.UnitOfMeasurement;
import org.springframework.data.repository.CrudRepository;

public interface UnitOfMeasurementRepository extends CrudRepository<UnitOfMeasurement, Long> {
}
