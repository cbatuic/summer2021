package ADTs;

// 1. Specification
/*
    Data: 
        - Items are in a list same as Array but the size if flexible (dynamic).
    Operations:
        * toString( ) - function that convert and return the array elements to string.
*/

/* 2. Representation 
        Node
          a. data
          b. pointer (next)

          +---------+------+
          |  data   |  ptr |
          +---------+------+

*/


class Node{
    int data;
    Node next;  
    
    //constructor (initialize)
    Node(int d, Node n){
        data = d;
        next = n;
    }
}

public class SLLOps {
    
    Node head;
    Node tail;
    
    SLLOps(Node h, Node t){
        head = h;
        tail = t;
    }
    
    @Override
    public String toString(){
        String str = "";
        Node curr = head;
        while(curr!=null){
            str = str + curr.data + " ";
            curr = curr.next;
        }
        return str;
    }
    
}

class SLLOpsTest{
    public static void main(String[] args) {
        /* 3. Implementation */
        
        Node n1 = new Node(10,null);
        Node n2 = new Node(20,null);
        Node n3 = new Node(30,null);
        
        n1.next = n2;
        n2.next = n3;
        
        SLLOps sll = new SLLOps(n1,n3);
        System.out.printf("%s\n",sll.toString());
        // [10, 20, 30]
    }
}
