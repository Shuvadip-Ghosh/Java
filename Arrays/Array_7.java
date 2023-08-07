// This test wastaken on 21\01\22
// Write a Java program to input 12 character type elements in an array. 
// Store all the elements that are vowels in an array namel vow[ ]. 
// Display the original array as well as vow[ ]
import java.util.Scanner;
public class Array_7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch[] = new char[12];
        char vow[] = new char[12];
        int c=0;
        System.out.println("Enter 12 character elements: ");
        for(int i=0;i<12;i++){
            ch[i] = sc.next().charAt(0);
        }
        for(int i=0;i<12;i++){
            char cha = ch[i];
            cha = Character.toUpperCase(cha);
            if((cha=='A')||(cha=='E')||(cha=='I')||(cha=='O')||(cha=='U')){
                vow[c] = ch[i];
                c++;
            }
        }
        for(int i=0;i<12;i++)
            System.out.print(ch[i]+"\t");
        System.out.println();
        for(int i=0;i<12;i++)
            System.out.print(vow[i]+"\t");

    }
}