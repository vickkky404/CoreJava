// InterruptedException Example
public class InterruptedEx implements Runnable {
    @Override
    public void run() {
        try {
            System.out.println("Thread started");
            Thread.sleep(5000);
            System.out.println("Thread completed");
        } catch (InterruptedException e) {
            System.out.println("Error: Thread was interrupted");
            System.out.println("Exception: " + e.getMessage());
            Thread.currentThread().interrupt();
        }
    }
    
    public static void main(String[] args) {
        Thread t = new Thread(new InterruptedEx());
        t.start();
        t.interrupt();
    }
}
