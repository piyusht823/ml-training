package com.team4.catalogbackend.dao;

import com.team4.catalogbackend.model.Task;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface TaskRepository extends JpaRepository<Task, Long> {
	
	@Query("SELECT t.taskId, t.taskName FROM Task t where t.isEnabled = true")
    List<Object[]> findAllActiveTask();
}
