package br.com.annainacio.desafiotodolist.repository;

import br.com.annainacio.desafiotodolist.entity.Todo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepository extends JpaRepository<Todo, Long> {
}
