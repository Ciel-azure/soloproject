package com.soloproject.todos.controller;


import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/todos")
@Validated
@Slf4j
public class TodoController {

    @PostMapping
    public ResponseEntity postTodo() {
        return null;
    }

    @PatchMapping
    public ResponseEntity patchTodo() {
        return null;
    }

    @GetMapping("/{todo-id}")
    public ResponseEntity getTodo() {
        return null;
    }

    @GetMapping
    public ResponseEntity getTodos() {
        return null;
    }

    @DeleteMapping("/{todo-id}")
    public ResponseEntity deleteTodo() {
        return null;
    }

    @DeleteMapping
    public ResponseEntity deleteTodos() {
        return null;
    }

}
