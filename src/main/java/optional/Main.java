package optional;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        Optional.ofNullable("hello").orElseThrow(
                () -> new IllegalStateException("No value enter"));

        Optional.ofNullable("jhon@mail.com")
                .ifPresentOrElse(
                        email -> System.out.println("Sending email to " + email),
                        () -> System.out.println("Can not send email"));
    }
}
