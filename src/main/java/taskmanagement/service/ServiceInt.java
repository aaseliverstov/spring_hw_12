package taskmanagement.service;

import taskmanagement.domen.Task;
import java.util.List;

public interface ServiceInt {

    List<Task> getAllTasks();

    Task createTask(Task task);

    Task getTaskById(Long id);

    Task updateTask(Long id, Task task);

    void deleteTask(Long id);

    void addTask(Task task);
}
