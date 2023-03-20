package com.project.security.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.security.domain.Room;



@Repository
public interface RoomRepository extends JpaRepository <Room, Long> { 
	
	  @Override
	   Optional<Room> findById(Long roomId);
	  //Optional<Room> findById(Long roomId);
	  
	  

}