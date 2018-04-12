package algorithms;

import static algorithms.HeightOfBST.insert;
import java.util.Scanner;

/**
 * Level Order Traversal of a tree.
 * @author Sanjeev
 */
public class TreeLevelOrder {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        Node root = null;
        while (t-- > 0) {
            int data = scan.nextInt();
            root = insert(root, data);
        }
        scan.close();
        levelOrder(root);
    }

    private static void levelOrder(Node root) {
        int height = treeHeight(root);
        for (int count = 1; count <= height; count++) {
            printLevel(root, count);
        }
    }

    private static  int treeHeight(Node root) {
        if (root == null) {
            return 0;
        }
        int lheight = treeHeight(root.left);
        int rheight = treeHeight(root.right);
        if (lheight > rheight) {
            return lheight + 1;
        } else {
            return rheight + 1;
        }
    }

    private static void printLevel(Node root, int level) {
        if (root == null) {
            return;
        }
        if (level == 1) {
            System.out.print(root.data + " ");
        } else if (level > 1) {
            printLevel(root.left, level - 1);
            printLevel(root.right, level - 1);
        }
    }
}
