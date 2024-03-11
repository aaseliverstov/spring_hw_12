package taskmanagement.service;
import taskmanagement.domen.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Facade {
    private final ServiceInt Service;

    @Autowired
    public Facade(ServiceInt Service) {
        this.Service = Service;
    }

    public Task createTask(String name, String description, Long priority) {
        Task task = new Task();
        task.setName(name);
        task.setDescription(description);
        task.setPriority(priority);
        return Service.createTask(task);
    }
}
