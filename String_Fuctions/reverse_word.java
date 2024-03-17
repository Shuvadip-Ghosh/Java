// Wap to input a word and display its reverse
import java.util.*;
 class reverse_word{
     public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a word : ");
        String w = in.next();
        String rev = "";
        w= w.trim();
        for(int i=0;i<w.length();i++){
            char ch = w.charAt(i);
            if(ch!=' '){
                rev = ch+rev;
            }
        }
        System.out.println("The Reversed word is : "+rev);
        in.close();
     }
 }
