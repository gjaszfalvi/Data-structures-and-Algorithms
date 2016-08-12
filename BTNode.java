/*
 * BTNode.java
 * Node example for Binary tree
 * @author Gabor Jaszfalvi
 * 2016
 */

package DataStrAlg;

public class BTNode {
    private int element;
    private BTNode left;
    private BTNode right;
    
    public BTNode(int i) {
        element = i;
        left = null;
        right = null;
    }

    public int getElement() {
        return element;
    }

    public void setElement(int element) {
        this.element = element;
    }

    public BTNode getLeft() {
        return left;
    }

    public void setLeft(BTNode left) {
        this.left = left;
    }

    public BTNode getRight() {
        return right;
    }

    public void setRight(BTNode right) {
        this.right = right;
    }
    
    public boolean isInternal() {
        if (!(isExternal())) {
            return true;
        } else {
            return false;
        }
    }
    
    public boolean isExternal() {
        if (left == null && right == null) {
            return true;
        } else {
            return false;
        }
    }
}
