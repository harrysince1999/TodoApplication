package com.example.nikhil.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.nikhil.Model.Todo;
import com.example.nikhil.repo.TodoRepo;

@Service
public class TodoService {
    
    @Autowired
    TodoRepo repo;

    public List<Todo> getAllTodos(){
        ArrayList<Todo> todoList = new ArrayList<Todo>();
        repo.findAll().forEach(todo -> todoList.add(todo));
        return todoList;
    }

    public Todo getTodoById(Long id){
        return repo.findById(id).get();
    }

    public boolean updateStatus(Long id){
        Todo todo = getTodoById(id);
        todo.setStatus("completed");
        return true;
    }

    public boolean saveOrUpdateTodo(Todo todo){
        Todo updatedObject = repo.save(todo);
        if(getTodoById(updatedObject.getId())!=null)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public boolean deleteTodoById(Long id){
        repo.deleteById(id);
        if(getTodoById(id)==null)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

}
