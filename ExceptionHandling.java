public class ExceptionHandling {
    public static void main(String[] args) {
        try{
            int a[]=new int[5];
            a[6]=89;
        }
        catch(ArithmeticException exe){
            System.out.println(exe);
            int a=13/4;
            System.out.println(a);
        }
        catch(Exception exe){
            System.out.println(exe);
            System.out.println("some other exception");
        }

        System.out.println("hi iam a statement in normal flow");

    }
}
