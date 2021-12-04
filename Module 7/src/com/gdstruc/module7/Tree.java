package com.gdstruc.module7;

public class Tree {

    public Node root;

    public void insert(int value)
    {
        if(root == null)
        {
            root = new Node(value);
        }
        else
        {
            root.insert(value);
        }
    }

    public void traverseInOrder()
    {
        if(root != null)
        {
            root.traverseInOrder();
        }
    }

    public void traverseInOrderDescending()
    {
        if(root != null)
        {
            root.traverseInOrderDescending();
        }
    }

    public Node get(int value)
    {
        if (root != null)
        {
            return root.get(value);
        }
        return null;
    }

    static int findMax(Node node)
    {
        if (node == null)
            return Integer.MIN_VALUE;

        int res = node.data;
        int lres = findMax(node.leftChild);
        int rres = findMax(node.rightChild);

        if (lres > res)
            res = lres;
        if (rres > res)
            res = rres;
        return res;
    }

    static int findMin(Node node)
    {
        if (node == null)
            return Integer.MAX_VALUE;

        int res = node.data;
        int lres = findMin(node.leftChild);
        int rres = findMin(node.rightChild);

        if (lres < res)
            res = lres;
        if (rres < res)
            res = rres;
        return res;
    }

}
