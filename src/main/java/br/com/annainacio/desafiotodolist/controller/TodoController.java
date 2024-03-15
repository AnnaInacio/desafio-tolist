package br.com.annainacio.desafiotodolist.controller;

import br.com.annainacio.desafiotodolist.entity.Todo;
import br.com.annainacio.desafiotodolist.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/todos")
public class TodoController {

    @Autowired
    private TodoService service;

//    public TodoController(TodoService service) {
//        this.service = service;
//    }

    @PostMapping
    List<Todo> create(@RequestBody Todo todo) {
        return service.create(todo);
    }

    @GetMapping
    List<Todo> list() {
        return service.list();
    }

    @PutMapping("{id}")
    List<Todo> update(
//            @PathVariable Long id,
            @RequestBody Todo todo) {
        return service.update(todo);
    }

    @DeleteMapping("{id}")
    List<Todo> delete(@PathVariable Long id) {
        return service.delete(id);
    }
}
