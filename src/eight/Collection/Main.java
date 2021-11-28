package eight.Collection;

import eight.Person;

public class Main {
    public static void main(String[] args) {
        String input = "23";
        int number = Integer.parseInt(input);
        Box<Integer> kutija = new Box<>();
        kutija.setField(23);





        //Dinamički niz - fiksna dužina niza
        String[] names = new String[3];
        names[0]="Tadej";
        names[1]="Igor";
        names[2]="Mira";

        Person person = new Person();
        person.setName("Gregor");
        person.setSurname("Blaško");
        person.setAge(34);

        Box<Person> box = new Box<>();
        box.setField(person);

        Box<String> box2 = new Box<>();
        box2.setField("Argo");

        //Sirovi RAW type - nije dobro da se koristi kod generičkih tipova
        Box box3 = new Box();
        box3.setField(new Object());

        Box<Integer> box4 = new Box<>();

    }
}
