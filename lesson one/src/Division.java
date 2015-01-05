import java.util.Scanner;

/**
 * Created by karolsudol on 25/10/2014.
 */
public class Division {
    public static void main(String[] args) {

        System.out.println("Pls enter 3 numbers");

        String str = System.console().readLine();

        int num1 = str.charAt(0);
        int num2 = str.charAt(1);
        int num3 = str.charAt(2);

        if (num1 > num2) {
            int temp = num1;
            num1 = num2;
            num2 = temp;
        }

        if (num2 > num3) {
            int temp = num2;
            num2 = num3;
            num3 = temp;
        }

        if (num3 > num2) {
            int temp = num3;
            num3 = num2;
        }




        

               
    }

}
