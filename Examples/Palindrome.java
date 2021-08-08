package Examples;
import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Enter A number for checking of Palindrome Number: ");
        n= sc.nextInt();
        sc.close();
        int n1 =n;
        int reverse = 0;
        while(n != 0)   
        {  
            int remainder = n % 10;  
            reverse = reverse * 10 + remainder;  
            n = n/10;  
        }
        if (reverse == n1)
        {
            System.out.println(reverse+" is a Palindrome Number");
        }
        else
        {
            System.out.println(n1+" is not a Palindrome Number");
        }

    }
}
