// Wap to input 8 double type values in an array named val [ ] and 
// store the triple of each one in another array tri [ ] . display both the array.


import java.util.Scanner;

public class Array_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double val[]=new double[8];
        double tri[]=new double[8];
        System.out.println("Enter 8 Double elemnts : ");
        for (int i = 0; i < val.length; i++) {
            val[i] =  sc.nextDouble();            
        }
        System.out.println("The array with values trippled is : ");
        for (int i = 0; i < tri.length; i++) {
            tri[i] = val[i]*3;
            System.out.println(tri[i]+"\t");
        }
    }
}
