import java.util.Scanner;
public class ReturnFunc {

    public static int product(int num1, int num2){
        int pro = num1*num2;
        return pro;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter first number");
        int a=sc.nextInt();
        System.out.println("Enter second number");
        int b =sc.nextInt();
        int result = product(a,b);
        System.out.println(result);
         
      

        

    }
}
