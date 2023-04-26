package package1;

public class Vehicle2 {
    protected int x;
    private int y;
     int z;

    public     Vehicle2(int x , int y, int z){
        this.x=x;
        this.y=y;
        this.z=z;
    }

    public  void getInfo(){
        System.out.println(this.x+" "+this.y+" "+this.z);
    }
}
