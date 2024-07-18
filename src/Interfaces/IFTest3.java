package Interfaces;

import java.util.stream.IntStream;

public class IFTest3 {
    public static void main(String[] args) {
        IntStack myStack;
        DynStack myDynStack = new DynStack(5);
        FixedStack myFixedStack = new FixedStack(8);

        myStack = myDynStack;
        IntStream.range(0, 12).forEach(myStack::push);
        myStack = myFixedStack;
        IntStream.range(0, 8).forEach(myStack::push);

        for (int i = 0; i < 12; i++) {
            System.out.println("myDynStack: " + myStack.pop());
        }

        for (int i = 0; i < 8; i++) {
            System.out.println("myFixedStack: " + myStack.pop());
        }
    }

}
