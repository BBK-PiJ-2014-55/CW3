/**
 *
 * A wrapper containing either an object (the result of an operation
 * on a data structure) or an error value.
 *
 * Created by karolsudol on 29/11/14.
 */
public class ReturnObjectImpl implements ReturnObject{

    /**
     *   constructor which assigns the value parameter
     *   @param value an Object held by the ReturnObjectImpl wrapper
     */

    private Object value;

    public ReturnObjectImpl (Object value){
        this.value = value;
    }

    /**
     * Returns whether there has been an error
     * @return whether there has been an error
     */

    public boolean hasError() {
        if (value == ErrorMessage.EMPTY_STRUCTURE || value == ErrorMessage.INDEX_OUT_OF_BOUNDS || value == ErrorMessage.INVALID_ARGUMENT) {
            return true;
        }
        else return false;
    }


    /**
     * Returns the error message.
     *
     * This method must return NO_ERROR if and only if
     * {@hasError} returns false.
     *
     * @return the error message
     */

    public ErrorMessage getError(){
        if (hasError() == false){
            return ErrorMessage.NO_ERROR;
        } else {
            return null;
        }
    }


    /**
     * Returns the object wrapped in this ReturnObject, i.e. the
     * result of the operation if it was successful, or null if
     * there has been error.
     *
     * Note that the output of this method must be null if {@see
     * hasError} returns true, but the opposite is not true: if
     * {@see hasError} returns false, this method may or may not
     * return null.
     *
     * @return the return value from the method or null if there has been an
     *         error
     */

    public Object getReturnValue(){

        if (hasError()== true){
            return null;
        } else {
            return value;
        }

    }

}

