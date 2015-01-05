/**
 * Created by karolsudol on 30/12/14.
 * cannot extend either AbstractStack or StackImpl.
 */
public class ImprovedStackImpl implements ImprovedStack {

    private StackImpl internalStack;

    ImprovedStackImpl (List list) { internalStack = new StackImpl(list);}


    /**
     * Returns true if the stack is empty, false otherwise.
     *
     * @return true if the stack is empty, false otherwise.
     */
    public boolean isEmpty() { return internalStack.isEmpty(); }


    /**
     * Returns the number of items currently in the stack.
     *
     * @return the number of items currently in the stack
     */
    public int size(){ return internalStack.size(); }


    /**
     * Adds an element at the top of the stack.
     *
     * @param item the new item to be added
     */
    public void push(Object item) { internalStack.push(item);}


    /**
     * Returns the element at the top of the stack. The stack is
     * left unchanged.
     *
     * @return If stack is not empty, the item on the top is returned. If the
     *         stack is empty, an appropriate error.
     */
    public ReturnObject top() { return internalStack.top(); }


    /**
     * Returns the element at the top of the stack. The element is
     * removed from the stack.
     *
     * @return If stack is not empty, the item on the top is returned. If the
     *         stack is empty, an appropriate error.
     */
    public ReturnObject pop() { return internalStack.pop(); }



    /**
     * Returns a copy of this stack with the items reversed, the top
     * elements on the original stack is at the bottom of the new
     * stack and viceversa.
     *
     * @return a copy of this stack with the items reversed.
     */
    public ImprovedStack reverse(){

        // Create a new, empty stack
        LinkedList list = new LinkedList();
        ImprovedStack newStack = new ImprovedStackImpl(list);

        // add items to it
        for (int i = 1; i <= this.size(); i++){
            newStack.push(this.internalStack.internalList.get(this.size()-i).getReturnValue());
        } return newStack;
    }



    /**
     * Removes the given object from the stack if it is
     * there. Multiple instances of the object are all removed.
     *
     * Classes implementing this method must use method .equals() to
     * check whether the item is in the stack or not.
     *
     * @param object the object to remove
     */
    public void remove(Object object){
        for (int i = 0; i <= this.size(); i++){
            if (this.internalStack.internalList.get(i).getReturnValue().equals(object));
            this.internalStack.internalList.remove(i);
        }
    }



}
