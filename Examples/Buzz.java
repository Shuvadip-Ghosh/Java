import java.util.Scanner;
public class Buzz{
    public static void main(String[]args){
       int n = 700307;
       if(n%10==7 || n%7==0){
           System.out.println(n+" is a Buzz Number");
       }
       else{
           System.out.println(n+" is not a buzz number");
       }
    }
}
