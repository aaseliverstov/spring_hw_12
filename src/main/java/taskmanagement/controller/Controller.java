package taskmanagement.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import taskmanagement.domen.Task;
import taskmanagement.service.ServiceInt;

@RestController
public class Controller {

    private final ServiceInt service;

    @Autowired
    public Controller(ServiceInt service) {
        this.service = service;
    }

    @GetMapping("/tasks")
    public List<Task> getAllTasks() {
        return service.getAllTasks();
    }

    @PostMapping("/tasks")
    public void createTask(@RequestBody Task task) {
        service.addTask(task);
    }
}