/**
 * Created by karolsudol on 03/11/2014.
 */
public class CopyArray {


    public static void main(String[] args) {

        int [] src = {1,2,3,4,5,6};
        int [] dst = new int [10];

        copy myCopy = new copy();

        dst = myCopy.copy(src,dst);

        for (int i=0; i<dst.length; i++ ){
            System.out.println(i + " " + dst[i]);
        }





    }
}



