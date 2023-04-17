
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
    
    Human h1=new Human();
    Human h2=new Human();
    Human h3=new Human();

   h1.name="shreya";
    h1.color="black";
    h1.height=152;
    h1.weight=60;
    h1.eyes=2;

   h2.name="priya";
   
   h3.name="tina";

    System.out.println(h1.name);


}    
}
