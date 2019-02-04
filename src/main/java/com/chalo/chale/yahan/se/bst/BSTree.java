package com.chalo.chale.yahan.se.bst;

/**
 * Created by hug08153 on 14-Dec-17.
 */
public class BSTree {

    /*BSTNode root;
    public BSTree(BSTNode root) {
        this.root = root;
    }*/

    public BSTNode insert(BSTNode root, int data) {
        if (root == null) {
            return new BSTNode(data);
        }

        if (data <= root.getData()) {
            root.setLeft(insert(root.getLeft(), data));
        } else if (data > root.getData()) {
            root.setRight(insert(root.getRight(), data));
        }

        return root;
    }

    public BSTNode search(BSTNode root, int data) {
        if (root == null) {
            return null;
        }

        if (data < root.getData()) {
           return search(root.getLeft(), data);
        } else if (data > root.getData()) {
           return search(root.getRight(), data);
        }

        return root;
    }
}
