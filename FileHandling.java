import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
public class FileHandling {
    public static void main(String[] args) throws Exception{


        try{

         InputStreamReader i =new InputStreamReader(System.in);
         BufferedReader bf = new BufferedReader(i);
         String str=bf.readLine();
         System.out.println(str);
        }
        catch(Exception e){

        }

        // File f= new File("Dowhile.java");
       
        // FileReader fr1 =new FileReader(f);
        
        // int ch=fr1.read();
        // while(ch!=-1){
        //     System.out.print((char)ch);
        //     ch  =  fr1.read();
        // }
        



        // FileWriter fw =new FileWriter(f);                    
        // fw.write("this is a new string");
        // fw.close();
        // FileWriter fw1 =new FileWriter(f, true);
        // FileWriter fw2 =new FileWriter(f, false);
        // fw2.write("\nthis is new string 2");
        // fw2.close();

        // FileWriter fw3= new FileWriter("Dowhile.java");
        // fw3.write("kfjdkgs");
        // FileWriter fw4 =new FileWriter("Dowhile.java", true);


        // File f = new File("abc.txt");
        // boolean exist = f.exists();

        // System.out.println(exist);
        // f.createNewFile();
        // exist = f.exists();
        // System.out.println(exist);
       
        // System.out.println(f.length());

        // File d = new File("javadir");
        // System.out.println(d.exists());
        // d.mkdir();
        // System.out.println(d.exists());


        // File f2 = new File(d,"abc.txt");
        // System.out.println(f2.exists());
        // f2.createNewFile();
        // System.out.println(f2.exists());

        // File f3=new File("D://java","abc.txt");
        // f3.createNewFile();
        // System.out.println(f3.exists());


    }
}
