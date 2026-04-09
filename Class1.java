package BASICS;



class Student{

    String name;
    int age;

    void displayInfo(){
        System.out.println("Enter you name :" + name);
        System.out.println("Enter you age :" + age);
    }

}

public class Class1 {

    public static void main(String[] args) {
        
        Student s1 = new Student();

        s1.name = "Yuvaraj";
        s1.age = 19;

        s1.displayInfo();
    }


    
}
