package eight;

import seven.animal.Flyable;
import six.Person;

public class EightExecutor {
    public static void main(String[] args) {
        //new
        Person person = new Person();
        person.setName("Tadej");
        //1.8. LAMBDA operator
        //Anonimni inner type
        Flyable flyable = new Flyable() {
            @Override
            public void fly() {
                System.out.println("Ja letim...");
            }
        };
        flyable.fly();
        //1.8.
        Flyable flyable2 = () -> {
            System.out.println("Ja letim ponovno...");
        };
        flyable2.fly();

    }
}
