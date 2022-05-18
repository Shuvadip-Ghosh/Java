// Wap to input 12 integer value in an array num [ ] and 
// display the maximum as well as minimum value in array.


import java.util.Scanner;

public class Array_2 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int num[] = new int[12];
        System.out.println("Enter 12 integer values in an array : ");
        for (int i = 0; i < num.length; i++) {
            num[i] = sc.nextInt();
            System.out.println(num[i]);
        }
        int max = num[0],min = num[0];
        for (int i = 0; i < num.length; i++) {
            if (max<num[i])
                max = num[i];
            if (min>num[i])
                min = num[i];
        }
        System.out.println("The maximum value is : "+max);
        System.out.println("The minimum value is : "+min);
    }
}
