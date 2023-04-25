
abstract class Vehicle{
    int tyres;
    Vehicle(){
        this(89);
        tyres=90;

    }
    private Vehicle(int tyres){
        this.tyres=tyres;
    }
} 

class Bus extends Vehicle{
    int color=1;
    Bus(){
        //super(90);
        this.tyres=89;
        this.color=90;
    }

}
public class constructorAbstract {
    public static void main(String[] args) {
        Bus b=new Bus();
        System.out.println(b.tyres+" "+b.color);
    }
}
