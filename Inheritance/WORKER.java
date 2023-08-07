package Inheritance;

public class WORKER {
    String Name;Double Basic;
    public WORKER(String name, Double basic){
        Name = name;Basic = basic; 
    }
    void display(){
        System.out.println("The Basic pay for "+Name+" is: "+Basic);
    }
}
