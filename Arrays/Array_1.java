// WAP to input 10 integer elements in an array. 
// Display the sum of even elements and product of the odd elements.

import java. util.Scanner;
public class Array_1 {
    public static void main(String[] args) {
        long sum=0, pro = 1;
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[10];
        System.out.println("Enter the 10 Interger element");
        for(int i = 0; i<10;i++){
            arr[i] = sc.nextInt();
        }
        sc.close();
        for(int i = 0; i<10;i++){
            if (arr[i]%2==0) {
                sum = sum +arr[i];
            } else {
                pro = pro*arr[i];
            }  
        }
        System.out.println("The sum of even numbers of the array is: "+sum);
        System.out.println("The product of odd numbers of the array is: "+pro);
        

    }
    
}
