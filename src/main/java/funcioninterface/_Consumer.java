package funcioninterface;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class _Consumer {

    public static void main(String[] args) {

        Customer maria = new Customer("Maria", "+099999999999");
        greet.accept(maria);
        greetAndValidate.accept(maria, false);
    }

    static Consumer<Customer> greet = customer ->
            System.out.println("Hello " +  customer.name +
                    ", Thanks for registering your phone number :"
                     + customer.phoneNumber);

    static BiConsumer<Customer, Boolean> greetAndValidate = (customer, showPhoneNumber) ->
            System.out.println("Hello " +  customer.name +
                            ", Thanks for registering your phone number :"
                            + (showPhoneNumber ? customer.phoneNumber : "*******"));

    static class Customer {
        private final String name;
        private final String phoneNumber;

        public Customer(String name, String phoneNumber) {
            this.name = name;
            this.phoneNumber = phoneNumber;
        }

        public String getName() {
            return name;
        }

        public String getPhoneNumber() {
            return phoneNumber;
        }
    }
}
