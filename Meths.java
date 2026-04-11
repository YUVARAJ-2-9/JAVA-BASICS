package BASICS;

class Animal{

    String name;
    void makeSound(){
        System.out.println(name + "giving some generic sound!");
    }
}

class Dog extends Animal{
    void makeSound(){
        System.out.println(name + "woof woof woof !");
    }
}

class Cat extends Animal{
    void makeSound(){
        System.out.println(name + "meow meow");
    }
}
public class Meths {
    public static void main(String[] args) {
        
        Animal myAni = new Animal();
        Dog myDog = new Dog();
        Cat myCat = new Cat();
        myAni.name = "Dapchen!";

        myDog.name = "Dapchen!";
        myDog.makeSound();
        
        myAni.makeSound();
        myCat.makeSound();
        
    }
}
