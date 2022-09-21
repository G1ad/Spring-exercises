package co.develhope.springdevelhope.repositories;

import co.develhope.springdevelhope.entities.CarEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarRepository extends JpaRepository <CarEntity,Long> {
}
