 
public class Reverse {
    public static void main(String[] args)   
    {
        int number = 987654, reverse = 0,rev=0;  
        int num = 987654;
        System.out.println("The Number Before reversing : "+num);
        for(;number !=0;number = number/10)
        {
            int remainder = number % 10;
            reverse = reverse * 10 + remainder;
        }
        System.out.println("The reverse of the given number is: " + reverse);
        while(num != 0)   
        {  
            int rem = num % 10;  
            rev = rev * 10 + rem;  
            num = num/10;  
        }  
        System.out.println("The reverse of the given number is: " + reverse);      
    }
}
