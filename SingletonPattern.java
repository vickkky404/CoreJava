// Singleton class
class Singleton {
    private static Singleton instance;
    private String message = "Singleton Instance";
    
    private Singleton() {
    }
    
    public static Singleton getInstance() {
        if(instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
    
    public void showMessage() {
        System.out.println(message);
    }
}

// Thread-safe singleton
class ThreadSafeSingleton {
    private static ThreadSafeSingleton instance;
    
    private ThreadSafeSingleton() {
    }
    
    public static synchronized ThreadSafeSingleton getInstance() {
        if(instance == null) {
            instance = new ThreadSafeSingleton();
        }
        return instance;
    }
}

public class SingletonPattern {
    public static void main(String[] args) {
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        
        s1.showMessage();
        System.out.println("s1 and s2 are same: " + (s1 == s2));
    }
}
