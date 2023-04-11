import java.util.Scanner;
class Array{
    public static void main(String[] args) {
       Scanner sc  = new Scanner(System.in);
    //     String  a =sc.nextLine();

            // int student1 =90;
            // int student2 =12;
            // int student3 =34;
            // int student4 =90;

            // student1/500*100
            int []marks = new int[10];

            double marks2[] ={12.2,123.4,213.3,34,23.3};

            for(int i=0;i<marks.length;i++){
                System.out.println(i+" value  :" );
                marks[i]=sc.nextInt();
            }

            int sum=0;
            for(int i=0;i<marks.length ;i++){
                sum=sum+marks[i];
            }
            System.out.println(sum);

            // System.out.println("the value are as follows :");
            // for(int i =0 ;i <=9 ;i++){
            //     System.out.println(marks[i]);
            // }
            // marks[0]=9;
            // marks[1]=10;
            // marks[2]=34;
            // marks[4]=90;

            // System.out.println(marks[0]+"  "+marks[1]+" "+marks[2]+" "+marks[3]+" "+marks[4]);
            // System.out.println(marks[5]+" "+marks[6]+" "+marks[7]+" "+marks[8]+" "+marks[9]);

            
    
        }
}