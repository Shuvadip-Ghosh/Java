public class Armstrong {
    void while_loop(){
        int n = 153,sum = 0;
        int n1 = n;
        while(n!=0){
            int r = n%10;
            sum = sum+(r*r*r);
            n = n/10;
        }
        if (n1 == sum){
            System.out.println(n1+" is a Armstrong Number");
        }
        else{
            System.out.println(n1+" is not a Armstrong number");
        }
    }
    void for_loop(){
        int n = 153,sum = 0;
        int n1 = n;
        for (;n!=0;n=n/10){
            int r = n%10;
            sum = sum +(r*r*r);
        }
        if (n1 == sum){
            System.out.println(n1+" is a Armstrong Number");
        }
        else{
            System.out.println(n1+" is not a Armstrong Number");
        }
    }
    public static void main(String[] args) {
     Armstrong ob = new Armstrong();
     ob.while_loop();
     ob.for_loop();
    }
}
