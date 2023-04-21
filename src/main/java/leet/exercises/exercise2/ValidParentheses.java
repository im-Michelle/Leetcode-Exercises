package leet.exercises.exercise2;

import java.util.Stack;

public class ValidParentheses {
    public boolean isValid(String s) {
        Stack<Character> pila = new Stack<Character>();

        for (int i = 0; i < s.length(); i++) {
            char caracter = s.charAt(i);

            if ( caracter=='(' || caracter=='[' || caracter == '{'){
                pila.push(caracter);
            } else if (!pila.isEmpty() && ((caracter == ')' && pila.peek() == '(') || (caracter == '}' && pila.peek() == '{') || (caracter == ']' && pila.peek() == '['))) {
                pila.pop();
            } else {
                return false;
            }
        }
        return pila.isEmpty();
    }
}
