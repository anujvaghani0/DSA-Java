package Stacks;

import java.util.Stack;

public class main {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack_push(stack);
        stack_pop(stack);
    }

    public static void stack_push(Stack<Integer> stack) {
        for (int i = 0; i < 5; i++) {
            stack.push(i);
        }
    }

    public static void stack_pop(Stack<Integer> stack) {
        for (int i = 0; i < 5; i++) {
            int y = (Integer) stack.pop();
            System.out.println(y);
        }
    }
}
