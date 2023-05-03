import java.io.FileInputStream;
import java.io.PrintStream;

import javax.swing.plaf.synth.SynthToggleButtonUI;

public class StringBuild {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("statement");
//         System.out.println(str);
//         StringBuilder result = str.append(" one");
//         System.out.println(str);
//         System.out.println(str.length());
//         System.out.println("capacity "+str.capacity());
//         str=str.append("ndfjnkjdnsiasjfksjd");
//         System.out.println(str.length());
//         System.out.println("capacity "+str.capacity());
//         str=str.append("asdojisdfijasdjfjskdfjksdkjask");
//         System.out.println(str.length());
//         System.out.println("capacity "+str.capacity());
//         str=str.append("asdojisdfijasdjfjskdfjksdkhsdfuishfiusdhfhsdfhsdhfhsjdhfhjjask");
//         System.out.println(str.length());
//         System.out.println("capacity "+str.capacity());
// // capacity*2+2
//        System.out.println(str.hashCode());
       
        System.out.println(str.reverse());
        str.reverse();
        System.out.println(str.substring(2,7));
        System.out.println(str);
        StringBuilder str2= new StringBuilder(str);
        System.out.println(str.equals(str2));
        System.out.print(str.append(34.4f));
        

        
    }
}
