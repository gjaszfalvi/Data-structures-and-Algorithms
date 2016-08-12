/*
 * BinaryTree.java
 * Binary tree example
 * @author Gabor Jaszfalvi
 * 2016
 */

package DataStrAlg;

public class BinaryTree {
    public BTNode theRoot;
    public BTNode startNode = theRoot;
    
    // instantiating a BT object
    public BinaryTree() {
        theRoot = null;
    }
    
    public BTNode root() {
        return theRoot;
    }
    
    public int size() {
    return 0;
    }
    
    public boolean isEmpty() {
        if (theRoot == null) {
            return true;
        } else {
            return false;
        }
    }
    
    public boolean isRoot(BTNode aNode) {
        if (aNode == root()) {
            return true;
        } else {
            return false;
        }
    }
    
    public BTNode parent() {
        return null;
    }
    
    public void insertNode(BTNode newNode) {
        // if tree is empty, newNode is the root
        if (isEmpty()) {
            theRoot = newNode;
            startNode = theRoot;
        } else if (search(newNode.getElement()) == null) {  // check if the element is already added or new
            // if tree is not empty, check if the element is smaller or larger than startNode's
            if (newNode.getElement() > startNode.getElement()) {
                // insert newNode as rightchild if there is no rightchild
                if (startNode.getRight() == null) {
                    startNode.setRight(newNode);
                } else {
                    // if there is already a rightchild, or right subtree, insert newNode in right subtree
                    startNode = startNode.getRight(); 
                    insertNode(newNode);
                }
            } else if (newNode.getElement() < startNode.getElement()) {
                // insert newNode as leftchild if there is no leftchild
                if (startNode.getLeft() == null) {
                    startNode.setLeft(newNode);
                } else {
                    // if there is already a left child or left subtree, insert newNode in left subtree
                    startNode = startNode.getLeft();
                    insertNode(newNode);
                }
            }
        } else {
            System.out.println("Node " + newNode + " was already added");
        }
        startNode = theRoot;
    }
    
    public void remove(Object o) {
        
    }
    
    public int countNodes() {
        return 0;
    }
    
    public BTNode search(int i) {
        if (isEmpty()) {
            return null;
        } else {
            if (i == startNode.getElement()) {
                return startNode;
            } else if (i < startNode.getElement()) {
                startNode = startNode.getLeft();
                return search(i);
            } else if (i > startNode.getElement()) {
                startNode = startNode.getRight();
                return search(i);
            }
        }
        startNode = theRoot;
        return null;
    }
    
    public void inOrder() {
        if (isEmpty()) {
            return;
        } else {
            startNode = startNode.getLeft();
            inOrder();
            System.out.println("Node : " + startNode.getElement());
            startNode = startNode.getRight();
            inOrder();
        }
        startNode = theRoot;
    }
    
    public void postOrder() {
        
    }
    
    public void preOrder() {
        
    }
    
}
