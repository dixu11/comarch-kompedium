package lambdaStream;

import java.util.ArrayList;
import java.util.List;

public class LambdaDemo {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(6);
        numbers.add(2);
        numbers.add(5);
        numbers.add(1);

        for (Integer number : numbers) {
            System.out.println(number);
        }
        numbers.forEach(number -> System.out.println(number));


        Thread thread = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                System.out.println("Hello");
            }
        });
        thread.start();

    }
}
