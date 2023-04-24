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
}

class Constructor{

    public static void main(String[] args) {
        Toy t= new Toy();
        Toy t22 =new Toy(23);
        Toy t2=new Toy("red",234);
    }
}