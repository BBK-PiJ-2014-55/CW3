/**
 * Created by karolsudol on 27/10/2014.
 */
public class Recursive {

    public static void main(String[] args) {

        static void factorial(int n) {
            int value = 0;

            if (n == 1) {
                return 1;
            } else {
                return n * (factorial(n-1));
            }
        }
    }
}
