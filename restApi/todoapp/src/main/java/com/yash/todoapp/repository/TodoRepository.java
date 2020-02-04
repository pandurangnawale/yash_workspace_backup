package com.yash.todoapp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.yash.todoapp.model.Todo;
@Repository
public interface TodoRepository extends JpaRepository<Todo, Long>{
	List<Todo>findByusername(String username);
}
