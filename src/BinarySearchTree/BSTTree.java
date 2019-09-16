package BinarySearchTree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Varadharajan on 2019-09-11
 * @project name: GoldmansachsCoderPadQuestions
 */
public class BSTTree {


    public static  Node root;
    public BSTTree(){
        this.root = null;
    }

    public boolean contains(int id){
        Node current = root;
        while(current!=null){
            if(current.val==id){
                return true;
            }else if(current.val>id){
                current = current.left;
            }else{
                current = current.right;
            }
        }
        return false;
    }

    public void put(int id){
        Node newNode = new Node(id);
        if(root==null){
            root = newNode;
            return;
        }
        Node current = root;
        Node parent = null;
        while(true){
            parent = current;
            if(id<current.val){
                current = current.left;
                if(current==null){
                    parent.left = newNode;
                    return;
                }
            }else{
                current = current.right;
                if(current==null){
                    parent.right = newNode;
                    return;
                }
            }
        }
    }
    public List<Integer> inOrderTraversal() {
        final ArrayList<Integer> acc = new ArrayList<>();
        inOrderTraversal(root, acc);
        System.out.println(acc);
        return acc;
    }

    private void inOrderTraversal(Node node, List<Integer> acc) {
        if (node == null) {
            return;
        }
        inOrderTraversal(node.left, acc);
        inOrderTraversal(node.right, acc);
        acc.add(node.val);
    }
    public static void main(String arg[]){
       final BSTTree searchTree = new BSTTree();

        searchTree.put(3);
        searchTree.put(1);
        searchTree.put(2);
        searchTree.put(5);

        if(Arrays.asList(2,1,5,3).equals(searchTree.inOrderTraversal())
                && !searchTree.contains(0)
                && searchTree.contains(1)
                && searchTree.contains(2)
                && searchTree.contains(3)
                && !searchTree.contains(4)
                && searchTree.contains(5)
                && !searchTree.contains(6)){
            System.out.println("Pass");
        }else {
            System.out.println("Fail");
        }

    }
}

class Node{
    int val;
    Node left;
    Node right;
    public Node(int val){
        this.val = val;
        left = null;
        right = null;
    }


}
