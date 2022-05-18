// Wap to input a word and make it palindrome.
import java.util.Scanner;
public class word_palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word = sc.next();
        word = word.trim();
        String rev = "";
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if(ch!=' ')
                rev = ch+rev;
        }
        String rev_word = word+rev;
        System.out.println(rev_word);
    }
}
