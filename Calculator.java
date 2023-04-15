import java.util.Scanner;

public class Calculator {
    

    public static int calc(int num1 , int num2, char op){

        int result =0;
              switch(op){
            case '+': result = num1+num2;
                        break;
            case '-':result = num1-num2;
                        break;

            case '*':result = num1*num2;
                        break;
            case '/':result = num1/num2;
                        break;
            
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        char choice;
        //while(true)
        for(;true;){
            System.out.println("Do you want to do calculation");
            choice = scanner.next().charAt(0);
            if(choice=='Y' || choice=='y'){
                System.out.println("Enter first number");
                int num1 = scanner.nextInt();
                System.out.println("Enter second number");
                int num2 = scanner.nextInt();
                System.out.println("which operator");
                char sym = scanner.next().charAt(0);
                if(sym == '+' || sym == '-' || sym =='*' || sym == '/'){  
                    int result = calc(num1, num2, sym);
                    System.out.println("the result is : "+result);
                }
                else{
                    System.out.println("the symbol is incompatible");
                }
            }
            else{
                break;
            }
        }

    }
}
