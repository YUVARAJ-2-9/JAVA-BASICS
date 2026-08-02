package BASICS;

class Bank{
    String holdername;
    double balance;

    void deposit(double amount){
        balance = balance + amount;
        System.out.println("Val:" + amount);

    }

    void checkBalance(){
        System.out.println("Acc holder:" + holdername);
        System.out.println("Acc holder:" + balance);
    }
}

public class Bank1 {
    
    public static void main(String[] args) {

        Bank acc = new Bank();

        acc.holdername = "Yuvaraj";
        acc.balance = 1000.00;

        acc.deposit(500.0);
        acc.checkBalance();
        
    }
}
