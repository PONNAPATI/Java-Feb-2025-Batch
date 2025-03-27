package src.lurdhu.multithreading.executorframework;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class FixedThreadPoolDemo {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(3); // Max 3 threads in pool

        // Simulating 10 customer orders
        for (int i = 1; i <= 10; i++) {
            executor.execute(new OrderProcessor(i));
        }

        executor.shutdown(); // Shutdown after all tasks are submitted
    }
}
