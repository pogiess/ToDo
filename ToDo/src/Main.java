import controller.TaskController;
import view.MainMenu;
import view.Menu;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Menu menu = new MainMenu();
        TaskController taskController = new TaskController();

        startToDoApp(menu, scanner, taskController);
    }

    private static void startToDoApp(Menu menu, Scanner scanner, TaskController taskController) {
        int key;
        while(true) {
            menu.printMenu();
            System.out.print("what to do : ");
            key = scanner.nextInt();
            switch (key) {
                case 1 :
                    taskController.addTask(taskController.getTask());
                    break;
                case 2:
                    taskController.deleteTask();
                    break;
                case 3 :
                    taskController.printAllTasks();
                    break;
                case 4 :
                    taskController.checkDone();
                    break;
                case 5 :
                    System.out.println("\nhave a good ToDo");
                    System.exit(0);
                    break;
                default :
                    System.out.println("invalid");
            }
        }
    }
}