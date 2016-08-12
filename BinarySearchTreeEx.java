/*
 * BinarySearchTreeEx.java
 * Binary search tree example
 * @author Gabor Jaszfalvi
 * 2016
 */

package DataStrAlg;

public class BinarySearchTreeEx {
    public static void main(String[] args) {
        BTNode theNode1 = new BTNode(50);
        BTNode theNode2 = new BTNode(25);
        BTNode theNode3 = new BTNode(75);
        BTNode theNode4 = new BTNode(12);
        BTNode theNode5 = new BTNode(30);
        BTNode theNode6 = new BTNode(60);
        BTNode theNode7 = new BTNode(80);
        BTNode theNode8 = new BTNode(26);
        
        BinaryTree myTree = new BinaryTree();
        myTree.insertNode(theNode1);
        myTree.insertNode(theNode2);
        myTree.insertNode(theNode3);
        myTree.insertNode(theNode4);
        myTree.insertNode(theNode5);
        myTree.insertNode(theNode6);
        myTree.insertNode(theNode7);
        myTree.insertNode(theNode8);
        
        myTree.inOrder();
    }
}
