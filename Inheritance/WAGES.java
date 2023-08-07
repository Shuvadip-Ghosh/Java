package Inheritance;

public class WAGES extends WORKER {
    int hrs;Double rate,wage;
    public WAGES(String n,Double wage,Double r,int h){
        super(n, wage);
        hrs = h;
        rate = r;
    }
    double overtime(){
        wage = wage + (rate*hrs);
        return wage;
    }
    void display(){
        super.display();
        System.out.println("Overtime: "+hrs+"h");
        System.out.println("Rate per hour: "+rate);
        System.out.println("Final Pay(Basic Pay + Overtimer smount): "+overtime()+"Rs");
    }
}
