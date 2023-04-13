import java.util.Scanner;
public class ReturnFunc {

    public static int product(){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter first number");
        int a=sc.nextInt();
        System.out.println("Enter second number");
        int b =sc.nextInt();

        int pro = a*b;
        return pro;
    }
    public static void main(String[] args) {
          int result = product();
          System.out.println(result);
    }
}
