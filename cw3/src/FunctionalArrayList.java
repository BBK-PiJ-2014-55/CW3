/**
 * Created by karolsudol on 29/12/14.
 */
public class FunctionalArrayList extends ArrayList implements FunctionalList {

    /**
     * Returns the element at the beginning of the list.
     *
     * If the list is empty, an appropriate error is returned.
     *
     * @return a copy of the element at the beginning of the list or
     *         an error if the list is empty.
     */
    public ReturnObject head(){
        if (isEmpty() == true){
            return new ReturnObjectImpl(ErrorMessage.EMPTY_STRUCTURE);
        } else {
            return get(0);
        }

    }

    /**
     * Returns a list with the elements in this list except the
     * head. The elements must be in the same order. The original list
     * must not change or be affected by changes in the new list.
     *
     * If the list is empty, another empty list is returned.
     */
    public FunctionalList rest(){
        FunctionalList newList = new FunctionalArrayList(size());
        for (int i=1; i<size(); i++){
            newList.add(get(i).getReturnValue());
        } return newList;

    }

}



