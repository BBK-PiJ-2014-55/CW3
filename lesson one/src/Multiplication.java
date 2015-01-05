import java.util.Scanner;

/**
 * Created by karolsudol on 25/10/2014.
 */
public class Multiplication {
    public static void main(String[] args) {

        double res = 0;
        int x = 0;

        Scanner reader = new Scanner(System.in);

        System.out.println("Pls enter a number");
        int num1 = reader.nextInt();

        System.out.println("Pls enter another number");
        int num2 = reader.nextInt();

        while (x < 2) {
            res = res + num1;
            x++;
        }

        System.out.print(res);





    }
}
