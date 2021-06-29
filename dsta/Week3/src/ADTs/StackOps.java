package ADTs;

/*
1. Specification: StackOps ADT

    Data: linear arrangement of items that is accessible only at one end.
    Operations:
        * push(elem)    - function that inserts an element.
        * pop( )        - function that removes an element and returns the popped element.
        * top( )        - function that returns, does not remove, the topmost element from the stack.
        * isEmpty( )    - function that determines whether the stack is empty.
        * toString( )   - function that convert and return the array elements to string.

 */
public class StackOps {

    /*
    2. Representation
     */
    private int stack[];    // fixed size array
    private int top;        // pointer

    // constructor - initializes all initial/default values
    StackOps(int size) {
        stack = new int[size];
        top = -1;
    }

    @Override
    public String toString() {
        String str = "";
        for (int i = 0; i < stack.length; i++) {
            if (stack[i] == 0) {
                str = str + "_" + " ";
            } else {
                str = str + stack[i] + " ";
            }
        }
        return str;
    }

    public void push(int elem) {
        top = top + 1;
        stack[top] = elem;
    }

    public int pop() {
        int elem = stack[top];
        stack[top] = 0;
        top = top - 1;
        return elem;
    }

    public int top() {
        return stack[top];
    }

    public boolean isEmpty() {
        if (top == -1) {
            return true;
        } else {
            return false;
        }
    }

}

class StackOpsTest {

    public static void main(String[] args) {
        /*
        3. Implementation
         */

        StackOps s = new StackOps(5);
        System.out.printf("%s\n", s.toString());
        System.out.printf("Is stack empty? : %b\n", s.isEmpty());
        s.push(5);
        s.push(8);
        s.push(2);
        System.out.printf("%s\n", s.toString());
        System.out.printf("Is stack empty? : %b\n", s.isEmpty());
        System.out.printf("Top element is: %d\n", s.top());
        s.pop();
        System.out.printf("Top element is: %d\n", s.top());
        System.out.println("");
    }
}
