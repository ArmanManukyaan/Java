package Interfaces;

import java.util.stream.IntStream;

public class DynStack implements IntStack {
    private int[] stack;
    private int tos;

    public DynStack(int size) {
        stack = new int[size];
        tos = -1;
    }


    @Override
    public void push(int item) {
        if (tos == stack.length - 1) {
            int[] temp = new int[2 * stack.length];
            System.arraycopy(stack, 0, temp, 0, stack.length);
            stack = temp;
            stack[++tos] = item;
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

class IFTest2 {
    public static void main(String[] args) {
        DynStack stack1 = new DynStack(5);
        DynStack stack2 = new DynStack(8);

        IntStream.range(0, 12).forEach(stack1::push);
        IntStream.range(0, 20).forEach(stack2::push);

        System.out.println("stack1");
        IntStream.range(0, 12).mapToObj(i -> stack1.pop() + " ").forEach(System.out::print);
        System.out.println("stack2");
        IntStream.range(0, 20).mapToObj(i -> stack2.pop() + " ").forEach(System.out::print);

    }
}
