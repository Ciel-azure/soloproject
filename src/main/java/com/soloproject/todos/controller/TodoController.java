package com.soloproject.todos.controller;


import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
public class TodoController {

    @GetMapping("/")
    public String helloWorld() {
        return "To-do Application !";
    }

}
