public class Arrayfunction {

    // public static void add(int[] num){

    //     int sum=0;
    //     //foreach
    //     for(int ele :num){
    //         System.out.println(ele);
    //         sum=sum+ele;
    //     }
    //     System.out.println("and the sum is "+ sum);

    //     //equivalent for loop
    //     // for(int i=0;i<num.length ;i++){
    //     //     int ele =num[i];
    //     //     sum=sum+ele;
    //     // }

    // }

    public static int add3Num(int num1, int num2, int num3){
        return num1+num2+num3;

    }
    public static int addtwoNum(int num1, int num2){
        return num1+num2;

    }

    public static void add( int...arr){
        //int arr[] = rest;
        for(int ele: arr){
            System.out.println(ele);
            
        }

    }
    public static void main(String[] args) {
        add(12,13,14,15,16);
        add();
        int []arr1= null;
        // int []arr =new int[5];
        // arr[0]=1;
        // arr[1]=10;
        // arr[2]=13;
        // arr[3]=-90;
        // arr[4]=-12;

        // int a=90;
        // add(arr);
         
        // int sum2= addtwoNum(12,13);
        // int sum = add3Num(12, 13,14);
        // System.out.println(sum);
    }
}
