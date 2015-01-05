import java.util.Scanner;

/**
 * Created by karolsudol on 25/10/2014.
 */
public class primes {
    public static void main(String[] args) {
        int j = 2;
        int num = 0;
        int res = 0;

        Scanner reader = new Scanner(System.in);
        System.out.println("Pls enter a number");

        num = reader.nextInt();

         while (j <= num/2){
             if (num % j == 0) {
                 res = 1;
             }

             j++;

             }
        if (res == 1){
            System.out.println("Number: " + num + " is Not Prime.");

         }
        else {
            System.out.println("Number: " + num + " is Prime. ");
        }
    }

}
