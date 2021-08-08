/**
 * class name: Income_Tax
 * member medhods:
 *       A default constructor to initialize  the data members.
 *       A parameterised constructor to initialize the data members.
 *       void calculate(): calculates the tax payable as per the given tariff:
 *                     Taxable income                     income Tax
 *                     upto 3,00,000                         NIL
 *                  >3lakhs and <=6 lakhs                 (ti-300000)*12%
 *                  >6 lakhs and <=10 lakhs           [(ti-600000)*20%]+25000
 *                       >10 lakhs                    [(ti-1000000)*30%]+50000
 *       void display():displays
 */
package Constructors;

public class Income_Tax {
    String name; double ti, tax;
    Income_Tax()
    {
        name=null;
        ti=0.0d;
        tax=0.0d;
    }
    Income_Tax(String nm, double inc)
    {
        name=nm;
        ti=inc;
    }
    void calculate()
    {
        if(ti<=300000)
           tax=0.0;
        else if(ti<=600000)
            tax=(ti-300000)*0.12;
        else if(ti<=1000000)
            tax=((ti-600000)*0.2)+25000;
        else
            tax=((ti-1000000)*0.3)+50000;
    }
    void display()
    {
        System.out.println("Name:"+name);
        System.out.println("Total Yearly Income Rs."+ti);
        System.out.println("Tax payable: Rs."+tax);
    }
    public static void main(String[] args)
    {
        Income_Tax ob=new Income_Tax();
        Income_Tax ob1=new Income_Tax("Samuel Franklin", 8500000);
        ob1.calculate();
        ob1.display();
    }
}
