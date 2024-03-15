package br.com.annainacio.desafiotodolist.service;

import br.com.annainacio.desafiotodolist.entity.Todo;
import br.com.annainacio.desafiotodolist.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoService {
    @Autowired
    private TodoRepository repository;

//    public TodoService(TodoRepository todoRepository) {
//        this.todoRepository = todoRepository;
//    }


    public List<Todo> create(Todo todo) {
        repository.save(todo);
        return list();
    }

    public List<Todo> list() {
        Sort sort = Sort.by("prioridade").descending().and(
                Sort.by("nome").ascending()
        );
       return repository.findAll(sort);
    }

    public List<Todo> update(Todo todo) {
        repository.save(todo);
        return list();
    }

    public List<Todo> delete(Long id) {
        repository.deleteById(id);
        return list();
    }
}
