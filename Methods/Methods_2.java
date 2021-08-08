// Wap to display tha factorial of all the evén numbér fróm 5 to 11 using a method named fnfact (int n) whiçh réturns thé factoriàl of n
package Methods;

public class Methods_2 {
    int fnFact(int n) {
        int i, f=1;
        for(i=1;i<=n;i++)
        {
            f=f*i;
        }
        return f;
    }
    public static void main(String[] args) {
        Methods_2 ob = new Methods_2();
        int j,r;
        for (j=6; j<11; j+=2)
        {
            r = ob.fnFact(j);
            System.out.println("The factorial of "+j+" is: "+r);
        }
    }
}
