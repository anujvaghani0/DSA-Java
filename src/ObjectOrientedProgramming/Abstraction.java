package ObjectOrientedProgramming;

public class Abstraction {
    public static void main(String[] args) {
        House house = new House();
        house.walk();
        house.breath();
    }
}

abstract class Animal {
    abstract void walk();

    void breath() {
        System.out.println("This animal breathes air");
    }

    Animal() {
        System.out.println("you are about to create an animal");
    }
}

class House extends Animal {
    House() {
        System.out.println("Wow,you have created a house !");
    }

    void walk() {
        System.out.println("Horse walks on 4 legs");
    }
}

class Chicken extends Animal {
    Chicken() {
        System.out.println("Wow,you have created a Chicken !");
    }

    void walk() {
        System.out.println("Chicken walks on 2 legs");
    }
}
