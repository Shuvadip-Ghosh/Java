// Wap to input 10 integet elements in an array. 
// Display the sum of all the prime elements in the array.
import java.util.Scanner; 
public class Array_6 {
    int prime(int n)
        {
            int i, c=0;
            for(i=2;i<n;i++){
                if(n%i==0)
                    c++;
            }
            if(c>0)
                    return 0;
            else
                    return 1;
        }
    public static void main(String[]args){
        Array_6 ob = new Array_6();
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[10];
        System.out.println("Enter the 10 Interger element");
        for(int i = 0; i<10;i++){
            arr[i] = sc.nextInt();
        }
        // long sum = ob.prime(arr[0]);
        // System.out.println(prime);
        long sum = 0 ;
        for(int i = 0; i<10;i++){
            int prime_res= ob.prime(arr[i]);
            if (prime_res == 1)
                sum = sum +arr[i];
        }
        System.out.println("sum of all the elements are : "+sum);
    }
}
