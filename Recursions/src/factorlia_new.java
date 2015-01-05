import java.util.Scanner;

/**
 * Created by karolsudol on 31/10/2014.
 */
public class Fact {

    public static void main(String[] args) {

        int n;
        int result;

        System.out.println("Pls enter a num");

        Scanner reader = new Scanner(System.in);

        n = reader.nextInt();

        int calculateFactorial (int n) {

        if (n == 0) {
            return 1;
        }

        else {
            int result = n*calculateFactorial(n-1);
            return result;
        }
    }
}
