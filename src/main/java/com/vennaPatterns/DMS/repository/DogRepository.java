package com.vennaPatterns.DMS.repository;

//import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.vennaPatterns.DMS.Models.Dog;

@Repository
public interface DogRepository extends CrudRepository<Dog,Integer>{

}
