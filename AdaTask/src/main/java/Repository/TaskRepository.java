package Repository;

import Domain.BaseTask;
import java.util.ArrayList;
import java.util.List;

public class TaskRepository <T extends BaseTask> {
    private List<T> tasks;

    //constructor:
    public TaskRepository() {
        this.tasks = new ArrayList<>();
    }

    public void addTask(T task) {
        this.tasks.add(task);
    }

    public void removeTask(T task) {
        this.tasks.remove(task);
    }

    public List<T> getAllTasks() {
        return this.tasks;
    }
}
