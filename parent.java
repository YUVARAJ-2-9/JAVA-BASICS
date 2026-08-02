package BASICS;

class Animal{

    String name;
    void eat(){
        System.out.println(name + "This animal is eating!");

    }

}

class Dog extends Animal{

    void bark(){
        System.out.println(name +"The dog is barking!");
    }
}


public class parent {
    
    public static void main(String[] args) {
        Dog myDog = new Dog();

        myDog.name = "dapchen!";
        myDog.eat();
        myDog.bark();
    }
}
