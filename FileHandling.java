import java.io.File;

public class FileHandling {
    public static void main(String[] args) throws Exception{
        File f = new File("abc.txt");
        boolean exist = f.exists();

        System.out.println(exist);
        f.createNewFile();
        exist = f.exists();
        System.out.println(exist);
       
        System.out.println(f.length());

        File d = new File("javadir");
        System.out.println(d.exists());
        d.mkdir();
        System.out.println(d.exists());


        File f2 = new File(d,"abc.txt");
        System.out.println(f2.exists());
        f2.createNewFile();
        System.out.println(f2.exists());

        File f3=new File("D://java","abc.txt");
        f3.createNewFile();
        System.out.println(f3.exists());


    }
}
