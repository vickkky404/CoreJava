import java.util.*;
import java.util.stream.*;

public class StreamAPI {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        
        // Filter even numbers
        List<Integer> evens = numbers.stream()
                                .filter(n -> n % 2 == 0)
                                .collect(Collectors.toList());
        System.out.println("Even numbers: " + evens);
        
        // Map - multiply by 2
        List<Integer> doubled = numbers.stream()
                                .map(n -> n * 2)
                                .collect(Collectors.toList());
        System.out.println("Doubled: " + doubled);
        
        // Sum using reduce
        int sum = numbers.stream().reduce(0, Integer::sum);
        System.out.println("Sum: " + sum);
        
        // Count
        long count = numbers.stream().count();
        System.out.println("Count: " + count);
        
        // Find first
        Optional<Integer> first = numbers.stream().findFirst();
        System.out.println("First: " + first.orElse(-1));
        
        // ForEach
        System.out.println("All numbers:");
        numbers.stream().forEach(System.out::println);
    }
}
