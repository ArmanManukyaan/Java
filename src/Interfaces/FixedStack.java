package Interfaces;

import java.util.stream.IntStream;

public class FixedStack implements IntStack {
    private int[] stack;
    private int tos;

    public FixedStack(int size) {
        stack = new int[size];
        tos = -1;
    }

    @Override
    public void push(int item) {
        if (tos == stack.length - 1) {
            System.out.println("Stack is full");
        } else {
            stack[++tos] = item;
        }
    }

    @Override
    public int pop() {
        if (tos == 0) {
            System.out.println("Stack is empty");
            return 0;
        } else {
            return stack[--tos];
        }
    }
}

class IFStack {
    public static void main(String[] args) {
        FixedStack fixedStack1 = new FixedStack(5);
        FixedStack fixedStack2 = new FixedStack(8);

        IntStream.range(0, 5).forEach(fixedStack1::push);
        IntStream.range(0, 8).forEach(fixedStack2::push);

        System.out.println("my fixed stack is  1");
        IntStream.range(0, 5).mapToObj(i -> fixedStack1.pop() + " ").forEach(System.out::print);
        System.out.println("my fixed stack is  2");
        IntStream.range(0, 8).mapToObj(i -> fixedStack2.pop() + " ").forEach(System.out::print);
    }
}