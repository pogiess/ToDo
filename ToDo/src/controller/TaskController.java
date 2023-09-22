package controller;

import model.Task;
import java.util.Arrays;
import java.util.Scanner;

public class TaskController {


    private Task[] tasks = new Task[1];
    private int index = 0;

    public Task getTask(){
        Scanner scanner = new Scanner(System.in);
        String name;
        long number;

        System.out.println("task name : ");
        name = scanner.nextLine();

        System.out.println("task id (it is better if it is short) : ");
        number = scanner.nextLong();


        return new Task(name , number , false);
    }

    public void addTask(Task task) {
        tasks[index] = task;
        ++index;

        if(tasks.length == index) {
            Task[] temp = tasks;
            tasks = new Task[tasks.length + 1];
            System.arraycopy(temp, 0, tasks, 0, temp.length);
        }
    }

    public void deleteTask() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("task id : ");
        long id = scanner.nextLong();

        int index = checkExisted(id);
        if(index != -1) {
            Task[] temp = new Task[tasks.length-1];
            for (int i = 0; i < tasks.length; i++) {
                if(tasks[i] != null && i != index) {
                    temp[i] = tasks[i];
                }
            }
            tasks = temp;
            this.index--;

        } else {
            System.out.println("the task was not found!");
        }
    }

    public void checkDone() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("good job");
        System.out.println("task id : ");
        long id = scanner.nextLong();

        int index = checkExisted(id);

        if(index != -1) {
            for (int i = 0; i < tasks.length; i++) {
                if(tasks[i] != null && i == index) {
                    tasks[i].setCheckDone(true);
                }
            }
        } else {
            System.out.println("task not found");
        }
    }

    public int checkExisted(long id) {
        int index = -1;

        for (int i = 0; i < tasks.length; i++) {
            if(tasks[i] != null && tasks[i].getId() == id) {
                index = i;
            }
        }

        return index;
    }

    public void printAllTasks() {
        System.out.println(Arrays.toString(tasks));
    }
}
