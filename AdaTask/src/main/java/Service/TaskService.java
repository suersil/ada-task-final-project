package Service;

import Domain.BaseTask;
import Repository.TaskRepository;

import java.util.List;
import java.util.Scanner;

public class TaskService<T extends BaseTask> {

    //Atributo
    private TaskRepository<T> taskRepository;

    //Construtor
    public TaskService(TaskRepository<T> taskRepository) {
        this.taskRepository = taskRepository;
    }

    //Metodos
    public void createTask(T task) {
        taskRepository.addTask(task);
    }

    //Irá apagar a antiga e adicionar uma nova
    public void editTask(T oldTask, T newTask) {
        taskRepository.removeTask(oldTask);
        taskRepository.addTask(newTask);
    }

    public void deleteTask(T task) {
        taskRepository.removeTask(task);
    }

    public List<T> viewAllTasks() {
        return taskRepository.getAllTasks();
    }
}


