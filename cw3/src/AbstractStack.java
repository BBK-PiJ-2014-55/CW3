/**
 * Created by karolsudol on 29/12/14.
 */
public abstract class AbstractStack implements Stack {
    /**
     * The data structure where the elements on the stack are stored.
     */
    protected List internalList;

    /**
     * Creates a new abstract stack using the provided list as the
     * underlying data structure.
     *
     * Note: This constructor does not check whether the provided list
     * is null. Programmers must do their own checks. If a null list
     * is provided, a NullPointerException will be thrown at runtime
     * as soon as any operation is attempted on the underlying list.
     *
     * @param list the list to be used
     */
    public AbstractStack(List list) {
        this.internalList = list;
    }
}
