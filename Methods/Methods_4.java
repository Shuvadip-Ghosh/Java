//Wap to display all the palindrome numbers between 350 and 415 using a method reverse (int n) which returns the reverse of n
package Methods;

public class Methods_4 {
    int reverse(int n)
    {
        int reverse = 0;
        while(n != 0)   
        {  
            int remainder = n % 10;  
            reverse = reverse * 10 + remainder;  
            n = n/10;  
        }  
        return reverse;
    }
    public static void main(String[] args) {
        Methods_4 ob = new Methods_4();
        int i,re;
        for(i=350;i<=415;i++)
        {
            re = ob.reverse(i);
            if(i==re)
            {
                System.out.println(re+"\t");
            }
        }
    }
}
