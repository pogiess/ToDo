package model;

public class Task {
    private final String taskSubject;
    private final long id;
    private boolean checkDone;

    public Task(String taskSubject , Long id , boolean checkDone) {
        this.taskSubject = taskSubject;
        this.id = id;
        this.checkDone = checkDone;
    }

    public Long getId() {
        return id;
    }


    public void setCheckDone(boolean checkDone) {
        this.checkDone = checkDone;
    }

    @Override
    public String toString() {
        return "task : [ subject name -> (" + taskSubject + ")" +
                " , id -> (" + id + ")" +
                " , checkDone -> (" + checkDone + ") ]\n";
    }
}
