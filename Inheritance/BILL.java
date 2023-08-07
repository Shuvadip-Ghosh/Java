package Inheritance;

public class BILL extends DETAIL {
    int n; Double amt,mrent;
    public BILL(String nam,String a,long t,Double r,int nu){
        super(nam, a,t,r);
        mrent  = r;
        n=nu;
        amt= 0.0;
    }
    void calculate(){
        if (n>=1 && n<=100) {
            amt = mrent;
        } else if (n>=101 && n<=200){
            amt = mrent+((n-100)*0.6);
        } else if (n>=201 && n<=300){
            amt = mrent+((n-200)*0.8)+(99*0.6);
        } else if (n>300) {
            amt = mrent+(99*0.6)+(99*0.8)+ (n-300);
        }
    }
    void show(){
        super.show();
        System.out.println("Amount to be paid by customer: "+amt);
    }
}
