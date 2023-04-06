public class Whileloop {
    public static void main(String[] args) {
        
        int i =1;
        while(true){
            System.out.println(i*13+" " +i);
            if(i>90){
                break;
            }
            else{
                i=i*13;
            }

        }

        System.out.println("now iam out of the loop");

        //int i=0;
        // while(i<10){
        //     System.out.print("hello");
        //     System.out.println("world");

        //     i=i+1;
        // }

    }
}
