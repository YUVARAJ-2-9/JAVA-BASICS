package BASICS;

class Employee{
    String name;
    double salary;

    void displayRole(){
        System.out.println("I am an Employee!");
    }
}

class Developer extends Employee{
    String lan ;
    void displayRole(){
        System.out.println("I am an developer!!" + lan);
    }

    void showSalary(){
        System.out.println("name:" + name);
        System.out.println("Salary:" + salary);
    }

}

public class Emp {
    public static void main(String[] args) {

        Developer d1 = new Developer();

        d1.name = "Yuvaraj";
        d1.salary = 40000.0;

        d1.lan = "java";
        d1.displayRole();
        d1.showSalary();
        
    }
}
