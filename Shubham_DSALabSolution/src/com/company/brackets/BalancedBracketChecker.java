package com.company.brackets;

import java.util.Set;
import java.util.Stack;
public class BalancedBracketChecker {

    private String brackets;

    public BalancedBracketChecker(String brackets)
    {
        this.brackets = brackets;
    }

    public boolean check(){
        if(brackets.length() % 2 != 0){
            return false;
        }

        Stack<Character> stack = new Stack<>();
        Set<Character> openBracketsSet = BracketsManager.getOpenBrackets();

        Set<Character> closeBracketsSet = BracketsManager.getCloseBrackets();

        for(int i = 0; i < brackets.length(); i++){

            char aChar = brackets.charAt(i);

            if(openBracketsSet.contains(aChar)){
                stack.push(aChar);
            } else if (closeBracketsSet.contains(aChar)) {
                char closedChar = aChar;

                Character openCharFromStack = stack.pop();

                // ( ) / [ ] -> RELATED
                // ( } ->  NOT RELATED

                Bracket bracketObj = BracketsManager.getBracket(closedChar);

                if(openCharFromStack.equals(bracketObj.getOpenBracket())){
                    // match

                    continue;
                }
                
            }else {
                System.out.println("Invalid character encountered " + "during traversal..." + aChar);

                return false;
            }
        }

        return stack.isEmpty();

    }
}
