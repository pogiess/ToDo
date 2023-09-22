package view;

public class MainMenu implements Menu{
    @Override
    public void printMenu() {
        System.out.print("\n-------------------\n      |main menu| \n      -----------\n");
        System.out.print("1. add task\n2. delete task\n3. print tasks\n4. check done task\n5. exit\n");
        System.out.print("-------------------\n");
    }
}
