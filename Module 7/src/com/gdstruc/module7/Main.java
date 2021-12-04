package com.gdstruc.module7;

public class Main {

    public static void main(String[] args) {

        Tree tree = new Tree();

        tree.insert(9);
        tree.insert(55);
        tree.insert(26);
        tree.insert(1);
        tree.insert(300);
        tree.insert(7);
        tree.insert(90);
        tree.insert(90);
        tree.insert(200);

        tree.traverseInOrderDescending();
        System.out.println(tree.findMax(tree.root));
        System.out.println(tree.findMin(tree.root));

    }
}
