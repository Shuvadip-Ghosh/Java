// Adam number is a number in which the square of a number and the square of its reverse are 
// reverse to each other.
import java.util.Scanner;
public class Adam {
    int rev(int n){
        int rev = 0;
        while (n!=0){
            int r = n%10;
            rev = rev*10+r;
            n = n/10;
        }
        return rev;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Adam ob = new Adam();
        System.out.println("Enter a number");
        int n = sc.nextInt();
        int nr = ob.rev(n);
        if(n*n == ob.rev(nr*nr)){
            System.out.println(n+" is a Adam Number");
        }
        else{
            System.out.println(n+" is not a Adam Number");
        }
    }
}
