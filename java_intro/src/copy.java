/**
 * Created by karolsudol on 05/11/2014.
 */
public class copy {

    public int [] copy (int [] src, int [] dst){

        int [] resultArray;
        resultArray = new int [dst.length];

        for (int i=0; i<resultArray.length; i++){
            if (i<src.length){
                resultArray[i]=src[i];
            }

            else {
                resultArray[i]=0;
            }

        }

        return resultArray;



    }
}
