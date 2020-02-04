package com.yash.pta.repository;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.yash.pta.model.Questions;

@Repository
public interface QuestionRepository extends JpaRepository<Questions, Integer> {

	  @Query(value= "Select * from Questions where technology_Id = ?1", nativeQuery= true)
	public List<Questions> getQuesByTechID(int id);
		

	
}
