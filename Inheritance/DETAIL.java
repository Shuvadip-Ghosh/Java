package Inheritance;

public class DETAIL {
    String name, address;long telno; Double rent;
    public DETAIL(String nam,String a,long t,Double r){
        name = nam;
        address = a;
        telno = t;
        rent = r;
    }
    void show(){
        System.out.println("Name of customer: "+name);
        System.out.println("Address of customer: "+address);
        System.out.println("telephone of customer: "+telno);
        System.out.println("Monthly Rent of customer: "+name);
    }
}
