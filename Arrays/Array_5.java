// Wap to input 8 integers Element in an array arr [ ] and 
// stores them in revers order in another array rev[ ] 
// after increasing the element by 12.display the reversed array rev[ ].


import java.util.Scanner;

public class Array_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[]= new int[8];
        int rev[] = new int [8] ;
        int j = 7;
        System.out.println("Enter 8 integer elemnts :");
        for (int i = 0; i <8; i++) {
            arr[i]= sc.nextInt();
        }
        for (int i = 0; i < 8; i++) {
            rev[j] = arr[i]+12;
            j = j - 1;
        }
        System.out.println("The array with reversed value is :");
        for (int i = 0; i < 8; i++) {
            System.out.print(rev[i]+"\t");            
        } 
    }
}
