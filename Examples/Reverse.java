 
public class Reverse {
    public static void main(String[] args)   
    {
        int number = 987654, reverse = 0;  
        for(;number !=0;number = number/10)
        {
            int remainder = number % 10;
            reverse = reverse * 10 + remainder;
        }
        System.out.println("The reverse of the given number is: " + reverse);
       // while(number != 0)   
       // {  
       //     int remainder = number % 10;  
       //     reverse = reverse * 10 + remainder;  
       //     number = number/10;  
       // }  
       // System.out.println("The reverse of the given number is: " + reverse);      
    }
}
