import javax.swing.plaf.synth.SynthListUI;

class Toy{

    String color;
    int Quantity;
    int x;
    int y;

    //if you will not declare any constructor by default this default constructor will 
    //be called implicitly by java virtual machine;
    //Toy(){

    //}
    Toy(){//Toy()
        x=100;
        y=300;
    }
    Toy(int Quantity){//Toy(int)
        this.x=100;
        this.y=300;
        this.Quantity=Quantity;
    }
    Toy(String color, int Quantity){//Toy(String, int)
        this(23);
        this.color=color;
        this.Quantity=Quantity;
    }

    void work(){
        System.out.println("this toy is sliding");
    }
    

}


class Gun extends Toy{
    int size;

    Gun(int size, int Quantity){
        super("red",Quantity);
        this.size=size;
    }
    void work(){
        System.out.println("this gun fire bullets");
    }
    //funvtion overloading
    
}

class Calculator{
    void add(){
        int a=90;
        int b=89;
        System.out.println(a+b);
    }
//overloafed function
    void add(int a){
        System.out.println(a+a);
    }
    void add(int a , int b){
        System.out.println(a+b);
    }
    void add(int a, float b){
        System.out.println(a+b);
    }
    int add(int c , int d, int e){
        return c+d+e;
    }
}

class Constructor{

    public static void main(String[] args) {
        // Toy t= new Toy();
        // Toy t22 =new Toy(23);
        // Toy t2=new Toy("red",234);
        // Gun machineGun = new Gun(120,23 );
        

        Toy obj = new Gun(120,34);
        System.out.println(obj.Quantity+"  "+obj.color+"  ");//size cannot be referred by parent reference
        Gun obj2 =(Gun)new Toy();
        System.out.println(obj2.color+" "+obj2.Quantity+" "+obj2.size);

        //machineGun.work();
        // Calculator c=new Calculator();
        // c.add();
        // c.add(90);
        // c.add(45,78);

    }
}