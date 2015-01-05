/**
 * Created by karolsudol on 27/10/2014.
 */
public class a_print_nos {
    public static void main(String[] args) {
        printNumbers(6);


    }

    static void printNumbers(int n) {
        if (n <= 0) {
            return;
        }
        System.out.println(n);
        printNumbers(n - 2);
        printNumbers(n - 3);
        System.out.println(n);


    }

}

//    public static void main(String[] args) {
//
//        System.out.println(n);
//        printNumbers(n-2);
//        printNumbers(n-3);
//        System.out.println(n);

//}


