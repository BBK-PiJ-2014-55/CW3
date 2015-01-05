/**
 * Created by karolsudol on 30/12/14.
 */
public class StackImpl extends AbstractStack {

    public StackImpl (List internalList){ super(internalList);}

    /**
     * Returns true if the stack is empty, false otherwise.
     *
     * @return true if the stack is empty, false otherwise.
     */
    public boolean isEmpty() { if (this.internalList.isEmpty()){ return true;} else return false; }



    /**
     * Returns the number of items currently in the stack.
     *
     * @return the number of items currently in the stack
     */
    public int size() { return this.internalList.size(); }


    /**
     * Adds an element at the top of the stack.
     *
     * @param item the new item to be added
     */
    public void push(Object item) { this.internalList.add(0, item);}



    /**
     * Returns the element at the top of the stack. The stack is
     * left unchanged.
     *
     * @return If stack is not empty, the item on the top is returned. If the
     *         stack is empty, an appropriate error.
     */
    public ReturnObject top() { if (this.internalList.isEmpty()) return new ReturnObjectImpl(ErrorMessage.EMPTY_STRUCTURE);
        else return new ReturnObjectImpl(this.internalList.get(0));}


    /**
     * Returns the element at the top of the stack. The element is
     * removed from the stack.
     *
     * @return If stack is not empty, the item on the top is returned. If the
     *         stack is empty, an appropriate error.
     */
    public ReturnObject pop() { if (isEmpty()) return new ReturnObjectImpl(ErrorMessage.EMPTY_STRUCTURE);
        else return new ReturnObjectImpl(this.internalList.remove(0));}

}

