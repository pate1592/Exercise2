package ca.sheridan.pate1592.exercise2.repository;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepositoryJpa extends JpaRepository<ControllerEntity,Integer> {

}
