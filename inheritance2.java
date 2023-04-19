class Car{
     int windows;
     int seats;
     int lights;
    
    //default xonstructor =>no  argumnets 
    Car(){
        System.out.println("iakm a default constructor");
        windows=4;
        seats=4;
        lights=2;
    }
    Car(int lights){
        this.lights=lights;
    }
    Car(int lights,int windows){
        this.lights=lights;
        if(windows>5){}
        this.windows=windows;
    }

    void setSeats(int seats1){
        this.seats=seats1;
    }
    int getSeats(){
        return this.seats;
    }
    void setlights(int lights){
        this.lights=lights;
    }
    int getlights(){
        return this.lights;
    }
    void setWindows(int windows){
        if(windows<=4 && windows>0){
            this.windows=windows;
        }
        else{
            this.windows=4;
        }
    }
    int getWindows(){
        return this.windows;
    }
     void speed(){

     }
     void colorTheCar(){

     }
}
class BMW extends Car{
    
    int automation;

    void setAutomation(int autoM){
        this.automation=autoM;
    }
    int getAutomation(){
        return this.automation;
    }

}

class Audi extends Car{
    int xyz;
    
    void setXyz(int xyr){
        this.xyz=xyr;
    }
    int getXyz(){
        return this.xyz;
    }
}
public class inheritance2 {
    public static void main(String[] args) {
        Car c1= new Car();
        c1.setSeats(12);
    

        Audi a1= new Audi();
        a1.setSeats(13);
        
        BMW b1= new BMW();

        System.out.println(c1.getWindows());        
    }
}
