import java.util.*;
class hubble
{
    public static void main(String[] args)
    {
        hubble ob = new hubble();
        Scanner sc=new Scanner(System.in);
        String s = sc.next();
        for(int i =0 ; i<(2*s.length())-1;i++){
            int col = (i<s.length()) ? i : (2*s.length()-i-2);
            for(int j =0;j<=col;j++){
                System.out.print(s.charAt(j));
            }
            System.out.println();
        }
    }
}
