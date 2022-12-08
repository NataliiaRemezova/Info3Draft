package GetMotivated;

import java.util.ArrayList;
import java.util.List;

public class ToDoList {
    private List<Task> toDoList = new ArrayList<>(50);

    public void addTask(Task task){
        toDoList.add(task);
    }

    public void removeTask(Task task){
        toDoList.remove(task);
    }
}
