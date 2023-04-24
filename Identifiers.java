import java.util.Scanner;

public class Identifiers {
    public static void main(String[] args) {
       

        String str ="Avinash";
        for(int i=0;i<str.length();i++){
            System.out.print(str.charAt(i));
        }
        System.out.println();
        for(int i=str.length()-1;i>=0;i--){
            System.out.print(str.charAt(i));
        }




        String a;
        Scanner sc =new Scanner(System.in);
        a=sc.next();
        char c = sc.next().charAt(0);
        System.out.println("a is "+a);

        // switch(2*3*4){
        //     case '1':System.out.println("hi iam input 1");
                       
        //     case '2':System.out.println("hi iam input 2");
        //                 break;
        //     case '3':System.out.println("hi iam input 3");
                    
        //     default:System.out.println("hi iam wrong inout");

        // }

        // if(a=='1'){
        //     System.out.println("hi iam input 1");
        // }
        // else if(a=='2'){
        //     System.out.println("hi iam input 2");
        // }
        // else if(a=='3'){
        //     System.out.println("hi iam input 3");
        // }

        // else{
        //     System.out.println("iam wrong input");
        // }
        // char a= 119;
        // char b='z';
        // int ab='a';
        // System.out.println(" a = "+a);



       // int, byte , short, long double float, char boolean =>primitive 
        // int num;
        // num=90;
        // num=180;
        // num=78;
        // num=34*78*67;
        // //expression =>that can be solved further =>expression => yeild a single result
        // Identifiers id1;
        // id1=new Identifiers();

        // id1=null;
        // id1=new Identifiers();
        //variables =>they will hold some data that can vary
    }
}
