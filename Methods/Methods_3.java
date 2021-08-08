//Wríte a java program to display the reverse of all the buzz numbers from 100 to 125 using a method reverse (int n) which displays the reverse of n
package Methods;

public class Methods_3 {
    void reverse(int n)
    {
        int reverse = 0;
        while(n != 0)   
        {  
            int remainder = n % 10;  
            reverse = reverse * 10 + remainder;  
            n = n/10;  
        }  
        System.out.println("The reverse of the given number is: " + reverse);
    }
    public static void main(String[] args) {
        Methods_3 ob = new Methods_3();
        for(int i=100;i<=125;i++)
        {
            if((i%7==0)|| (i%10==0))
            {
                System.out.println(i);
                ob.reverse(i);
            }
        }
        
    }
}
