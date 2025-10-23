package StreamsPrograms20_OCT;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FilterEvenNumbers {
    static void main(String[] args) {

        List<Integer>  numbers= Arrays.asList(23,45,44,22,56,47);

        Set<Integer> even = numbers.stream().filter(n->n%2==0).collect(Collectors.toSet());
        System.out.println(even);

        // filter with names

        List<String> names = Arrays.asList("Mohan", "Priyanka", "Mike", "John", "Meena");

        Set<String> str= names.stream().filter(name ->name.startsWith("M")).collect(Collectors.toSet());

        System.out.println(str);
    }
}
