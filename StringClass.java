public class StringClass {


     static String reverse(String str){

      String res ="";
      for(int i=str.length()-1 ; i>=0;i--){
        res+=str.charAt(i);
        //res=res+str.charAt(i);
      }

      return res;
     }

    //  static boolean isPalindrome(String str){

    //   // String strrev= reverse(str);
    //   // return strrev.equals(str);

  
    //   for(int i=0,j=str.length()-1;i<str.length()/2;i++,j--){

    //       if(str.charAt(i)==str.charAt(j)){
    //         continue;
            
    //       }
    //       else{
    //         return false;
    //       }
         
    //   }
    // return true;

    // }


    // static String replaceChar(String str, char c){

    //   String result="";
    //   for(int i=0;i<str.length();i++){
    //     if(str.charAt(i)==c){
    //       result = str.substring(0, i)+str.substring(i+1);
    //       str=result;
    //       i--;
    //     }
    //   }

    //   return  result;
    // }
    static String replace2(String str){

      String str2[]=str.split(" ");
      str="";
      
      for(String r: str2){
        
        str=str +reverse(r)+" ";
        
      }
      return str;
    }
    public static void main(String[] args) {


      //reverse words in a string

      String str= "iam a new String";
      System.out.println(replace2(str));      
      //output=> "mai a wen gnirtS";

      //remove a particular charater from a string

      // String str = "abc d sskdfjksfdk";
      // char remove = 's';

      // String result =str.replaceAll("s", "");
      // System.out.println(result);
      // String result = replaceChar(str, remove);
      // System.out.println(result);



      //ans => "abc d kdfjkfdk"

      //check if your string is palindrome or not

      // String s1="abcdcba";
      // String s2="abcdefrgacba";

      // System.out.println(isPalindrome(s1));
      // System.out.println(isPalindrome(s2));



      //"abcdef"=>" +aeiou+bcd+aeiou+f"

        // String str="4Achievers is a institute";
        // char arr[] ={'a','b','c','d','e','f'};
        // String str2= new String(arr);

        // String str3="";
        // System.out.println(str2);
        
        // for(int i=0;i<str2.length();i++){
        //   System.out.println(str2.charAt(i));
        //   char c= str2.charAt(i);
        //   if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u'){
        //       str3=str3+"+aeiou+";
        //   }
        //   else{
        //       str3=str3+c;
        //   }
        // }

        // System.out.println(str3);

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
