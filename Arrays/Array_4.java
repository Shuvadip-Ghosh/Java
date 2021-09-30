//Wap to input 10 integer value in an array num [] and 10 double type.values in another array dou[] . store the average of the corresponding values of both the arrays in avg[ ] .
package Arrays;

import java.util.Scanner;

public class Array_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num[] =new int[10];
        Double dou[] =new Double[10];
        Double avg[] =new Double[10];
        System.out.println("Enter 10 Integer elements : ");
        for (int i = 0; i < 10; i++) {
            num[i] = sc.nextInt();
        }
        System.out.println("Enter 10 Double elements : ");
        for (int i = 0; i < 10; i++) {
            dou[i] = sc.nextDouble();
        }
        System.out.println("The array containing the average of both the elements of the arrays are : ");
        for (int j = 0; j < 10; j++) {
            avg[j] = (num[j]+dou[j])/2;
            System.out.print(avg[j]+"\t");
        }

    }
    
}
