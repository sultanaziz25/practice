package com.chalo.chale.yahan.se.bst;

/**
 * Created by hug08153 on 14-Dec-17.
 */

public class BSTTest {

    public static void main(String[] args) {
        BSTTest bsTree = new BSTTest();
        bsTree.test();
    }
    public void test() {
        BSTree bsTree = new BSTree();


        BSTNode root = new BSTNode(100);
        bsTree.insert(root, 30);
        bsTree.insert(root, 10);
        bsTree.insert(root, 40);
        bsTree.insert(root, 35);

        /*bsTree.insert(30);
        bsTree.insert(10);
        bsTree.insert(40);
        bsTree.insert(35);*/

        System.out.println(bsTree);

        BSTNode searchedNode = bsTree.search(root, 35);

        System.out.println(searchedNode);



    }
}
