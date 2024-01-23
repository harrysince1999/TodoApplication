package com.example.nikhil.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.example.nikhil.Model.Todo;
import com.example.nikhil.service.TodoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;




@RestController
public class Controller {
    @Autowired
    private TodoService service;    

    @GetMapping("/todos")
    public List<Todo> getTodos() {
        return service.getAllTodos();
    }
    
    @PostMapping("/todos")
    public boolean addTodo(@RequestBody Todo todo) {
        return service.saveOrUpdateTodo(todo);
    }
    
}
