package optionalClass;

import java.util.Optional;

public class OptionalClass101 {
    public static void main(String[] args) {

        Optional<String> hello = Optional.ofNullable(null);

        System.out.println(hello.isEmpty());
        System.out.println(hello.isPresent());

//        String orElse = hello
//                .map(String::toUpperCase)
//                .orElseThrow(IllegalAccessError::new);
//                .orElseGet(() -> {
//                    // ... Extra computation retrieve the value
//                    return "world";
//                });
//        System.out.println(orElse);

        hello.ifPresent(word -> {
            System.out.println(word);
        });
        // same as
        hello.ifPresent(System.out::println);
        hello.ifPresentOrElse(System.out::println, () -> System.out.println("world"));


    }
}


