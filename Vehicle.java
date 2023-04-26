

//private, protected cannot be used with class
//deafult 
  class Vehicle{
    protected int x;
    private int y;
    private int z;

    public Vehicle(int x , int y, int z){
        this.x=x;
        this.y=y;
        this.z=z;
    }

    public  void getInfo(){
        System.out.println(this.x+" "+this.y+" "+this.z);
    }
}
