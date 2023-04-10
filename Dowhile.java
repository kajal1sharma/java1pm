import java.util.Scanner;

public class Dowhile{
    public static void main(String[] args) {
        // int i=0;
        // do{
        //     System.out.println("hello world "+ i);
        //     i=i+1;
        // }
        // while(i<0);

 //     float f= sc.nextFloat();
    //     String s=sc.nextLine();
    //    char c =sc.nextLine().charAt(0); 

        Scanner sc =new Scanner(System.in);

        int n;
        System.out.println("Enter some number : ");
        n=sc.nextInt();
   
        int i=1;
        int sum=0;

        do{
            sum=sum+i;
            i++;
        }
        while(i<=n);

        System.out.println("sum of first "+ n+" numbers = "+sum);


    }
}