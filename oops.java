
class Human{
    String name;
    int eyes;
    int height;
    String color;
    int weight;

    void run(){
        System.out.println("i run");
    }

    void eatfood(){
        System.out.println("i eat food");
    }

    void sleep(){
        System.out.println("i sleep");
    }
}


public class oops {
public static void main(String[] args) {
    
    Human h1=null;
    h1= new Human();
    h1.name="shreya";

    System.out.println(h1.name);


}    
}
