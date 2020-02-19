package john.org.imperitive;

import java.util.ArrayList;
import java.util.List;

public class Main {
    private static Object FEMALE;

    public static void main(String[] args) {
        System.out.println("Hi there");

        List<Person> people = List.of(
            new Person("John",Gender.MAIL),
            new Person("Allase",Gender.FEMAIL),
            new Person("Jane",Gender.FEMAIL),
            new Person("Bill",Gender.MAIL),
            new Person("Gail",Gender.FEMAIL),
        );

        // Imperitive style
        List<Person> femails = new ArrayList<>();
        for(Person person : people){
            if(FEMALE.equials(person.gender)) {
                femails.add(person);
            }
        }

    }

    static class Person<people> {
        private final String name;
        private final Gender gender;

        public Person(String name, Gender gender) {
            this.name = name;
            this.gender = gender;
        }




        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", gender=" + gender +
                    '}';
        }
    }

    enum Gender {
        MAIL, FEMAIL
    }
}
