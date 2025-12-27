public class SinglyLinkedListCRUD {
    static class Node {
        int data;
        Node next;
        Node(int data) { this.data = data; this.next = null; }
    }
    
    private Node head;

    public void insert(int value) {
        Node newNode = new Node(value);
        if (head == null) head = newNode;
        else {
            Node temp = head;
            while (temp.next != null) temp = temp.next;
            temp.next = newNode;
        }
        System.out.println("Inserted " + value);
    }

    public void display() {
        Node temp = head;
        System.out.print("List: ");
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void delete(int value) {
        if (head == null) return;
        if (head.data == value) {
            head = head.next;
            System.out.println("Deleted " + value);
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            if (temp.next.data == value) {
                temp.next = temp.next.next;
                System.out.println("Deleted " + value);
                return;
            }
            temp = temp.next;
        }
    }

    public void update(int oldValue, int newValue) {
        Node temp = head;
        while (temp != null) {
            if (temp.data == oldValue) {
                temp.data = newValue;
                System.out.println("Updated " + oldValue + " to " + newValue);
                return;
            }
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        SinglyLinkedListCRUD list = new SinglyLinkedListCRUD();
        list.insert(10); list.insert(20); list.insert(30);
        list.display();
        list.update(20, 25);
        list.display();
        list.delete(10);
        list.display();
    }
}
