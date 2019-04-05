package lab7;

import java.util.ArrayList;

/**
 *
 * @author Afiq - WIC180001
 */
public interface Stack<E> {

    public void push(E Obj);

    public E pop();

    public E peek();

    public int getSize();

    public boolean isEmpty();

    @Override
    public String toString();

    public boolean search(E Obj);

    public int sum();

}
