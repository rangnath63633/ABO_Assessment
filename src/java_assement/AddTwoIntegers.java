package java_assement;

// Your package imports here:
import java.util.Scanner;
public class AddTwoIntegers {
    public static void main(String[] args) {
        // Your code below:
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first integer: ");
        int n = sc.nextInt();
        System.out.println("Enter the second integer: ");
        int m=sc.nextInt();
        System.out.println("The sum of "+n+" and "+m+" is: "+(n+m));
    }
}
