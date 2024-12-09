package xyz;

import java.util.List;

public class Example2 {
    public static void main(String[] args) {

    ArithematicOperation add = (a,b) -> a+b;
        ArithematicOperation sub = (a,b) -> a-b;
        ArithematicOperation multiplication = (a,b) -> a*b;
        ArithematicOperation division = (a,b) -> {
            if(b == 0){
                System.out.println("division by zero not possible");
                return 0;
            }
            return a/b;
        };

    }
}
class DivisionByZero extends Exception{
    String message;

    public DivisionByZero(String message) {
        this.message = message;
    }
}
final class Parent{
    String firstName;
    String lastName;
    List<Children> childrens;
    Address address;

//    private Parent(String firstName, String lastName, List<Children> childrens, Address address){
//
//    }




}
class Children{
    String firstName;
    String lastName;
}
class Address{
    String homeNo;
    String town;
    String state;
}


//--------------
@FunctionalInterface
interface ArithematicOperation{
    double operate(double a, double b);
}

