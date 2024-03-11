package taskmanagement.service;

import taskmanagement.domen.Task;
import java.util.ArrayList;
import java.util.List;

@org.springframework.stereotype.Service
public class Service implements ServiceInt {

    private final List<Task> tasks = new ArrayList<>();

    @Override
    public List<Task> getAllTasks() {
        return tasks;
    }

    @Override
    public Task createTask(Task task) {
        return null;
    }

    @Override
    public Task getTaskById(Long id) {
        return null;
    }

    @Override
    public Task updateTask(Long id, Task task) {
        return null;
    }

    @Override
    public void deleteTask(Long id) {

    }

    @Override
    public void addTask(Task task) {
        tasks.add(task);
    }
}
