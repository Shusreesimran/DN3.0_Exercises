public class Main {
    public static void main(String[] args) {
        TaskManagementSystem tms = new TaskManagementSystem();

        
        tms.addTask(new Task(1, "Task 1", "Progress"));
        tms.addTask(new Task(2, "Task 2", "Completed"));
        tms.addTask(new Task(3, "Task 3", "Pending"));
        tms.addTask(new Task(4, "Task 4", "Progress"));
        tms.addTask(new Task(5, "Task 5", "Completed"));

        
        System.out.println("All Tasks:");
        tms.traverseTasks();

        
        Task task = tms.searchTask(3);
        if (task != null) {
            System.out.println("Task found: " + task.taskName);
        } else {
            System.out.println("Task not found.");
        }

    
        tms.deleteTask(2);
        System.out.println("After deleting task 2:");
        tms.traverseTasks();
    }
}