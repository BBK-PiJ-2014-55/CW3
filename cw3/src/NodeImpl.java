/**
 * Created by karolsudol on 28/12/14.
 */
public class NodeImpl implements Node {

    Object data;
    Node next;

    // constructors
    public NodeImpl(Object data, Node next) { this.data = data; this.next = next; }

    public NodeImpl(Object data) {
        this.data = data;
    }

    // getters and setters
    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    //  printing values while testing
    @Override
    public String toString(){
        return "" + data;
    }
}
