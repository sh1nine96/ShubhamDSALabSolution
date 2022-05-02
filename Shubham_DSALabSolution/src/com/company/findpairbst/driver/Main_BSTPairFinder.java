package com.company.findpairbst.driver;
import com.company.findpairbst.BSTPairFinder;
import java.util.Scanner;
import static com.company.findpairbst.BSTPairFinder.findPair;
import static com.company.findpairbst.BSTPairFinder.insert;

public class Main_BSTPairFinder {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        BSTPairFinder.Node root = null;
        root = insert(root, 10);
        root = insert(root, 20);
        root = insert(root, 30);
        root = insert(root, 40);
        root = insert(root, 50);
        root = insert(root, 60);
        root = insert(root, 70);


        System.out.println("Enter the sum to be found");
        int sum = sc.nextInt();

        //   int sum = 130;
        findPair(root, sum);
    }

}
