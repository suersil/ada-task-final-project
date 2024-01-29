package Controller;

import Domain.BaseTask;
import Domain.PersonalTask;
import Domain.WorkTask;
import Service.TaskService;

import java.util.List;
import java.util.Scanner;

public class TaskController {

    Scanner input = new Scanner(System.in);

    private TaskService<BaseTask> taskService;

    public TaskController(TaskService<BaseTask> taskService) {
        this.taskService = taskService;
        this.input = new Scanner(System.in);
    }

    //Mostrar Menu

    public void startMenu() {
        while (true) {
            System.out.println("\n----------WELCOME TO ADA TASK!------------");
            System.out.println("------------------------------------------");
            System.out.println("           [1] CREATE A NEW TASK          ");
            System.out.println("           [2] EDIT A TASK                ");
            System.out.println("           [3] SHOW TASK LIST             ");
            System.out.println("           [4] DELETE A TASK              ");
            System.out.println("           [0] EXIT                       ");
            System.out.println("------------------------------------------");
            System.out.println("------------------------------------------");
            System.out.println("Choose a number from the menu to start: ");

            int choice = this.input.nextInt();
            this.input.nextLine();

            switch (choice) {
                case 0:
                    System.out.println("Exiting...");
                    System.exit(0);
                default:
                    System.out.println("\nTry again. ");
                    break;
                case 1:
                    System.out.println("\nCreating a New Task: ");
                    this.createTask();
                    break;
                case 2:
                    System.out.println("\nEditing a Task: ");
                    this.editTask();
                    break;
                case 3:
                    System.out.println("\nShowing Task List: ");
                    this.viewAllTasks();
                    break;
                case 4:
                    System.out.println("\nDeleting a Task: ");
                    this.deleteTask();

            }
        }
    }


    //TAREFAS:

    //Criando Tarefas
    private void createTask() {
        System.out.println("Choose between ([1] PERSONAL Task or [2] WORK Task ): ");
        int typeChoice = input.nextInt();
        input.nextLine();  // Ir para nova linha após a leitura do número, evitando nextLine bug

        System.out.println("Enter the task title: ");
        String title = input.nextLine();

        System.out.println("Enter the task description: ");
        String description = input.nextLine();

        System.out.println("Enter the deadline for the task: (dd/mm/yyyy) ");
        String deadline = input.nextLine();

        BaseTask newTask;
        switch (typeChoice) {
            case 1:
                newTask = new PersonalTask(title, description, deadline);
                break;
            case 2:
                newTask = new WorkTask(title, description, deadline);
                break;
            default:
                System.out.println("Invalid task type.");
                return;
        }

        taskService.createTask(newTask);
        System.out.println("Task created successfully!");
    }

    //Editando Tarefas
    // o usuario pode selecionar uma tarefa da lista e adicionar novos detalhes.
    private void editTask() {
        List<BaseTask> tasks = taskService.viewAllTasks();

        if (tasks.isEmpty()) {
            System.out.println("No task available for editing.");
            return;
        }

        System.out.println("Task List: ");

        for (int i = 0; i < tasks.size(); i++) {
            System.out.println(i + 1 + ". " + tasks.get(i));
        }

        System.out.println("Enter the task number you want to edit: ");
        int taskNumber = input.nextInt();
        input.nextLine();  // Consumir a nova linha após a leitura do número to avoid the nextLine bug

        if (taskNumber < 1 || taskNumber > tasks.size()) {
            System.out.println("Invalid task number.");
            return;
        }

        BaseTask selectedTask = tasks.get(taskNumber - 1);

        System.out.println("Enter the NEW task title: ");
        String newTitle = input.nextLine();

        System.out.println("Enter the NEW task description: ");
        String newDescription = input.nextLine();

        System.out.println("Enter the NEW deadline: ");
        String newDeadline = input.nextLine();

        BaseTask updatedTask = new BaseTask(newTitle, newDescription, newDeadline);

        taskService.editTask(selectedTask, updatedTask);
        System.out.println("Task edited successfully!");
    }

    //Deletando Tarefas
    private void deleteTask() {
        List<BaseTask> tasks = taskService.viewAllTasks();

        if (tasks.isEmpty()) {
            System.out.println("No task available for deletion.");
            return;
        }

        System.out.println("Task List: ");
        for (int i = 0; i < tasks.size(); i++) {
            System.out.println(i + 1 + ". " + tasks.get(i));
        }

        System.out.println("Enter the task number you want to delete: ");
        int taskNumber = input.nextInt();
        input.nextLine();  // Consumir a nova linha após a leitura do número to avoid the nextLine bug

        if (taskNumber < 1 || taskNumber > tasks.size()) {
            System.out.println("Invalid task number.");
            return;
        }

        BaseTask selectedTask = tasks.get(taskNumber - 1);
        taskService.deleteTask(selectedTask);
        System.out.println("Task deleted successfully!");
    }

    //Vizualizando Lista de Tarefas
    private void viewAllTasks() {
        List<BaseTask> tasks = taskService.viewAllTasks();
        for (BaseTask task : tasks) {
            System.out.println(task);
        }
    }
}