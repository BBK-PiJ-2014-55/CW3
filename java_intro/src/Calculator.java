import java.util.Scanner;

/**
 * Created by karolsudol on 03/11/2014.
 */
public class Calculator {

    public void main(String[] args) {

        Scanner user_input = new Scanner(System.in);

        System.out.println("welcome to java calc");

        System.out.print("pls enter your first number");
        int num1 = user_input.nextInt();

        System.out.print("pls enter your second number");
        int num2 = user_input.nextInt();

        System.out.print("Enter operation to perform (+,-,x,/):");
        String oper = user_input.next();

        if (oper.equals("+")) {
            System.out.println(MyMath.add(num1, num2));
        } else if (oper.equals("-")) {
            System.out.println(MyMath.sub(num1, num2));
        } else if (oper.equals("*")) {
            System.out.println(MyMath.mul(num1, num2));
        } else if (oper.equals("/")) {
            System.out.println(MyMath.div(num1, num2));
        } else if (oper.equals("%")) {
            System.out.println(MyMath.mod(num1, num2));
        } else System.out.println("The operation is not valid.");
    }
}
