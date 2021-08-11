package Basics;
import java.util.Scanner; //import scanner class for taking input
public class basics {
    public static void main(String args[]){ 
    System.out.println("Hello World"); 
    // Taking Input
    // create an object of Scanner class
    Scanner input = new Scanner(System.in);
    // take input from the user
    // string input
    String varName = input.nextLine();
    // integer input
    int n1 = input.nextInt();
    int n3 = input.nextInt();
    // double input
    double n2 = input.nextDouble();
    // character input
    char a = input.next().charAt(0);


    // if else
    if (n1>n2) {
        // If condition is True then this block will get executed
    } 
    else if (n2>n1) {
        // Codes
    }
    else {
        // If condition is False then this block will get executed
    }


    // Ternery Operator
    // max = (n1 > n2) ? n1 : n2;
    } 
}
