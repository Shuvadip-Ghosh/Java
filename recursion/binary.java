import java.util.Scanner;
public class binary {
    void main() {
        Scanner sc = new Scanner(System.in);
        binary obj = new binary();
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        System.out.print("Binary value of "+num+" is :");
        obj.decToBin(num);
    }
    void decToBin(int n) {
        if (n > 0) {
        decToBin(n / 2);
        System.out.print(n % 2);
        }
    }
}

