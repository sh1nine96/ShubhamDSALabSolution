package com.company.findpairbst;

import java.util.*;

public class BSTPairFinder {

    public static class Node{
        int data;
        Node left, right;
    }
    static Node NewNode(int data){
        Node temp = new Node();
        temp.data = data;
        temp.left = null;
        temp.right = null;
        return temp;
    }

    public static Node insert(Node root, int key){
        if(root == null)
            return NewNode(key);
        if(key < root.data)
            root.left = insert(root.left, key);
        else
            root.right = insert(root.right, key);
        return root;
    }

   public static boolean findPairUtil(Node root, int sum, HashSet<Integer> set)
    {
        if(root == null)
            return false;

        if(findPairUtil(root.left, sum, set))
            return true;

        if(set.contains(sum - root.data)){
            System.out.println("Pair is found ( "+ (sum- root.data) + ", " + root.data + ")");
            return true;
        }

        else set.add(root.data);
        return findPairUtil(root.right, sum, set);
    }

    public static void findPair(Node root, int sum)
    {
        HashSet<Integer> set = new HashSet<>();
        if(!findPairUtil(root, sum, set))
            System.out.println("Pairs are not found" + "\n");
    }
}
