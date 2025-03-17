
package Tugas3A9;

class Animal {
    public void makeNoise() {
        System.out.println("talk");
    }
}

class Dog extends Animal {
    public void makeNoise() {
        System.out.println("Bark");
    }
}

public class Tugas3A9 {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.makeNoise(); // Output: "talk"

        Dog dog = new Dog();
        dog.makeNoise(); // Output: "Bark"

        Animal animaldog = new Dog();
        animaldog.makeNoise(); // Output: "Bark" (Polymorphism)

        if (animal instanceof Animal) {
            System.out.println("animal is Animal"); // Output: "animal is Animal"
        }

        if (dog instanceof Animal) {
            System.out.println("Dog is Animal"); // Output: "Dog is Animal"
        }

        if (animaldog instanceof Animal) {
            System.out.println("animaldog is Animal"); // Output: "animaldog is Animal"
        }

        if (animaldog instanceof Dog) {
            System.out.println("animal is Dog"); // Output: "animal is Dog"
        }
    }
}