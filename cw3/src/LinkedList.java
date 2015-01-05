/**
 * Created by karolsudol on 07/12/14.
 */
public class LinkedList implements List {

    private Node head;
    private Node tail;
    private int listCount;

    // constructor
    public LinkedList() {
        head = new NodeImpl(null);
        listCount = 0;
    }


    /**
     * Returns empty list of nodes.
     *
     * @return empty node.
     */
    public void delete() {
        head.setNext(null);
    }



    /**
     * Returns true if the list is empty, false otherwise.
     *
     * @return true if the list is empty, false otherwise.
     */
    public boolean isEmpty() {
        if (head == null) return true;
        return false;
    }



    /**
     * Returns the number of items currently in the list.
     *
     * @return the number of items currently in the list
     */
    public int size() {
        Node current = head;
        int size = 0;
        while (current.getNext() != null) {
            size++;
            current = current.getNext();
        }
        return size;
    }



    /**
     * Returns the elements at the given position.
     *
     * If the index is negative or greater or equal than the size of
     * the list, then an appropriate error must be returned.
     *
     * @param index the position in the list of the item to be retrieved
     * @return the element or an appropriate error message,
     * encapsulated in a ReturnObject
     */
    public ReturnObject get(int index) {

        Node currentValue = head;
        int count = 0;
        Object data = null;

        if (this.isEmpty() == true) return new ReturnObjectImpl(ErrorMessage.EMPTY_STRUCTURE);
        else if (index >= this.size() || index < 0) return new ReturnObjectImpl(ErrorMessage.INDEX_OUT_OF_BOUNDS);

        for (int i = 0; i < index; i++){
            currentValue = currentValue.getNext();
        } return new ReturnObjectImpl(currentValue.getData());
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
    public ReturnObject add(Object item) {

        if (item == null) return new ReturnObjectImpl(ErrorMessage.EMPTY_STRUCTURE);
        if (head == null) head = new NodeImpl(item);
        else {
            Node current = head;
            while (current.getNext() != null){
                 current = current.getNext();
            } current.setNext(new NodeImpl(item));
        } listCount++;
        return new ReturnObjectImpl(ErrorMessage.NO_ERROR);
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
    public ReturnObject add( int index, Object item) {
        
        Node temporary;
        ReturnObject result;

        if (index < 0 || index >= size()) result = new ReturnObjectImpl(ErrorMessage.INDEX_OUT_OF_BOUNDS);
        else if (item == null) result = new ReturnObjectImpl(ErrorMessage.EMPTY_STRUCTURE);
        else {
            listCount++;
            temporary = head;
            
            for (int i = 0; i < index -1; i++){
                temporary = temporary.getNext();
            }
            Node newNode = new NodeImpl(item); 
            
        }

        Node newNode = new NodeImpl(item);
        Node current = head;

        for (int i = 1; i < index && current.getNext() != null; i++) {
            current = current.getNext();
        }
        newNode.setNext(current.getNext());
        current.setNext(newNode);
        result = new ReturnObjectImpl(ErrorMessage.NO_ERROR);
        return result;
    }



    /**
     * Returns the elements at the given position and removes it
     * from the list. The indeces of elements after the removed
     * element must be updated accordignly.
     * <p/>
     * If the index is negative or greater or equal than the size of
     * the list, then an appropriate error must be returned.
     *
     * @param index the position in the list of the item to be retrieved
     * @return the element or an appropriate error message,
     * encapsulated in a ReturnObject
     */
    public ReturnObject remove(int index) {

        Node temporary;
        ReturnObject result;

        if (index > size() || index < 0) {
            result = new ReturnObjectImpl(ErrorMessage.INDEX_OUT_OF_BOUNDS);
        } else {

            listCount--;

            if (index == 0) {
                head = head.getNext();
            } else {
                temporary = head;
                for (int i = 0; i < index - 2; i++) {
                    temporary = temporary.getNext();
                }
                temporary.setNext(temporary.getNext().getNext());
            }
            result = new ReturnObjectImpl(ErrorMessage.NO_ERROR);
        }
        return result;
    }
}




