package StackAndQueus;

import java.util.Scanner;
import java.util.Stack;

public class BalancedBrackets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(ch == '(' || ch == '[' || ch == '{'){
                stack.push(ch);
            }else if (ch == ')'){
                boolean val = HandleClosing(stack,'(');
                if(val == false){
                    System.out.println(val);
                    return;
                }
            }else if (ch == '}'){
                boolean val = HandleClosing(stack,'{');
                if(val == false){
                    System.out.println(val);
                    return;
                }
            }else if (ch == ']'){
                boolean val = HandleClosing(stack,'[');
                if(val == false){ 
                    System.out.println(val);
                    return;
                }
            }else {

            }
        }

        if(stack.size() == 0){
            System.out.println("true");
        }else System.out.println("false");
    }
    public static boolean HandleClosing(Stack<Character> st,char ch){
        if(st.size() == 0){
            return false;
        }else if (st.peek() != ch){
            return false;
        }else {
            st.pop();
            return true;
        }
    }
}
