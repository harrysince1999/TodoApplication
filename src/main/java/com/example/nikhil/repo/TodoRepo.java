package com.example.nikhil.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.nikhil.Model.Todo;

@Repository
public interface TodoRepo extends JpaRepository<Todo, Long>{
    
}
