package org.example.lessonFiveAlgo.homeWorkFiveAlgo;

import java.util.Stack;

public class TaskOne {
/*
                                     1 уровень сложности: Level 1
    Последовательность ([{}]) является правильной, а последовательности ([)], {()] правильными не являются.
    Докажите это используя стек!
*/

    public static void main(String[] args) {
        System.out.println("([{}]): " + checkingParentheses("([{}])")); // True
        System.out.println("([)]: " + checkingParentheses("([)]")); // False
        System.out.println("{()]: " + checkingParentheses("{()]")); // False

    }

    public static boolean checkingParentheses(String string) {
        Stack<Character> checkingStack = new Stack<>();
        for (char el : string.toCharArray()) {
            if (el == '(' || el == '[' || el == '{') {
                checkingStack.add(el);
            } else if (el == ')' || el == ']' || el == '}') {
                if (checkingStack.isEmpty()) {
                    return false;
                }

                char openingBracket = checkingStack.pop();
                if (el == ')' && openingBracket != '(' ||
                    el == ']' && openingBracket != '[' ||
                    el == '}' && openingBracket != '{') {
                    return false;
                }
            }
        }
        return checkingStack.isEmpty();
    }
}
