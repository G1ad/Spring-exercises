package co.develhope.springdevelhope.repositories;

import co.develhope.springdevelhope.entities.Flight;
import co.develhope.springdevelhope.entities.Status;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface FlightRepository extends JpaRepository<Flight,Integer> {

    List<Flight> findByStatus(Status status);

    @Query(value = "SELECT flight FROM Flight flight WHERE flight.status = :p1 OR flight.status = :p2")
    List<Flight> getCustom(@Param("p1")Status p1, @Param("p2")Status p2);
}
