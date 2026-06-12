package multithreading;

public class RunnableClass {
    public static void main(String[] args) {
        Thread t1 = new Thread(new CookingJob("pizza"));
        Thread t2 = new Thread(new CookingJob("burger"));
        Thread t3 = new Thread(new CookingJob("pasta"));
        Thread t4 = new Thread(new CookingJob("fry"));

        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}


class CookingJob implements Runnable {
    private String task;

    CookingJob(String task){
        this.task = task;
    }


    @Override
    public void run() {
        System.out.println(task + " is being prepared by " +
                Thread.currentThread().getName());
    }
}