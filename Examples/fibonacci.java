 
public class fibonacci {
    void for_loop(){

    }
    void while_loop(){
       int n = 10,i=1;
       long sum ,n1=0,n2=1;
       System.out.println("Fibonacci series till 10 is :");
       while(i<=n){
            System.out.println(n1);
            sum = n1+n2;
            n1=n2;
            n2=sum;
            i++;
       }
    }
    public static void main(String[] args) {
           fibonacci ob = new fibonacci(); 
           ob.while_loop();
           ob.for_loop();
    }
}
