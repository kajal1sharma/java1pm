public class StringClass {
    public static void main(String[] args) {
        

        String str="4Achievers";
        System.out.println(str.charAt(5));
        System.out.println(str.substring(3, 5));
        System.out.println(str.substring(4));
        System.out.println(str.length());
        String str2= "first";
        System.out.println(str.concat(str2));

         char ch[]=new char[12];
          str.getChars(0, 10, ch, 0);
          for(char c:ch){
            System.out.print(c);
          }

        // StringBuffer str = new StringBuffer("tree");
        // str.append("123");
        // StringBuffer str2 = new StringBuffer("tree");
        // StringBuffer str3 = new StringBuffer("tree");
        // StringBuffer str4 = new StringBuffer("tree");
        // String str="tree";
        // String str2="tree";
        // String str3 ="tree";
        // String str4= new String("tree");

        // System.out.println(str.hashCode());
        // System.out.println(str2.hashCode());
        // System.out.println(str3.hashCode());
        // System.out.println(str4.hashCode());
        //string => immutable
    }
}
