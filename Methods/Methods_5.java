/*
Define a class to overload a function area that computes the following.
area (double b, double h):
returns the area of the parallelogram.(area=base×height)
area(int d1,d2)
returns the area of the rhombus (area =1/2×(d1*d2))
area (int s)
returns the area of the square of sides s
Write a main method to create an object and call above methods
*/
package Methods;

public class Methods_5 {
    double area (double b, double h)
    {
        return b*h;
    }
    int area(int d1,int d2)
    {
        return (d1*d2)/2;
    }
    int area(int s)
    {
        return s*s;
    }
    public static void main(String[] args) {
        Methods_5 ob = new Methods_5();
        double r1 = ob.area(5.6, 1.0);
        System.out.println(r1);
        int r2= ob.area(5, 6);
        System.out.println(r2);
        int r3 = ob.area(7);
        System.out.println(r3);

    }
}
