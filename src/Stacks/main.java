package Stacks;

import java.util.Stack;

public class main {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack_push(stack);
//        stack_pop(stack);
    }

    public static void stack_push(Stack<Integer> stack) {
        for (int i = 1; i < 5; i++) {
            stack.push(i);
        }
        System.out.println(stack.search(2));
    }

    public static void stack_pop(Stack<Integer> stack) {
        for (int i = 0; i < 5; i++) {
            int y = (Integer) stack.pop();
            System.out.println(y);
        }
    }
}
