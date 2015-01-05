/**
 * Created by karolsudol on 24/11/2014.
 */
public class IntegerTreeNode {
    int value;
    IntegerTernaryTreeNode left;
    IntegerTernaryTreeNode center;
    IntegerTernaryTreeNode right;

    public add(int newNumber) {
        if (newNumber > this.value) {
            if (right == null) {
                right = new IntegerTreeNode(newNumber);
            } else { right.add(newNumber);
            }
        } else {
            if (left == null) {
                left = new IntegerTreeNode(newNumber);
            } else {
                left.add(newNumber);
            }
        }
    }


    public boolean contains(int n) { if (n == this.value) {
        return true;
    } else if (n > this.value) {
        if (right == null) {
        }
        return false;
    } else {
        return right.contains(n);
    } else {
        if (left == null) {
            return false;
        } else {
            return left.contains(n);
        }
     }

    getMax(){


    }


    getMin(){


    }


}
