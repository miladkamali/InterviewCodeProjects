package Question3;

import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

class Task implements Runnable{
    private int id;
    public Task(int id){
        this.id=id;
    }

    public void notification(){
        System.out.println("task number "+ id + " is added" );
    }

    @Override
    public void run() {
        try {
            Random random = new Random();
            Thread.sleep(random.nextInt(3000));
            System.out.println("message from task " + id);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}

public class Main {
    public static void main(String[] args) {
        ThreadPoolExecutor executor = (ThreadPoolExecutor) Executors.newFixedThreadPool(4);
        for(int i=0;i<20;i++){
            Task newTask = new Task(i);
            newTask.notification();
            executor.execute(newTask);
        }
        try {
            executor.shutdown();
            ((ExecutorService) executor).awaitTermination(Long.MAX_VALUE, TimeUnit.MILLISECONDS);
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println("Loading is complete.");
    }
}
