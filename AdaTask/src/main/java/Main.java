
import Controller.TaskController;
import Domain.BaseTask;
import Repository.TaskRepository;
import Service.TaskService;


public class Main {
    public static void main(String[] args) {

        TaskRepository<BaseTask> taskRepository = new TaskRepository();
        TaskService<BaseTask> taskService = new TaskService(taskRepository);
        TaskController taskController = new TaskController(taskService);
        taskController.startMenu();

    }
}
