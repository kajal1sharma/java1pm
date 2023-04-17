public class rest {
    static public int add(int a, int b){
        return a+b;
    }
    static public int add3num(int a, int b, int c){
        return a+b+c;
    }
    static public int addallnum(int ...arr){

        int sum=0;
        for(int ele:arr){
            sum=sum+ele;
        }
        return sum;
    }
    public static void main(String[] args) {
        

        addallnum(12, 13);
        addallnum(12,13,14);
        addallnum(12,13,14,15,15,16,17,17,15);
        add(12,13);
        add3num(12,13,14);
    }
}
