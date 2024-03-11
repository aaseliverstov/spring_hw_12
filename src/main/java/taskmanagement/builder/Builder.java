package taskmanagement.builder;

import taskmanagement.domen.Task;

public class Builder {
    private final Task task;

    public Builder() {
        this.task = new Task();
    }

    public Builder setName(String name) {
        task.setName(name);
        return this;
    }

    public Builder setDescription(String description) {
        task.setDescription(description);
        return this;
    }

    public Builder setPriority(Long priority) {
        task.setPriority(priority);
        return this;
    }

    public Task build() {
        return task;
    }
}
