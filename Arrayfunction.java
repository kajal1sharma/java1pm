public class Arrayfunction {

    public static void add(int[] num){

        int sum=0;
        //foreach
        for(int ele :num){
            System.out.println(ele);
            sum=sum+ele;
        }
        System.out.println("and the sum is "+ sum);

        //equivalent for loop
        // for(int i=0;i<num.length ;i++){
        //     int ele =num[i];
        //     sum=sum+ele;
        // }

    }

    public static void main(String[] args) {
        int []arr =new int[5];
        arr[0]=1;
        arr[1]=10;
        arr[2]=13;
        arr[3]=-90;
        arr[4]=-12;

        int a=90;
        add(arr);
    }
}
