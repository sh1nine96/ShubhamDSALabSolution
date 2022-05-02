package com.company.brackets.driver;

import com.company.brackets.BalancedBracketChecker;
import java.util.Scanner;

public class Main_Brackets {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the String to check if it contains balanced brackets");

        String bracket = sc.next();
        test(bracket);

//        test("{[()]}");
//
//        test("{}");


//		test("[]");
//		test("[{}]");
//		test("[<>]");
//		test("[<<]");
//		test("({[<>]})");
//        test("M[MW]W");
//        test("M[]");
//		test("[<>");
    }

    private static void test(String brackets){

        BalancedBracketChecker balancedBracketChecker = new BalancedBracketChecker(brackets);
        boolean result = balancedBracketChecker.check();

        if(result){
            System.out.println("The entered String " + brackets + "has balanced brackets");
        } else {
            System.out.println("The entered String " + brackets + "does not contain balanced brackets");
        }
    }
}
