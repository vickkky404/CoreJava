public class DoublyLinkedListCRUD {
    static class Node {
        int data;
        Node next, prev;
        Node(int data) { this.data = data; }
    }
    private Node head;

    public void insert(int value) {
        Node n = new Node(value);
        if (head == null) head = n;
        else {
            Node t = head;
            while (t.next != null) t = t.next;
            t.next = n;
            n.prev = t;
        }
        System.out.println("Inserted " + value);
    }

    public void display() {
        Node t = head;
        System.out.print("List: ");
        while (t != null) {
            System.out.print(t.data + " <-> ");
            t = t.next;
        }
        System.out.println("null");
    }

    public void delete(int val) {
        if (head == null) return;
        if (head.data == val) {
            head = head.next;
            if (head != null) head.prev = null;
            System.out.println("Deleted " + val);
            return;
        }
        Node t = head;
        while (t != null) {
            if (t.data == val) {
                if (t.next != null) t.next.prev = t.prev;
                if (t.prev != null) t.prev.next = t.next;
                System.out.println("Deleted " + val);
                return;
            }
            t = t.next;
        }
    }

    public static void main(String[] args) {
        DoublyLinkedListCRUD l = new DoublyLinkedListCRUD();
        l.insert(10); l.insert(20); l.insert(30);
        l.display();
        l.delete(20);
        l.display();
    }
}
