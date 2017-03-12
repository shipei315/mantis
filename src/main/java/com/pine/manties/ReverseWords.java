package com.pine.manties;

import java.util.Stack;

import org.apache.commons.lang3.StringUtils;

/**
 * input "i have an apple"
 * output "apple an have i"
 * @author shipei
 *
 */
public class ReverseWords {
    
    public static void main(String[] args) {
        ReverseWords reverseWords = new ReverseWords();
        reverseWords.reverseOutPut("i have an apple");
    }
    
    
    public void reverseOutPut(String s){
        Stack<String> stack = new Stack<String>();
        String [] array = s.split(" ");
        for(String temp : array){
            if (StringUtils.isNotBlank(temp)) {
                stack.push(temp);
            }
        }
        while (stack.size() > 0) {
            System.out.print(stack.pop() + " ");
        }
    }
}
