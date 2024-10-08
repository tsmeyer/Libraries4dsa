import java.util.Iterator;

import myLib.Stack;
import myLib.LinkedList;

class Test
{   
    // Pushing element on the top of the stack
    static void stack_push(Stack<Integer> stack)
    {
        for(int i = 0; i < 5; i++)
        {
            stack.push(i);
        }
    }
    
    // Popping element from the top of the stack
    static void stack_pop(Stack<Integer> stack)
    {
        System.out.println("Pop Operation:");

        for(int i = 0; i < 5; i++)
        {
            Integer y = (Integer) stack.pop();
            System.out.println(y);
        }
    }

    // Displaying element on the top of the stack
    static void stack_peek(Stack<Integer> stack)
    {
        Integer element = (Integer) stack.peek();
        System.out.println("Element on stack top: " + element);
    }
    
    // Searching element in the stack
    static void stack_search(Stack<Integer> stack, int element)
    {
        Integer pos = (Integer) stack.search(element);

        if(pos == -1)
            System.out.println("Element not found");
        else
            System.out.println("Element is found at position: " + pos);
    }


    public static void main (String[] args)
    {
        Stack<Integer> stack = new Stack<>();

        stack_push(stack);
        stack_pop(stack);
        stack_push(stack);
        stack_peek(stack);
        stack_search(stack, 2);
        stack_search(stack, 6);

        // Displaying the Stack 
        System.out.println("Stack: " + stack); 
  
        // Creating an iterator 
        Iterator<Integer> value = stack.iterator(); 
  
        // Displaying the values 
        // after iterating through the stack 
        System.out.println("The iterator values are: "); 
        while (value.hasNext()) { 
            System.out.println(value.next()); 
        } 

        // for (Integer i : stack){
        for (Integer i = stack.peek(); stack.hasNext(); stack.next()) {
            System.out.println( i);
        }
    }
}