public class StringClass {
    public static void main(String[] args) {
        

      //"abcdef"=>" +aeiou+bcd+aeiou+f"

        String str="4Achievers is a institute";
        char arr[] ={'a','b','c','d','e','f'};
        String str2= new String(arr);
        


        String str3="";
        for(int i=0;i<str2.length();i++){
          if(str2.charAt(i)=='a'){
            str3=str3+str2.replace("a", "+aeiou+");
            
          }
         else if(str2.charAt(i)=='e'){
            str3=str3+str2.replace("e", "+aeiou+");
            
          }
          else if(str2.charAt(i)=='i'){
            str3=str3+str2.replace("i", "aeiou");
            
          }
         else  if(str2.charAt(i)=='o'){
            str3=str3+str2.replace("o", "aeiou");
            
          }
          else if(str2.charAt(i)=='u'){
            str3=str3+str2.replace("u", "aeiou");
            
          }
          else{
            str3=str3+str2.charAt(i);
            
          }
        }
        System.out.println(str2);
        System.out.println(str3);


        // String st=str.replace("is", "is not");
        // System.out.println(st);

        // String strarr[]= str.split(" ");
        // for(String s: strarr){
        //   System.out.print(s+" ,");
        // }
        
        // boolean result = str.endsWith("institut");
        // System.out.println(result);
        // boolean result =str.contains("is");

        // System.out.println(result);
        // int i =str.length();
        // String strresult = str.substring(0, 3);
        // String strresult2 = str.substring(4);
        // System.out.println(strresult);
        // System.out.println(strresult2);
        //program to insert single space after each letter
        // 4 A c h i e v e r s
        //char ch[]=new char[2*str.length()];
        // str.getChars(0, str.length()-1, ch, 0);
        
        // for(int i=0,j=0;i<str.length()*2;i=i+2,j=j+1){
        //   ch[i]=str.charAt(j);
        //   ch[i+1]=' ';
        // }

        // for(char c:ch){
        //   System.out.print(c);
        // }


                
        //output => sreveihcA4
        //program to reverse a string 


        // for(int i=0 ; i< str.length();i++){
        //   System.out.print(str.charAt(i));
        // }
        // System.out.print(
        //   "\n"
        // );
        // for(int i=str.length()-1 ; i>=0;i--){
        //   System.out.print(str.charAt(i));
        // }


        // System.out.println(str.charAt(5));
        // System.out.println(str.substring(3, 5));
        // System.out.println(str.substring(4));
        // System.out.println(str.length());
        // String str2= "first";
        // System.out.println(str.concat(str2));

        //  char ch[]=new char[12];
        //   str.getChars(0, 10, ch, 0);
        //   for(char c:ch){
        //     System.out.print(c);
        //   }

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
