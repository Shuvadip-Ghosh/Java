/*
 * Q5. A certain company announces increment for the employees on seniority basis as per the given condition:
 *          Age            Increment(%)
 *          >=55           25% of the basic 
 *          >44   and <55     20% of the basic
 *          <=44          12% of the basic
 *          Write a program to calculate the new basic bu using the following class specifications:
 *          classname: Increment
 *          Data members/Instance variables:
 *                                String name; double basic; int age
 *          
 *          member methods:
 *          A default constructor to initialize the data members 
 *          A parameterised constructor to initialize the data members
 *          void copmpute(): To calculate the increment accrding to the age
 *          void print(): Prints the name, old basic, updated basic
 */ 
package Constructors;

public class Increment {
    String name; double basic, up_basic; int age;
    Increment(){
        name= "";
        basic=0.0d;
        up_basic=0.0d;
        age=0;
    }
    Increment(String nm, double b, int a){
        name=nm;
        basic=b;
        age=a;
    }
    void compute(){
        if(age>=55)
          up_basic=basic+basic*0.25;
        else
        if(age>=45)
           up_basic=basic+basic*0.2;
        else
           up_basic=basic+basic*0.12;
    }
    void print(){
        System.out.println("Name:"+name);
        System.out.println("Old Basic: "+basic);
        System.out.println("Updated Basic: "+up_basic);
    }
    public static void main(String[] args){
        Increment ob=new Increment();
        Increment ob1=new Increment("Samuel Franklin", 8500000, 45);
        ob1.compute();
        ob1.print();
    }
}
