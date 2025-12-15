import java.util.Stack;

public class StackImplementation {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        System.out.println("Stack Implementation Demo");
        System.out.println("=".repeat(30));
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        System.out.println("Stack after pushing 10, 20, 30, 40, 50: " + stack);
        System.out.println("Peek (top element): " + stack.peek());
        System.out.println("Pop element: " + stack.pop());
        System.out.println("Stack after pop: " + stack);
        System.out.println("Stack size: " + stack.size());
        System.out.println("Is stack empty? " + stack.isEmpty());
        System.out.println("\nPopping all elements:");
        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }
        System.out.println();
    }
}
