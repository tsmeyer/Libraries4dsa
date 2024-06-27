/**
* Author: Todd Meyer
* Last Updated: 06/22/2024
**/

import java.util.Iterator;

public class Stack<T> implements Iterable, Iterator{
    T obj;
    LinkedList<T> s;
    T current = null;
    ListIterator<T> iter;
    
    /**
    * Creates a new instance of the stack object with the data type T specified.
    *
    * @param  none  the data that will be added to the stack
    */
    public Stack(){
        s = new LinkedList<T>();
    }

    /**
    * Addes and item to the top of the stack object. 
    *
    * @param  data  the data that will be added to the stack
    * @return      none
    */
    public void push(T data){
        s.add(0,data);
    }

    /**
    * Removes the item at the top of the stack, and returns it to the calling method. 
    *
    * @param  none  the data that will be added to the stack
    * @return The data in the top of the stack
    */
    public T pop() {
        T d = s.get(0);
        s.remove(0);
        return d;
    }

    /**
    * Returns the top item of the stack to the calling method, without removing the item.
    *
    * @param  none  the data that will be added to the stack
    * @return The data in the top of the stack
    */
    public T peek(){
        return s.get(0);
    }

     /**
    * Returns the index of the first instance of the data passes in 
    * parameter elem.  
    *
    * @param  elem  the data search will search for
    * @return The index of the first match
    */
    public int search(T elem) {
        return s.search(elem);
    }

    @Override
    public boolean hasNext() {
        return iter.hasNext();
    }

    @Override
    public T next() {
        return iter.next();
    }

    @Override
    public ListIterator<T> iterator() {
        iter = s.iterator();
        return iter;
    }

}
