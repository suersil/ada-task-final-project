package AdaTask.src.main.java.Controller;

import java.util.Scanner;

public class Menu {
    public boolean escolher(int escolha) {

        switch(escolha) {
            case 1:
                System.out.println("\nAdding a New Task: ");
                return true;


            case 2:
                System.out.println("\nEditing a Task: ");
                return true;


            case 3:
                System.out.println("\nShowing Task List: ");
                return true;


            case 4:
                System.out.println("\nDeleting a Task: ");
                return true;


                case 5:
                    System.out.println("\nChoose an Option: ");
                    return false;


            default:
                System.out.println("\nChoose an Valid Option: ");
                return false;
        }


    }
    public int mostrarMenu() {

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
