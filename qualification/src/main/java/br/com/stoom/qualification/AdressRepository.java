package br.com.stoom.qualification;

import br.com.stoom.qualification.model.Adress;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface AdressRepository extends JpaRepository<Adress, Long> { 
	
}
