// Q9. Write a Java program to input two numbers and display whether they are twin 
//        prime or not, using  a method prime(int n) which returns 1 if 'n' is a prime 
//       number otherwise it returns 0.
//       A pair of prime numbers whose difference is 2, is called Twin Prime.
//       Example: 11, 13; 17,19; etc are twin primes.

package Methods;
import java.util.*;
class Twin_Prime
{
        int prime(int n)
        {
                int i, c=0;
                for(i=1;i<=n;i++){
                if(n%i==0)
                c++;
                }
                if(c==2)
                        return 1;
                else
                        return 0;
        }
        void main()
        {
                Scanner sc=new Scanner(System.in);
                Twin_Prime ob = new Twin_Prime();
                System.out.println("Enter the two number");
                int n1=sc.nextInt();
                int n2=sc.nextInt();
                int r1,r2;
                r1=ob.prime(n1);
                r2=ob.prime(n2);
                if((r1==1) &&(r2==1)){
                        int d=Math.abs(n1-n2);
                        if(d==2){
                                System.out.println(n1+" and "+n2+" are twin prime");
                        }
                        else{
                                System.out.println(n1+" and "+n2+" are not twin prime");
                        }
                }
                else{
                        System.out.println(n1+" and "+n2+" both are not prime numbers");
                }

        }
}





