package seven;

import seven.animal.Cat;
import seven.animal.Dog;
import seven.animal.Fish;
import seven.human.Employee;
import seven.human.Professor;
import seven.human.person;

public class Main {
    public static void main(String[] args) {
        Professor professor = new Professor();
        Dog dog = new Dog();
        professor.setAnimal(dog);
        Cat cat = new Cat();
        professor.setAnimal(cat);
        Fish fish= new Fish();
        fish.setName("Goldie");
        fish.setType("Šaran");
        professor.setAnimal(fish);
        System.out.println(professor.getAnimal().getName());










//        Employee employee = new Employee();
//        employee.setSalaryAmount(1500);
//
//        System.out.println(employee.getSalaryAmount());
//        employee = new Professor();
//        employee.setSalaryAmount(1500);
//        System.out.println("Profesorska: " + employee.getSalaryAmount());


//        //KLASA ->
//        person person = new person ();
//
//        //ENUM ->
//        Gender gender1 = Gender.MALE;
//        Gender gender2 = Gender.FEMALE;
//        System.out.println(gender1.hashCode());
//        System.out.println(gender2.hashCode());

    }
}
