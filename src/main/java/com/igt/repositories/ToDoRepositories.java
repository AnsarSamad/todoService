package com.igt.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.igt.entity.ToDo;

@Repository
public interface ToDoRepositories extends CrudRepository<ToDo, Long> {

}
