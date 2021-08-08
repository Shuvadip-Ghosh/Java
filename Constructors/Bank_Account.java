// Class :Bankaccount
// Deta members:
// String name(name of the depositer );long acc_ no(account number);double b_amt ( balance amount);
// Member methods:
// A default constructor to initialize the instance variables.
// void input(): to input name, acc_no, b_amt
// vold deposit(double damt): deposit an amount (damt)
// vold withdraw(double wamt): withdraws an amount (want) 
// void display(): displays the name, account number, balance amount
// Write a main method to create an object and call the above methods.

package Constructors;
import java.util.Scanner;
public class Bank_Account {
    String name;long acc_no;double b_amt;
    public Bank_Account(){
        name = "";
        acc_no = 0L;
        b_amt = 0.0d;
    }
    public static void main(String[] args) {
        Bank_Account ob= new Bank_Account();
        ob.input();
        ob.deposit(56000.99); 
        ob.withdraw(25478.98);
        ob.display();
    }
    void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name, account number and balance amount");
        name = sc.nextLine();
        acc_no = sc.nextLong();
        b_amt = sc.nextDouble();
        sc.close();
    }
    void deposit(double damt){
        b_amt = damt +b_amt;
    }
    void withdraw(double wamt){
        if(b_amt>wamt)
            b_amt = b_amt-wamt;
        else
            System.out.println("You Dont have so much money in your bank account.\nWould you like to take a loan");
    }
    void display(){
        System.out.println("Name: "+name);
        System.out.println("Account number: "+acc_no);
        System.out.println("Balance amount: "+b_amt);
    }
}
