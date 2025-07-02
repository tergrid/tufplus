// SaveToTest.java
public class java24 {
    public static void main(String[] args) {
        // Java 21+ feature: String templates (Preview in Java 21, stabilized in Java 24)
        System.out.println("Java version: " + System.getProperty("java.version"));
        
k        // Test virtual threads (introduced in Java 21)
        Runnable task = () -> {
            System.out.println("Running in a virtual thread");
        };
        Thread vThread = Thread.ofVirtual().start(task);  // Changed to ofVirtual().start()
        
        try {
            vThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
