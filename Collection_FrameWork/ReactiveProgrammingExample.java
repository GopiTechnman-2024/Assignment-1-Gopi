import reactor.core.publisher.Flux;
import reactor.core.scheduler.Schedulers;

public class ReactiveProgrammingExample {
    public static void main(String[] args) {
        // Create a Flux of integers from 1 to 10
        Flux<Integer> flux = Flux.range(1, 10);

        // Use reactive operators to
        // transform and process the data

        // Filter out odd numbers
        flux.filter(i -> i % 2 == 0)
            // Double the remaining numbers
            .map(i -> i * 2)
            // Publish on parallel scheduler
            // for concurrent execution
            .publishOn(Schedulers.parallel())
            // Subscribe to the final data
            // stream and print the results
            .doOnNext(System.out::println)
            .blockLast(); // block and wait for the completion
    }
}
