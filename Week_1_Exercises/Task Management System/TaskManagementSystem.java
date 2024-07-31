public class TaskManagementSystem {
    private Node head;

    public TaskManagementSystem() {
        head = null;
    }

    
    private static class Node {
        Task task;
        Node next;

        public Node(Task task) {
            this.task = task;
            this.next = null;
        }
    }

   
    public void addTask(Task task) {
        Node newNode = new Node(task);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    
    public Task searchTask(int taskId) {
        Node current = head;
        while (current != null) {
            if (current.task.taskId == taskId) {
                return current.task;
            }
            current = current.next;
        }
        return null;
    }

    
    public void traverseTasks() {
        Node current = head;
        while (current != null) {
            System.out.println("Task ID: " + current.task.taskId + ", Task Name: " + current.task.taskName + ", Status: " + current.task.status);
            current = current.next;
        }
    }

     
    public void deleteTask(int taskId) {
        if (head == null) {
            return;
        }
        if (head.task.taskId == taskId) {
            head = head.next;
            return;
        }
        Node current = head;
        while (current.next != null) {
            if (current.next.task.taskId == taskId) {
                current.next = current.next.next;
                return;
            }
            current = current.next;
        }
    }
}