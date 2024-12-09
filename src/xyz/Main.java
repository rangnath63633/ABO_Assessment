package xyz;

public class Main implements Y,X{

    @Override
    public void display() {
        Y.super.display();
    }



    public static void main(String[] args) {
        Main m=new Main();

    }
}
