package lab7;

import java.util.*;
//Question 3 - Afiq
public class Q3Main {

    public static void main(String[] args) {
        Random r = new Random();
        StackADT<Integer> stack = new StackADT<>();

        for (int i = 1; i <= 5; i++) {
            int val = r.nextInt(101);
            stack.push(val);
        }
        System.out.println("The list of integer: "+ stack.toString());
        System.out.println("Total of integer: " + stack.sum());
    }
}
