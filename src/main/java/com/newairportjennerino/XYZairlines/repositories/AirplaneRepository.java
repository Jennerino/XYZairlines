package com.newairportjennerino.XYZairlines.repositories;


import com.newairportjennerino.XYZairlines.model.Airplane;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AirplaneRepository extends JpaRepository<Airplane, String> {

}
