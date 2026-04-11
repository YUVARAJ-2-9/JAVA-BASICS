package BASICS;

class Hero{
    String power;

    void usePower(){
        System.out.println(power + "Hero is using generic power!");
    }
}

class SpiderMan extends Hero{
    
    void usePower(){
        System.out.println("Spiderman is shooting webs!");
    }

}
class IronMan extends Hero{
    void usePower(){
        System.out.println("Iron man is firing lasers!");
    }
}
public class In {
    public static void main(String[] args) {
        Hero myHero = new Hero();
        SpiderMan mySpiderMan = new SpiderMan();
        IronMan myIronMan = new IronMan();

        myHero.usePower();
        mySpiderMan.usePower();
        myIronMan.usePower();
        
    }
}
