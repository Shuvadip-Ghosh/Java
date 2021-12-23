// wap to input 12 words in an arrayu. Display those words that are palindrome
import java.util.*;
class String_palindrome{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String wrd[] = new String[12];
        System.out.println("Enter 12 word in the array");
        for(int i =0; i<12; i++){
            wrd[i]=sc.next();
        }
        System.out.println("The elements of the array that are plaindrome-");          
        for(int i =0;i<12;i++){
            String s= wrd[1];
            s=s.trim();
            String rev = "";
            for(int j=0;j<s.length();j++){
                char c = s.charAt(j);
                rev=c+rev;
            }
            if(rev.equalsIgnoreCase(s)==true){
                System.out.print(s+"\t");
            }
        }
    }
}
