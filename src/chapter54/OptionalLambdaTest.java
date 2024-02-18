package chapter54;

import java.util.Optional;
import java.util.function.Supplier;

public class OptionalLambdaTest {
    public static void main(String[] args) {
        String str = null;
        Optional<String> stringOptional = Optional.ofNullable(str);

        String str2 = stringOptional.orElseGet(() -> "default")
                .toUpperCase();

        System.out.println(str2);
    }
}
