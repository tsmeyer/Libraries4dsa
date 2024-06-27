import java.util.Iterator;
// import java.util.ListIterator;

public class LinkedList<T> implements Iterable {
    private node<T> head;
    private node<T> tail;
    private int length = 0;

    public LinkedList ()  {
        head = null;
        tail = head;
    }  

    public void add(T data){
        
        node<T> temp = new node<T>(data);

        if (this.head == null){ 
            head.next = temp;
            length = 1;
            return;
        }

        tail.next = temp;
        length++;
    }
    public void add(int position, T data){
        node<T> temp = new node<T>(data);

        temp.next = head;
        head = temp;
    }

    public T get(int i){
        if (i>length) {
            // error, how do I return an error?
        }
        int counter = 0;
        node<T> tmp = head;
        while (tmp != null && counter < i){
            tmp = tmp.next;
        }
        return tmp.data;
    }

    public void remove(int index) {
        if (index > length) {
            // error, how do I return an error?
        }
        int counter = 0;
        node<T> tmp = head;
        node<T> prev = null;
        while (tmp != null && counter < index){
            prev = tmp;
            tmp = tmp.next;
        }
        if (prev != null){
            // this is the case when removing from the middle
            prev.next = tmp.next;
        } 
        else{
            // This is the case when removing the head
            head = head.next;
        }

    }

    public void remove(T key) {

        node<T> tmp = head;
        node<T> prev = null;
        while (tmp != null && tmp.data != key){
            prev = tmp;
            tmp = tmp.next;
        }
        prev.next = tmp.next;
    }

    public void clear(){
        head = null;
        tail = null;
        length = 0;
    }

    public boolean isEmpty(){
        return length == 0;
    }

    public int length(){
        return length;
    }

    public int search(T elem){
        
        int counter = 0;
        node<T> tmp = head;
        while (tmp != null ){
            if (tmp.data.equals(elem)) {
                return counter;
            }
            tmp = tmp.next;
            counter++;
        }
        return -1;
    }

    public node<T> getHead() {
        return head;
    }

    public node<T> getTail() {
        return tail;
    }

    public int getLength() {
        return length;
    }

    @Override
    public ListIterator<T> iterator() {
        return new ListIterator<T>(this);
    }

}

class ListIterator<T> implements Iterator<T> { 
    node<T> current; 
      
    // initialize pointer to head of the list for iteration 
    public ListIterator(LinkedList<T> list) 
    { 
        current = list.getHead(); 
    } 
      
    // returns false if next element does not exist 
    public boolean hasNext() 
    { 
        return current != null; 
    } 
      
    // return current data and update pointer 
    public T next() 
    { 
        T data = current.data; 
        current = current.next; 
        return data; 
    } 
      
    // implement if needed 
    public void remove() 
    { 
        throw new UnsupportedOperationException(); 
    } 
} 
