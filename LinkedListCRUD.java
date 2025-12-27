import java.util.*;

public class LinkedListCRUD {
    static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static class LinkedList {
        Node head;

        // CREATE - Add element at beginning
        public void addFirst(int data) {
            Node newNode = new Node(data);
            if (head == null) {
                head = newNode;
            } else {
                newNode.next = head;
                head = newNode;
            }
            System.out.println("Added " + data + " at beginning");
        }

        // CREATE - Add element at end
        public void addLast(int data) {
            Node newNode = new Node(data);
            if (head == null) {
                head = newNode;
            } else {
                Node current = head;
                while (current.next != null) {
                    current = current.next;
                }
                current.next = newNode;
            }
            System.out.println("Added " + data + " at end");
        }

        // READ - Display all elements
        public void display() {
            Node current = head;
            System.out.print("List: ");
            while (current != null) {
                System.out.print(current.data + " -> ");
                current = current.next;
            }
            System.out.println("null");
        }

        // UPDATE - Update element at specific position
        public void update(int position, int newData) {
            Node current = head;
            int count = 0;
            while (current != null) {
                if (count == position) {
                    current.data = newData;
                    System.out.println("Updated position " + position + " to " + newData);
                    return;
                }
                count++;
                current = current.next;
            }
            System.out.println("Position not found");
        }

        // DELETE - Delete first element
        public void deleteFirst() {
            if (head != null) {
                head = head.next;
                System.out.println("Deleted first element");
            }
        }

        // DELETE - Delete last element
        public void deleteLast() {
            if (head == null) return;
            if (head.next == null) {
                head = null;
                System.out.println("Deleted last element");
                return;
            }
            Node current = head;
            while (current.next.next != null) {
                current = current.next;
            }
            current.next = null;
            System.out.println("Deleted last element");
        }

        // DELETE - Delete by value
        public void deleteByValue(int data) {
            if (head == null) return;
            if (head.data == data) {
                head = head.next;
                System.out.println("Deleted " + data);
                return;
            }
            Node current = head;
            while (current.next != null) {
                if (current.next.data == data) {
                    current.next = current.next.next;
                    System.out.println("Deleted " + data);
                    return;
                }
                current = current.next;
            }
            System.out.println("Element not found");
        }
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        
        System.out.println("=== LinkedList CRUD Operations ===");
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        list.display();
        
        list.addFirst(5);
        list.display();
        
        list.update(2, 25);
        list.display();
        
        list.deleteFirst();
        list.display();
        
        list.deleteLast();
        list.display();
        
        list.deleteByValue(20);
        list.display();
    }
}
