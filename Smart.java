package BASICS;

class Mobile{
    String brand;
    int battteryPercentage;


    void showStatus(){
        System.out.println("Brand :" + brand);
        System.out.println("BatteryPercentage :" + battteryPercentage + "%");
        
    }

    void change(){
        battteryPercentage += 5;
        System.out.println("Battery: " + battteryPercentage + "%");
    }
}




public class Smart {
    public static void main(String[] args) {

        Mobile m1 = new Mobile();

        m1.brand = "Apple";
        m1.battteryPercentage = 67;
        
        m1.showStatus();
        m1.change();
        m1.showStatus();
    }
    
}
