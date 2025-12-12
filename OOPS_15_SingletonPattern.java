// OOPS Program 15: Singleton Pattern
public class OOPS_15_SingletonPattern {
    static class Database {
        private static Database instance;
        private String dbName = "MyDB";
        
        private Database() {}
        
        public static Database getInstance() {
            if(instance == null) {
                instance = new Database();
            }
            return instance;
        }
        
        public void connect() {
            System.out.println("Connected to " + dbName);
        }
    }
    public static void main(String[] args) {
        Database db1 = Database.getInstance();
        Database db2 = Database.getInstance();
        db1.connect();
        System.out.println("Same instance: " + (db1 == db2));
    }
}
