package util;

import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Stream;

import static java.util.stream.Collectors.*;

/**
 * Created by hun on 21/07/2017.
 */
public class AlgorithmUtil {
    public static <T> List<T> generateInitialList(Supplier<T> random, int limit) {
        return Stream.generate(random)
                .distinct()
                .limit(limit)
                .collect(toList());
    }

    public static <T> void print(T t) {
        Stream.of(t).forEach(e -> System.out.print(e + "\t"));
        System.out.println();
    }
}
