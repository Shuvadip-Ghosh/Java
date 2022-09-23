import java.util.Scanner;
public class Tech_num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to check if it is a tech number or not: ");
        int n = sc.nextInt();
        String num = Integer.toString(n);
        if(num.length()%2==0){
            int n1= Integer.parseInt(num.substring(0, (num.length()/2)));
            int n2= Integer.parseInt(num.substring((num.length()/2)));
            if (n==Math.pow(n1+n2,2)) {
                System.out.println(n+" is a Tech number");
            }
            else
                System.out.println(n+" is not a Tech Number");
        }
        else
            System.out.println(n+" is not a tech number");
    }
}