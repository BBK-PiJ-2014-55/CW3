/**
 * Created by karolsudol on 27/10/2014.
 */
public class Recursive_Factorial {

    public static void main(String[] args) {

        System.out.println(fac(3));
    }

    public static int fac(int n){

        if (n == 1) {
            return 1;
        } else {
            return n*(fac(n-1));
        }


    }



}
