package BASICS;

class Book1{
    String bookName;
    void read(){
        System.out.println("He is reading the book :" + bookName);
    }
}
class StoryBook extends Book1{
    String author;
    void read(){
        System.out.println("Reading " + bookName + "written by " + author);
    }
}

public class Book {
    public static void main(String[] args) {
        
        StoryBook s1 = new StoryBook();

        s1.bookName = "I to had a love Story!";
        s1.author = "yuvaraj";

        s1.read();
        
       
        
    }
}
