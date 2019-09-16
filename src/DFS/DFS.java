package DFS;

import java.util.Stack;

public class DFS {


    public static void main(String args[]) {
        Node root = new Node(10);
        root.left = new Node(6);
        root.right = new Node(21);
        root.left.left = new Node(1);
        root.left.right = new Node(8);
        root.right.left = new Node(13);
        root.right.right = new Node(25);
        root.right.left.left = new Node(12);
        root.right.left.right = new Node(18);

        DFS dfs = new DFS();
        dfs.depthFirstSearch(root);
        System.out.println("-------------");
        dfs.depthSearchByrecursive(root);
    }

    /**
     * This method performs a depth first search on a binary tree
     *
     * @param root
     */
    public void depthFirstSearch(Node root) {
        if (root == null) {
            return;
        }

        Stack<Node> nodeStack = new Stack<Node>();
        nodeStack.push(root);

        while (!nodeStack.isEmpty()) {
            Node node = nodeStack.pop();
            System.out.print(node.data + " ");

            if (node.right != null) {
                nodeStack.push(node.right);
            }
            if (node.left != null) {
                nodeStack.push(node.left);
            }
        }
    }

    public void depthSearchByrecursive(Node node) {
        if (null == node) {
            return;
        }
        System.out.println("node.data = " + node.data);
        depthSearchByrecursive(node.left);
        depthSearchByrecursive(node.right);
    }
}

