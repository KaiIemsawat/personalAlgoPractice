package optionalClass;

import java.util.Optional;

public class OptionalClass102 {
    public static void main(String[] args) {
        Person person1 = new Person("James", "JAMES@email.com"); // try set email as 'null'
        String email = person1.getEmail().map(String::toLowerCase).orElse("email not provided");
        System.out.println(email);
    }
}

class Person {
    private final String name;
    private final String email;

    public Person(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public Optional<String> getEmail() {
        return Optional.ofNullable(email);
    }
}
