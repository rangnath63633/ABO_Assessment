package xyz;

public interface X {
    default void display(){
        System.out.println("x");
    }


}

interface Y{
    default void display(){
        System.out.println("y");
    }
}

