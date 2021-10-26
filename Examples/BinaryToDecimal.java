import java.lang.Math;
public class BinaryToDecimal {
    void while_loop(){
        int n = 1010101;
        int decimal=0,p=0;
        while(n!=0)
        {
            int r=n%10;
            decimal+= (r*Math.pow(2,p));
            n=n/10;
            p++;
        }
        System.out.println(decimal);
    }
    void for_loop(){
        int n = 1010101,sum =0;
        String s = Integer.toString(n);
        int total_length = s.length()-1;
        for (int i =0 ; i<s.length();i++){
            int cha = total_length-i;
            char c =  s.charAt(cha);
            int ci = Character.getNumericValue(c);
            sum += (ci * Math.pow(2,i));
        }
        System.out.println(sum);
    }
    public static void main(String[] args) {
        BinaryToDecimal ob = new BinaryToDecimal();
        ob.while_loop();
        ob.for_loop();
    }
}
