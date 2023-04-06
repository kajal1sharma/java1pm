public class Loops {
    public static void main(String[] args) {
        
        int firstTerm =0 ;
        int secondTerm =1;

        int n=9;

        if(n==1){
            System.out.print(firstTerm);
        }
        else if(n==2){
            System.out.println(secondTerm);
        }
        else{
            int newTerm =0;
            for(int i =3 ;i<=n ;i++){
                newTerm = firstTerm + secondTerm;
                firstTerm =secondTerm;
                secondTerm = newTerm;
            }
            System.out.print(n+"th term is "+newTerm);

        }



        //13*26*39*52*65*78*91*104*117*130 = (10)

        // long mul=1;
        // for(int i=1 ; i<=10 ;i++){
        //     mul=mul*(i*13);
        // }
        //System.out.println("mul = "+mul+" long max value = "+Long.MAX_VALUE );

        //13 + 26+ .....
        // int sum =0 ;

        // for(int i=1 ;i<=100 ;i=i+1){
        //     sum =sum + (i*13);
        // }
        // System.out.println("sum of 100 multiples of 13 = "+ sum);

        // for(int i=0;i<=20;i=i+2){
        //     System.out.println(i);
        // }

        // for(int i=0; i<=10 ;i=i+1){
        //     int table =i*2;
        //     System.out.println("2 * "+ i +" = "+table );
        // }

        // int sum =0;
        // for(int i =1 ;i<=20 ; i=i+1){
        //     sum=sum+i;
        // }
        // System.out.println("sum is "+sum);

        // System.out.println("now iam out of the loop");
    }
}
