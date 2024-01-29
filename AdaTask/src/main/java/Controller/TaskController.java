package AdaTask.src.main.java.Controller;

import java.util.Scanner;
import domain.*;
import service.TaskService;
import java.util.List;

public class Menu {


    public boolean escolherItemMenu(int choice) {

        switch(choice) {
            case 1:
                createTask();
                System.out.println("\nAdding a New Task: ");
                return true;


            case 2:
                editTask();
                System.out.println("\nEditing a Task: ");
                return true;


            case 3:
                deleteTask();
                System.out.println("\nShowing Task List: ");
                return true;


            case 4:
                viewAllTasks();
                System.out.println("\nDeleting a Task: ");
                return true;


                case 5:
                    System.out.println("\nChoose an Option: ");
                    System.exit(0);
                    return false;


            default:
                System.out.println("\nChoose an Valid Option: ");
                return false;
        }


    }
    public int showMenu() {

        int opcao = 0;

        System.out.println("\n----------WELCOME TO ADA TASK!-----------");
        System.out.println("------------------------------------------");
        System.out.println("             [1] ADD A NEW TASK           ");
        System.out.println("             [2] EDIT A TASK              ");
        System.out.println("             [3] SHOW TASK LIST           ");
        System.out.println("             [4] DELETE A TASK            ");
        System.out.println("             [0] EXIT                     ");
        System.out.println("------------------------------------------");
        System.out.println();

        Scanner input = new Scanner(System.in);

        int escolha = input.nextInt();
        return escolha;




    }

}
