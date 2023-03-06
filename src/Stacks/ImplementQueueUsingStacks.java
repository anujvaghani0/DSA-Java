package Stacks;

import java.util.Stack;

public class ImplementQueueUsingStacks {
    public static void main(String[] args) {

    }

    class MyQueue {
        Stack<Integer> top = new Stack<>();
        Stack<Integer> bottom = new Stack<>();
        int x;

        public MyQueue() {
            x = 0;
        }

        public void push(int x) {
            top.push(x);
        }

        public int pop() {
            while (!top.empty()) {
                bottom.push(top.pop());
            }
            int removed = bottom.pop();

            while (!bottom.empty()) {
                top.push(bottom.pop());
            }
            return removed;
        }

        public int peek() {
            while (!top.empty()) {
                bottom.push(top.pop());
            }
            int peeked = bottom.peek();

            while (!bottom.empty()) {
                top.push(bottom.pop());
            }
            return peeked;
        }

        public boolean empty() {
            if (top.empty()){
                return true;
            }
            return false;
        }
    }

}
