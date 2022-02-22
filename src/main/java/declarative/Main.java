package declarative;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static declarative.Gender.FEMALE;
import static declarative.Gender.MALE;


public class Main {
    public static void main(String[] args) {
        List<Person> people = getPeople();
        //filter
        List<Person> females = people.stream()
                .filter(person -> person.getGender().equals(FEMALE))
                .collect(Collectors.toList());
        //females.forEach(System.out::println);
        //sorted
        List<Person> sortedPeople = people.stream()
                .sorted(Comparator.comparing(Person::getAge).thenComparing(Person::getGender).reversed())
                .collect(Collectors.toList());
        //sortedPeople.forEach(System.out::println);
        //allMatch
        boolean allMatch = people.stream()
                .allMatch(person -> person.getAge() > 8);
       // System.out.println(allMatch);
        //anyMatch
        boolean anyMatch = people.stream()
                .anyMatch(person -> person.getAge() > 121);
        //System.out.println(anyMatch);
        //noneMatch
        boolean noneMatch = people.stream()
                .noneMatch(person -> person.getName().equals("Antonio"));
        //System.out.println(noneMatch);
        //max
        people.stream()
                .max(Comparator.comparing(Person::getAge));
               // .ifPresent(System.out::println);
        //min
        people.stream()
                .min(Comparator.comparing(Person::getAge));
                //.ifPresent(System.out::println);
        //Group
        Map<Gender, List<Person>> groupByGender = people.stream()
                .collect(Collectors.groupingBy(Person::getGender));
       /* groupByGender.forEach((gender, people1) -> {
            System.out.println(gender);
            people1.forEach(System.out::println);
        });*/

        people.stream()
                .filter(person -> person.getGender().equals(FEMALE))
                .max(Comparator.comparing(Person::getAge))
                .map(Person::getName)
                .ifPresent(System.out::println);



    }

    private static List<Person> getPeople() {
        return  List.of(
                new Person("John Smith", 20, MALE),
                new Person("Maria Curie", 33, FEMALE),
                new Person("Aisha James", 57, FEMALE),
                new Person("Alex Ferguson", 14, MALE),
                new Person("Sam Tower", 99, MALE),
                new Person("Alice Keys", 7, FEMALE),
                new Person("Zelda Brown", 120, FEMALE)
        );
    }
}
