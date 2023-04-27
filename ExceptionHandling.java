import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.nio.file.FileAlreadyExistsException;
import java.util.Scanner;

public class ExceptionHandling {

    // static void doSomethingMore(){
    //         int a=90/0;
    // }
    // static void doSomething(){
    //     System.out.println("iam stat 1 in doSomething");
    //         doSomethingMore();
    //         System.out.println("hello world");
    //     System.out.println("iam stat 2 in doSomething");
    // }

     static void  fileReadingwriting() throws Exception{
      
        FileInputStream file =new FileInputStream("file.txt");
    }

    public static void main(String[] args) throws Exception {


        try{
            Object obj =new String();
            int i=90/10;
            
            int arr[]=new int[78];
            arr=null;
            arr[90]=667;
            
        }
        catch(ArithmeticException ex){
            System.out.println(ex.getMessage());
        }
        
        catch(NullPointerException ex){
            System.out.println(ex.getMessage());
        }
        
        catch(Exception ex){
            System.out.println(ex);
        }
        finally{
            System.out.println("i always run");
        }


     //   fileReadingwriting();
//   try{
//        fileReadingwriting();
//     }
//     catch(Exception e){

//     }
   // System.out.println("hi iam a statement in normal flow");

    }
}
