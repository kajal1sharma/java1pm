public class Loops {
    public static void main(String[] args) {
        
        // for(int i=0;i<=20;i=i+2){
        //     System.out.println(i);
        // }

        // for(int i=0; i<=10 ;i=i+1){
        //     int table =i*2;
        //     System.out.println("2 * "+ i +" = "+table );
        // }

        int sum =0;
        for(int i =1 ;i<=20 ; i=i+1){
            sum=sum+i;
        }
        System.out.println("sum is "+sum);

        System.out.println("now iam out of the loop");
    }
}
