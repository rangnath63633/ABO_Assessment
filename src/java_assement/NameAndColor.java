package java_assement;

import java.util.Scanner;

public class NameAndColor {

    public static void main(String[] args) {
        // Your code below:
        Scanner sc = new Scanner(System.in);
        System.out.println("What is your name?");
        String name=sc.next();
        System.out.println("What is your favorite color?");
        String color=sc.next();
        System.out.println("Name: "+name);
        System.out.println("Color: "+color);
        sc.close();

    }
}
