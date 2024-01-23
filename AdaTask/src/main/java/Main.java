package AdaTask.src.main.java;

import AdaTask.src.main.java.Controller.Menu;

public class Main {
    public static void main(String[] args) {

        Menu menuEscolha = new Menu();

        boolean val = false;

        while (val == false) { // Enquanto "val" for "false" o while vai ficar fazendo loop e mostrando o MENU, mas quando se tornar "true" ele vai parar
            int opcao = menuEscolha.mostrarMenu();
            val = menuEscolha.escolher(opcao);
        }

    }
}
