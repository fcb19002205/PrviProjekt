package seven;

import seven.animal.Animal;
import seven.animal.Cat;
import seven.animal.Dog;
import seven.animal.Fish;

public class AnimalTest {

    public static void main(String[] args) {
        //Polimorfizam
        //animal... Object, Animal, Dog
        Animal animal = new Dog();
        AnimalTest.test(animal);
        animal = new Cat();
        AnimalTest.test(animal);

    }

    static void test(Animal animal) {
        if (animal instanceof Dog) {
            System.out.println("Pas");
        } else if (animal instanceof Cat){
            System.out.println("Mačka");
        }else if (animal instanceof Fish){
            System.out.println("Riba");
        }else{
            System.out.println("Neka druga žitovinja");
        }
    }
}
