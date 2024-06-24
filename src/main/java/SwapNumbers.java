public class SwapNumbers {

    public static void main(String[] args) {
        System.out.printf("Hello and welcome!");
        int a = 10;
        int b = 20;
        swapNumbersUsingThirdVariable(a, b);
        swapNumbersUsingArithematicOperations(a, b);
        swapNumbersUsingOneLineCommand(a, b);
    }

    public static void swapNumbersUsingThirdVariable(int a, int b) {
        int c;
        c = a;
        a = b;
        b = c;
        System.out.println("Using third variable,the value of a is  " + a + " and the value of b is " + b);
    }

    public static void swapNumbersUsingArithematicOperations(int a, int b) {
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("Using plus minus arithematic operations,the value of a is  " + a + " and the value of b is " + b);
        a = a * b;
        b = a / b;
        a = a / b;
        System.out.println("Using multiply division arithematic operations,the value of a is  " + a + "and the value of b is " + b);
    }

    public static void swapNumbersUsingOneLineCommand(int a, int b) {
        b = a + b - (a = b);
        System.out.println("Using one line command,the value of a is  " + a + " and the value of b is " + b);
    }
}