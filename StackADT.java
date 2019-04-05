package lab7;

import java.util.ArrayList;
//Question 3 - Afiq
public class StackADT<E> implements Stack<E> {

    private ArrayList<E> stack;
    private int top;

    public StackADT() {
        stack = new ArrayList<>();
        top = -1;
    }

    @Override
    public void push(E Obj) {
        stack.add(Obj);
        top++;
    }

    @Override
    public E pop() {
        if (top > -1) {
            int removetop = top;
            top--;
            return stack.remove(removetop);
        } else {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    @Override
    public E peek() {
        return stack.get(top);
    }

    @Override
    public int getSize() {
        return top + 1;
    }

    @Override
    public boolean isEmpty() {
        return top == -1;
    }

    @Override
    public String toString() {
        String output = "";
        for (int i = 0; i < top + 1; i++) {
            output = output + stack.get(i) + " ";
        }
        return output;
    }

    @Override
    public boolean search(E Obj) {
        for (int i = 0; i < top + 1; i++) {
            if (Obj.equals(stack.get(i))) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int sum() {
        int output = 0;
        for (int i = 0; i < top + 1; i++) {
            output = output + (Integer) stack.get(i);
        }
        return output;
    }

    /*public static void main(String[] args) {
    Random r = new Random();
    MyStack<Integer> stack = new MyStack<>();
    
    for (int i = 1; i <= 5; i++) {
    int val = r.nextInt(101);
    stack.push(val);
    }
    }*/
 /*public static <E extends Number> E sum(MyStack<E> obj){
    E sum=null;
    for (int i = 0; i < obj.getSize() ; i++) {
    sum = sum + obj.pop();
    }
    return null;
    }*/
}
