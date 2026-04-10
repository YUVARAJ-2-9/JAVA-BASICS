package BASICS;


class Myatm{
    String holdername;
    double balance;


    void deposit(double amount){
        balance += amount;
        System.out.println("Deposited:" + amount);
    }

    void withdraw(double amount){
        
        if(amount <= balance){
            balance -= amount;
            System.out.println("Withdrwal:" + amount);

        }
        else{
            System.out.println("Insuffient Money!");
        }
    }

    void ShowBalance(){
        System.out.println("Balance for" + holdername + " " + balance);
    }
}
public class Atm {
    
    public static void main(String[] args) {

        Myatm user1 = new Myatm();
        user1.holdername = "Yuvaraj k";
        user1.balance = 4000.0;

        user1.ShowBalance();
        user1.deposit(2000.0);
        user1.withdraw(1000.0);
        user1.ShowBalance();
        
    }
}
