/*
Define a class BookFair with the following description:
    Instance variables / data members:
   String Bname:  name of the book
   double a_price: actual price of the book
   double d_price: price of the book after discount
   Member methods:
   void input(): inputs the name of the book and its actual price
   void discount(): calculates the price of the book after discount based on the following criteria:

Price Discount
            Above 3000    25%
            2000 to 3000  15%
            Below 2000     5%
  void display(): Displays the book’s name, actual price and the discounted price
  Write a main method to create an object of the class and call the above methods.
*/
package Methods;
import java.util.Scanner;
public class Methods_6 {
    String Bname; 
    double a_price;
    double d_price;
    void input(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the name of the book and its actual prince");
        Bname = sc.nextLine();
        a_price = sc.nextDouble();
        sc.close();
    }
    void discount()
    {
        if(a_price>3000)
            d_price = a_price-(a_price*0.25);
        if(a_price<=3000||a_price>=2000)
            d_price = a_price-(a_price*0.25);
        if(a_price<2000)
            d_price = a_price-(a_price*0.05);
    }
    void display()
    {
        System.out.println("Book\'s name : "+Bname);
        System.out.println("Actual Price : "+a_price);
        System.out.println("Discount Price : "+d_price);

    }
    public static void main(String[] args) {
        Methods_6 ob = new Methods_6();
        ob.input();
        ob.discount();
        ob.display();
    }
}
