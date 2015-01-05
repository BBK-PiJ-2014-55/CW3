/**
 * Created by karolsudol on 29/11/14.
 */
public class ArrayList implements List {

    //initial array

    private ReturnObject[] array = new ReturnObject[0];

    /**
     * Returns true if the list is empty, false otherwise.
     *
     * @return true if the list is empty, false otherwise.
     */

    public boolean isEmpty(){

        if (array[0] == null){
            return true;
        }
        else return false;
    }

    /**
     * Returns the number of items currently in the list.
     *
     * @return the number of items currently in the list
     */

    public int size(){
        return array.length;
    }


    /**
     * Returns the elements at the given position.
     *
     * If the index is negative or greater or equal than the size of
     * the list, then an appropriate error must be returned.
     *
     * @param index the position in the list of the item to be retrieved
     * @return the element or an appropriate error message,
     *         encapsulated in a ReturnObject
     */

    public ReturnObject get(int index) {

        if (this.isEmpty() == true) {
            return new ReturnObjectImpl(ErrorMessage.EMPTY_STRUCTURE);
        } else if (index >= this.size() || index < 0 ) {
            return new ReturnObjectImpl(ErrorMessage.INDEX_OUT_OF_BOUNDS);
        } else return new ReturnObjectImpl(array[index]);
    }


    /**
     * Returns the elements at the given position and removes it
     * from the list. The indeces of elements after the removed
     * element must be updated accordignly.
     *
     * If the index is negative or greater or equal than the size of
     * the list, then an appropriate error must be returned.
     *
     * @param index the position in the list of the item to be removed
     * @return the element or an appropriate error message,
     *         encapsulated in a ReturnObject
     */

    public ReturnObject remove(int index) {

        ReturnObject removedItemArray;

        if (this.isEmpty() == true) {
            return new ReturnObjectImpl(ErrorMessage.EMPTY_STRUCTURE);
        } else if (index >= this.size() || index < 0) {
            return new ReturnObjectImpl(ErrorMessage.INDEX_OUT_OF_BOUNDS);
        } else {
            ReturnObject[] newArray = new ReturnObject[(this.size() - 1)];
            for (int i = 0; i < array.length; i++) {
                newArray[i] = array[i];
            }
            removedItemArray = array[index];
            for (int i = index; i < array.length - 1; i++) {
                return array[i] = array[i + 1];
            }
            array = newArray;
        } return removedItemArray;
    }


    /**
     * Adds an element to the list, inserting it at the given
     * position. The indeces of elements at and after that position
     * must be updated accordignly.
     *
     * If the index is negative or greater or equal than the size of
     * the list, then an appropriate error must be returned.
     *
     * If a null object is provided to insert in the list, the
     * request must be ignored and an appropriate error must be
     * returned.
     *
     * @param index the position at which the item should be inserted in
     *              the list
     * @param item the value to insert into the list
     * @return an ReturnObject, empty if the operation is successful
     *         the item added or containing an appropriate error message
     */

    public ReturnObject add(int index, Object item) {

        ReturnObject addedItemArray;

        if (item == null) {
            return new ReturnObjectImpl(ErrorMessage.EMPTY_STRUCTURE);
        } else if (index >= this.size() || index < 0) {
            return new ReturnObjectImpl(ErrorMessage.INDEX_OUT_OF_BOUNDS);
            } else {

                //define the new array
                ReturnObject[] newArray = new ReturnObject[(this.size() + 1)];

                //copy values into new array
                for (int i = 0; i < array.length; i++) {
                    newArray[i] = array[i];
                }

                //add new value to the new array
                newArray[index] = new ReturnObjectImpl(item);

                for (int i = index + 1; i < newArray.length - 1; i++) {
                    newArray[i] = array[i - 1];
                }

                newArray = array;

                addedItemArray = new ReturnObjectImpl(null);
            }
        return new ReturnObjectImpl(ErrorMessage.NO_ERROR);
        }



    /**
     * Adds an element at the end of the list.
     *
     * If a null object is provided to insert in the list, the
     * request must be ignored and an appropriate error must be
     * returned.
     *
     * @param item the value to insert into the list
     * @return an ReturnObject, empty if the operation is successful
     *         the item added or containing an appropriate error message
     */

    public ReturnObject add(Object item){
        ReturnObject result;

        if (item == null){
            return new ReturnObjectImpl(ErrorMessage.INVALID_ARGUMENT);
        } else {
            // define new array
            ReturnObject[] newArray = new ReturnObject[(this.size() + 1)];
            // copy values from old to new array
            for (int i = 0; i < array.length;i++){
                array[i] = newArray[i];
            }
            // add item into new array
            newArray[newArray.length - 1] = new ReturnObjectImpl(item);
            //copy the address to the old reference
            array = newArray;

            result = new ReturnObjectImpl(ErrorMessage.NO_ERROR);

        }
        return result;
    }
}



