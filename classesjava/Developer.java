package classesjava;

interface  Database{
    public String url="/connection/mongosdb";
    public int totalconnection=0;

    public void connect(int abc);
    public void Query();
    public void find();
}

abstract class Developer1 implements Database{
    
    public void connect(int abc){
        System.out.println(url);
        System.out.println("connect function implement");
    }
}
abstract class Developer2 extends Developer1 {
    public void Query(){
        System.out.println("query function implement");
    }
}

public class Developer extends Developer2{
    public void find(){
        System.out.println("find fucntion implemented");
    }
    public static void main(String[] args) {
        // Doctor d1= new Doctor();
         Developer d= new Developer();
         d.connect(0);
    }
}


 abstract class Human {
    int eyes;
    int nose;
    int lungCapacity;

    void printInfo(){
        System.out.println("eyes = "+eyes+" nose = "+nose+" lungCapacity = "+lungCapacity);

    }
    abstract void eyesInfo();
   
}

class Doctor extends Human{
    int powerEye;
    void eyesInfo(){
        System.out.println("eyes power = "+powerEye);
    }
}
