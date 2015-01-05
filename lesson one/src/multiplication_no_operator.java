import sun.tools.java.ScannerInputReader;

import java.util.Scanner;

/**
 * Created by karolsudol on 25/10/2014.
 */
public class multiplication_no_operator {
    public static void main(String[] args) {

        int num1, num2;

        System.out.println("Pls enter a num");

        Scanner reader = new Scanner(System.in);

        num1 = reader.nextInt();

        System.out.println("Pls enter another num");

        num2 = reader.nextInt();

        System.out.println(new multiplication_no_operator().getResult(num1, num2));
     }
    public int getResult(int i, int j) {

        int result = 0;

        for (int k = 0; k < i; k++ ) {
            for (int p = 0; p < j; p++) {
                result++;
            }
        }
        return result;

    }


}
