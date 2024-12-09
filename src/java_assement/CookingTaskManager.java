package java_assement;

class CookingTask implements Runnable {
    private String taskName;
    private int durationSeconds;

    public CookingTask(String taskName, int durationSeconds) {
        this.taskName = taskName;
        this.durationSeconds = durationSeconds;
    }
    @Override
    public void run() {
        try {
            System.out.println(taskName + " started.");
            Thread.sleep(durationSeconds * 1000);
            System.out.println(taskName + " completed.");
        } catch (InterruptedException e) {
            System.out.println(taskName + " was interrupted.");
            Thread.currentThread().interrupt();
        }
    }
}

public class CookingTaskManager {
    public static void main(String[] args) {
        CookingTask task1 = new CookingTask("Boiling Water", 2);
        CookingTask task2 = new CookingTask("Chopping Vegetables", 3);
        CookingTask task3 = new CookingTask("Grilling Meat", 5);

        Thread thread1 = new Thread(task1);
        Thread thread2 = new Thread(task2);
        Thread thread3 = new Thread(task3);

        thread1.start();
        thread2.start();
        thread3.start();


        try {
            thread1.join();
            thread2.join();
            thread3.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread was interrupted.");
        }

        System.out.println("All tasks completed.");
    }
}