package com.team4.catalogbackend.controller;

import com.team4.catalogbackend.model.Task;
import com.team4.catalogbackend.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/service/{groupId}/tasks")
public class TaskController {

    private final TaskService taskService;

    @Autowired
    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    @GetMapping("getall/")
    public List<Task> getAllTasks() {
        return taskService.getAllTasks();
    }

    @GetMapping("get/{id}")
    public Task getTaskById(@PathVariable Long id) {
        return taskService.getTaskById(id);
    }

    @PostMapping("/save")
    public Task saveTask(@RequestBody Task task) {
        return taskService.saveTask(task);
    }

    @DeleteMapping("delete/{id}")
    public void deleteTask(@PathVariable Long id) {
        taskService.deleteTask(id);
    }
    
    @GetMapping("getallactive/")
    public List<Object[]> getAllActiveTask() {
    	return taskService.getAllActiveTask();
    }
    
    
}
