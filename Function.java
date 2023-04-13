public class Function {


    public static void purchase(){
        System.out.println("tea");
        System.out.println("sugar");

    }
    public static void teaMaker(){
        System.out.println("Iam a cook");
        purchase();
        System.out.println("I make tea");
    }

    public static void main(String[] args) {
        System.out.println("i serve tea");
        System.out.println("i need tea");
        teaMaker();
        System.out.println("pour into cups ");
        System.out.println("serve");

    }
}
