interface  Database{
    public final String url="/connection/mongosdb";
    public final int totalconnection=0;

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
    final int count =12;
    final static int x=90;
    public void find(){
        // count=90;
        System.out.println("find fucntion implemented");
    }
    public static void main(String[] args) {
        // Doctor d1= new Doctor();
         Developer d= new Developer();
         d.connect(0);
    }
}