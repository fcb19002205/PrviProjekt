package eight.Collection;

import seven.Gender;

import java.util.*;

public class Tester {
    public static void main(String[] args) {
        Set<Person> persons = new TreeSet<>();
        Person person1 = new Person("Gregor", "Blaško", Gender.MALE, 34);
        persons.add(person1);
        persons.add(person1);
        persons.add(new Person("Gregor", "Blaško", Gender.MALE, 34));
        Person person2 = new Person("Mira", "Blaško",Gender.FEMALE, 59);
        persons.add(person2);
        Person person3 = new Person("Igor", "Blaško", Gender.MALE, 62);
        persons.add(person3);
        Person person4 = new Person("Tadej", "Blaško", Gender.MALE, 37);
        persons.add(person4);
        Person person5 = new Person("Argo", "Blaško", Gender.MALE, 8);
        persons.add(person5);
        Person person6 = new Person("Vida", "BUšić", Gender.FEMALE, 56);
        persons.add(person6);
        for (Person person : persons) {
            System.out.println(person);

        }

    }
}
