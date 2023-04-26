
class Vehicle{
    int x;
    int y;
    int z;

    void setx(int x){
        this.x=x;
    }
    int getx(){
        return this.x;
    }

    Vehicle(int x, int y, int z){
        this.x=x;
        this.y=y;
        this.z=z;
    }
}

class Bus {
    int w;
    String s;
    Vehicle v;

    Bus(int w, Vehicle v){
        this.w=w;
        this.v=v;
    }
    void getInfo(){
        System.out.println(v.x+" "+v.y+" "+v.z);
    }
}


public class Modifiers2 {

    public static void main(String[] args) {
        Vehicle v=new Vehicle(12,13,14);
        Bus b=new Bus(23,v );
        b.getInfo();
    }


    // public static void main(String... flower) {
    //     for(String ele : flower){
    //         System.out.println(ele);
        
    //     }
    //     main(12,13,14);
    // }

    // public static void main(int ... arr){
    //     for(int ele: arr){
    //         System.out.println(ele);
    //     }
    // }
}
