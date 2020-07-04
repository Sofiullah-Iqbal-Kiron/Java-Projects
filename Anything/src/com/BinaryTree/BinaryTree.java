package com.BinaryTree;

import static com.RA.Main.newLine;

public class BinaryTree
{
    public static void main(String[] args)
    {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        preorder(root);
        newLine();
        inorder(root);
        newLine();
        postorder(root);
        newLine();
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        root.left.left.left = new Node(8);
        preorder(root);
        System.out.println(heightOfTree(root));
    }

    private static void preorder(Node root)
    {
        if (root != null)
        {
            System.out.print(root.data + " ");
            preorder(root.left);
            preorder(root.right);
        }
    }

    private static void inorder(Node root)
    {
        if (root != null)
        {
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }
    }

    private static void postorder(Node root)
    {
        if (root != null)
        {
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data + " ");
        }
    }

    private static int heightOfTree(Node root)
    {
        if (root == null)
            return 0;
        int leftHeight = heightOfTree(root.left);
        int rightHeight = heightOfTree(root.right);

        return leftHeight > rightHeight ? leftHeight + 1 : rightHeight + 1;
    }

    private static void levelOrderTraversal(Node root)
    {

    }
}
