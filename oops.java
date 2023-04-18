import classesjava.util.Human;

class Human{

    private String name;
    private int eyes;
    private int height;
    private String color;
    private int weight;

    void  run(){
        System.out.println("i run");
        name="tina";
    }

    void eatfood(){
        System.out.println("i eat food");
    }

    void sleep(){
        System.out.println("i sleep");
    }
}


class BankAccount{
    private int accountNumber;
    private int pin;
    private int totalAmount;

    public void withdraw(){
        if(totalAmount>3000){
            System.out.println("allow withdrawal")
        }
        else{
            System.out.println("dont");
        }
    }
    public void credit(){

    }



}

public class oops {
public static void main(String[] args) {
    
    Human h1=new Human();
    Human h2=new Human();
    Human h3=new Human();

//    h1.name="shreya";
//     h1.color="black";
//     h1.height=152;
//     h1.weight=60;
//     h1.eyes=2;
    h1.eatfood();
    h1.sleep();
    h1.run();


   h2.name="priya";

   h3.name="tina";

    System.out.println(h1.name);


}    
}
