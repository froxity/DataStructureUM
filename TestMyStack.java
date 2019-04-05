package lab7;
//Question 1
import java.util.*;
public class TestMyStack {

    public static void main(String[] args) {
        //b)1)
        MyStack<Character> stack = new MyStack<>();
        stack.push('a');
        stack.push('b');
        stack.push('c');
        //b)2)
        System.out.println("The stack list: " + stack.toString());
        //b)3)
        System.out.println("Did element of 'b' is in the stack? " +stack.search('b'));
        //b)4)
        System.out.println("Did element of 'k' is in the stack? " +stack.search('k'));
        
        //c)1)
        MyStack<Integer> intStack = new MyStack<>();
        intStack.push(1);
        intStack.push(2);
        intStack.push(3);
        //c)2)
        System.out.println("The stack list: " + stack.toString());
        //c)3)
        System.out.println("Did element of 6 is in the stack? " +intStack.search(6));
        
        
    }   
}
