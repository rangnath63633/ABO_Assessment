package java_assement;

public class MathFunctions {

    class Addition {
        public int add(int a, int b) {
            return a + b;
        }
    }

    class Subtraction {
        public int subtract(int a, int b) {
            return a - b;
        }

        public static void main(String[] args) {
            MathFunctions mathFunctions = new MathFunctions();

            MathFunctions.Addition addition = mathFunctions.new Addition();
            int sum = addition.add(10, 5);

            MathFunctions.Subtraction subtraction = mathFunctions.new Subtraction();
            int difference = subtraction.subtract(10, 5);

            System.out.println("Addition result: " + sum);
            System.out.println("Subtraction result: " + difference);
        }
    }
}
