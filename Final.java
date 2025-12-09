// Final.java - Final Variables, Methods, and Classes
public class Final {
    private final String companyName = "Tech Company";
    private final int year = 2024;

    public final void secureOperation() {
        System.out.println("Secure operation in progress...");
    }

    public void display() {
        System.out.println("Company: " + companyName);
        System.out.println("Year: " + year);
    }
}

final class ImmutableClass {
    private final String data;

    public ImmutableClass(String data) {
        this.data = data;
    }

    public String getData() {
        return data;
    }

    @Override
    public String toString() {
        return "ImmutableClass{" +
                "data='" + data + '\'' +
                '}';
    }
}

class TestFinal {
    public static void main(String[] args) {
        Final obj = new Final();
        obj.display();
        obj.secureOperation();

        ImmutableClass immutable = new ImmutableClass("Important Data");
        System.out.println(immutable);
    }
}
