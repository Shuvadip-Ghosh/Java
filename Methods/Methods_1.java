// WAP to  display the factors of all the numbers that are multiple of 5 from 50 to 119 using a methjod named factor (int n)
//which displays the factors of n
package Methods;

public class Methods_1 {
    void factors(int n) {
        int i;
        System.out.println("Factor for " + n +" is:");
        for(i=1;i<=n;i++)
        {
            if (n%i == 0)
            {
                System.out.println(i+"        ");
            }
            
        }
    }
    public static void main(String[] args) {
        Methods_1 ob = new Methods_1();
        int j;
        for (j=50;j<= 119; j++)
        {
            if(j%5==0)
            {
                ob.factors(j);
                System.out.println();
            }
        }
    }
}
