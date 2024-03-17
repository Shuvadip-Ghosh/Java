// Class name : Result
// Data members : String name ( name of the student) ; int m1 m2 M3 m4 ( marks of four subjects out of 100);
// int tot(total marks), maxmarks(maximum marks) , double avg(average marks)
// Member methods :
// 1) A parameterised constructor to input the name amd marks of the student
// 2) to compute the total marks , maximum marks and the average marks obtained by the student
// 3) To display the name, total, maximum and the average.
package Constructors;

public class Result {
    int tot,m1,m2,m3,m4,maxmrk;
    String name;
    double avg;
    Result(String nm, int mr1,int mr2,int mr3,int mr4){
        name = nm;
        m1 = mr1;
        m2 = mr2;
        m3 = mr3;
        m4 = mr4;
    }
    void compute(){
        tot = m1+m2+m3+m4;
        avg = tot/4.0;
        maxmrk = Math.max(m4, Math.max(m3, Math.max(m2, m1)));
    }
    void display(){
        System.out.println("The name of the student is: "+name);
        System.out.println("The Total marks of the student is: "+tot);
        System.out.println("The Average marks of the student is: "+avg);
        System.out.println("The Maximum marks of the student is: "+maxmrk);
    }
    public static void main(String[] args) {
        Result ob = new Result("Reema Poddar", 78,98,56,89);
        ob.compute();
        ob.display();
    }
}
