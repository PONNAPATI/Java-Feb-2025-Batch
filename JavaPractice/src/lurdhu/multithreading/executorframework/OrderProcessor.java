package src.lurdhu.multithreading.executorframework;

class OrderProcessor implements Runnable {
    private final int orderId;

    public OrderProcessor(int orderId) {
        this.orderId = orderId;
    }

    @Override
    public void run() {
        System.out.println("Processing order #" + orderId + " by " + Thread.currentThread().getName());
        try {
            Thread.sleep(2000); // Simulate order processing time
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Order #" + orderId + " processed by " + Thread.currentThread().getName());
    }
}


