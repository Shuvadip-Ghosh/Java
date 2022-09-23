import java.util.Scanner;
public class Magic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Magic ob = new Magic();
        System.out.print("Enter a number to check if it is Magic umber or not:");
        int n = sc.nextInt();
        boolean b = ob.sumOfDigit(n);
        if (b) {
            System.out.println(n+" is a Magic number");
        } else {
            System.out.println(n+" is not a magic number");
        }
    }
    boolean sumOfDigit(int n){
        while (n>9) {
            int sum =0;
            while (n!=0) {
                int r =n%10;
                sum = sum+r;
                n = n/10;
            }
            n= sum;
        }
        if(n==1)
            return true;
        return false;
    }
}
