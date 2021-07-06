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
    
    // constructor - creates new linked list. (partial)
    SLLOps(){
        head = tail = null;
    }
    
    SLLOps(Node h, Node t){
        head = h;
        tail = t;
    }
    
    
    @Override
    public String toString(){
        String str = "[";
        Node curr = head;
        while(curr!=null){
            str = str + curr.data;
            curr = curr.next;
            if(curr!=null) str += ", ";
        }        
        str = str + "]";
        return str;
    }
    
    public boolean isEmpty(){
        /*
        boolean result = false;
        //logic
        if(head == null && tail == null) result = true;
        return result;
        */
        
        return (head==null && tail==null);
    }

    public void addToTail(SLLOps list, int data) {
        /*
        [] head=NULL tail=NULL
        tmp node
          +---------+------+
          |  data   |  ptr |
          +---------+------+
        [10]
        */
        Node tmp = new Node(data,null);
        if(list.isEmpty()) {
            list.head = tmp;
            list.tail = tmp;
        }
        else{
            list.tail = tmp;
            // need to traverse (loop) to find the last node
            // 10 -> 20 -> 30 -> null
            
            //dynamic - find the last node            
            Node curr = list.head;            
            while(curr!=null){                
                if(curr.next==null){
                    // last node found
                    curr.next = tmp;
                    break;
                }
                curr = curr.next;
            }           

        }        
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
        
        SLLOps slla = new SLLOps(n1,n3);        
        //System.out.printf("%s\n",slla.toString());
        //System.out.printf("Is linked list empty? : %b\n", slla.isEmpty());
        // [10, 20, 30]
        
        SLLOps sllb = new SLLOps();        
        System.out.printf("%s\n",sllb.toString());
        sllb.addToTail(sllb, 10);
        System.out.printf("%s\n",sllb.toString());
        sllb.addToTail(sllb, 20); // [10, 20]
        System.out.printf("%s\n",sllb.toString());
        sllb.addToTail(sllb, 30); // [10, 20, 30]
        System.out.printf("%s\n",sllb.toString());
        sllb.addToTail(sllb, 40); // [10, 20, 30, 40]
        System.out.printf("%s\n",sllb.toString());
        //System.out.printf("Is linked list empty? : %b\n", sllb.isEmpty());
        
    }
}

/*
The linked list ADT needs to support several operations like the following:
• add – adds a new node containing an info into a linked list
  addToTail, addToHead, addBeforeNode, addAfterNode

  e.g. addToTail
  [] (head = null, tail=null)
  addToTail(sll, 10)
  [10]

  [10, 20, 30]  (head = 10, tail=30)
  addToTail(sll, 40)
  [10, 20, 30, 40]
  

• find – returns a pointer to the first node containing an info, if any
• delete – deletes the first node containing an info from a linked list, if any

done:
• new – creates a new linked list (see constructor)
• toString – returns a string concatenating the info’s in a linked list
• isEmpty – determines if a linked list contains nodes or not
*/
