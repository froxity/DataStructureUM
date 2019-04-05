package lab7;
//Question 2
import java.util.*;
public class TestIntMyStack {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        MyStack<Integer> intStack = new MyStack<>();
        System.out.print("Enter the value integer: ");
        int value = input.nextInt();
        intStack.push(value);
        System.out.println("Size of the stack: " + intStack.getSize());
        while (true) {
            System.out.println("Content: " + intStack.pop());
        }
        
    }
}
