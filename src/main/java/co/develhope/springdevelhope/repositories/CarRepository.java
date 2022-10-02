package co.develhope.springdevelhope.repositories;

import co.develhope.springdevelhope.entities.Car;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface CarRepository extends JpaRepository <Car,Long> {
}
