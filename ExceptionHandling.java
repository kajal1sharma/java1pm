import java.util.Scanner;

public class ExceptionHandling {

    static void doSomethingMore(){
        
            int a=90/0;
        
    }
    static void doSomething(){
        System.out.println("iam stat 1 in doSomething");
        try{
            doSomethingMore();
            System.out.println("hello world");
        }
        catch(Exception e){
           System.out.println(e);
        }
        
        System.out.println("iam stat 2 in doSomething");
    }
    public static void main(String[] args) {
      
         doSomething();
        // try{
        //     Scanner sc=new Scanner(System.in);
        //     int b=sc.nextInt();
        //     int a=90/b;
        //     System.out.println("a value is : " +a);
        // }
        // catch(Exception e){
        //     System.out.println(e);
        // }

        System.out.println("hi iam a statement in normal flow");

    }
}
