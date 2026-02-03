package chapter9;

import java.util.ArrayList;
import java.util.EmptyStackException;

public class ArrayStack<T> implements Stack<T> {

    ArrayList<T> data = new ArrayList<T>();

    /****
     * // Designate the "end" of the arraylist as the top of the stack
     * @param d - one piece of data we want to add to the stack
     */
    // 
    // the top of our stack
    @Override
    public void push(T d) {
        data.add(d);

    }

    @Override
    public T top() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }

        return data.getLast();
    }

    @Override
    public int size() {
        return data.size();
    }

    @Override
    public boolean isEmpty() {
        return data.isEmpty();
    }
//not sure if we need this anymore or not
//@Override
   // public String toString() {
   //     return "ArrayStack [data=" + data + ", size()=" + size() + "]";
   // }

    @Override
    public T pop() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'pop'");
    }

    @Override
    public String toString() {
        if (isEmpty()) {
            //might be wrong here check and make sure
            return "ArrayStack [data=" + data + ", top()=EMPTY, size()=" + size() + "]";
        } else {
            return "ArrayStack [data=" + data + ", top()=" + top() + ", size()=" + size() + "]";
        }
        
    }
    

}

   