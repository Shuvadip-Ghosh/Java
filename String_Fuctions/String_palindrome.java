// wap to input 5 words in an array. Display those words that are palindrome
import java.util.*;

class String_palindrome {
    void palindrome(String s) {
        String rev = "";
        for (int j = 0; j < s.length(); j++) {
            char c = s.charAt(j);
            rev = c + rev;
        }
        if (rev.equalsIgnoreCase(s) == true) {
            System.out.print(s + "\t");
        }
    }

    public static void main(String[] args) {
        String_palindrome obj = new String_palindrome();
        Scanner sc = new Scanner(System.in);
        String wrd[] = new String[5];
        System.out.println("Enter 5 word in the array");
        for (int i = 0; i < 5; i++) {
            wrd[i] = sc.next();
        }
        System.out.println("The elements of the array that are plaindrome-");
        for (int i = 0; i < 5; i++) {
            String s = wrd[i];
            s = s.trim();
            obj.palindrome(s);
        }
        
        sc.close();
    }
}
