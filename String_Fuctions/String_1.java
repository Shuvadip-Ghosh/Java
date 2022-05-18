// wap to write a program with prints the first letter of ever word in the sentence.
// Sample Input: Buses are plying from morning
// Sample Output: BAPFM

import java.util.Scanner;
public class String_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Sentence : ");
        String sen = sc.nextLine();
        sen = sen.trim();
        sen = " "+sen.toUpperCase();
        String result = "";
        for (int i = 0; i < sen.length(); i++) {

            if (sen.charAt(i) == ' ') {
                result += sen.charAt(i+1);
            }
        }
        System.out.println(result);
    }
}
