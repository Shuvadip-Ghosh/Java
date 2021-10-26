 
public class GcdOrHcf {
    void while_loop(){
        int n1=50, n2=60;  
        while(n1!=n2)   
        {  
            if(n1>n2)  
                n1=n1-n2;  
            else  
                n2=n2-n1;  
        }  
        System.out.println("GCD of n1 and n2 is: " +n2); 
    }
    void for_loop(){
        int x = 12, y = 8, gcd = 1;  
        //running loop form 1 to the smallest of both numbers  
        for(int i = 1; i <= x && i <= y; i++)  
        {  
            //returns true if both conditions are satisfied   
            if(x%i==0 && y%i==0)  
            //storing the variable i in the variable gcd  
                gcd = i;  
        } 
        System.out.println("gcd of the two numbers is " + gcd); 
    }
    public static void main(String[] args) {
        GcdOrHcf ob = new GcdOrHcf();
        ob.while_loop();
        ob.for_loop();
    
    }
}
