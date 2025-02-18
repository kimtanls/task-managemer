package com.example.task_management.repository;

import com.example.task_management.dto.TaskDto;
import com.example.task_management.entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {

    List<Task> findAllByTitle(String title);

    List<Task> findAllByUserId(Long id);
}
