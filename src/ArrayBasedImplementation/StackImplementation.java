package ArrayBasedImplementation;
import ADTStack.StackInterface;

import java.util.ArrayList;

public class StackImplementation<T> implements StackInterface<T> {

    ArrayList<T> list = new ArrayList<>();

    public void push(T newEntry) {
        list.add(newEntry);
    }

    public T pop() {
        if (isEmpty()){
            throw new IllegalStateException("Stack is empty.");
        }
        //we return the last element in the list.
        return list.remove(list.size() - 1);
    }

    public T peek() {
        if (isEmpty()){
            throw new IllegalStateException(("Stack is empty."));
        }
        return list.get(list.size() - 1);
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public void clear() {
        list.clear();
    }

}
