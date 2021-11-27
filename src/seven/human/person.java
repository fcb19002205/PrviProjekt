package seven.human;

import seven.Gender;
import seven.animal.*;

public class person  {
    private int id;
    private String name;
    private String surname;
    private Gender gender;
    private int age;
    private Animal animal;
//    private Dog dog;
//    private Cat cat;
//    private Fish fish;
//    private Hamster hamster;

    //GENDER - dizajnirati tip podatka

    public person(){
        super();
        System.out.println("Person...");
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public Animal getAnimal() {
        return animal;
    }


    //    public Dog getDog() {
//        return dog;
//    }
//
//    public void setDog(Dog dog) {
//        this.dog = dog;
//    }
//
//    public Cat getCat() {
//        return cat;
//    }
//
//    public void setCat(Cat cat) {
//        this.cat = cat;
//    }
//
//    public Fish getFish() {
//        return fish;
//    }
//
//    public void setFish(Fish fish) {
//        this.fish = fish;
//    }
//
//    public Hamster getHamster() {
//        return hamster;
//    }
//
//    public void setHamster(Hamster hamster) {
//        this.hamster = hamster;
//    }
}
