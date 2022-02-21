package finalsection;

import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {

        hello("Jhon", "Montana", value -> {
            System.out.println("No lastName provided for " + value) ;
        });
        hello("Jhon", null, value -> {
            System.out.println("No lastName provided for " + value) ;
        });

        greet("Jhon", null, () -> {
            System.out.println("No lastName provided") ;
        });
    }

    static void hello (String firstName, String lastName, Consumer<String> callback) {
        System.out.println(firstName);
        if(lastName != null){
            System.out.println(lastName);
        }else{
            callback.accept(firstName);
        }
    }
    static void greet (String firstName, String lastName, Runnable callback) {
        System.out.println(firstName);
        if(lastName != null){
            System.out.println(lastName);
        }else{
            callback.run();
        }
    }

/*    function hello(fistName, lastName, callback) {
        console.log(fistName);
        if(lastName) {
            console.log(lastName)
        }else {
            callback();
        }
    }*/
}
