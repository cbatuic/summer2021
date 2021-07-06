package ADTs;

/* 1. Specification */

/* 2. Requirements*/

class NodeDLL{
    int data;
    NodeDLL prev, next;    
    
    // constructor (initialize)
    NodeDLL(int d, NodeDLL p, NodeDLL n){
        data = d;
        prev = p;
        next = n;
    }
}

public class DLLOps {
    
    NodeDLL head;
    NodeDLL tail;

    // constructor - creates new linked list. (partial)
    DLLOps(){
        head = tail = null;
    }
    
    DLLOps(NodeDLL h, NodeDLL t){
        head = h;
        tail = t;
    }
 
    @Override
    public String toString(){
        String str = "[";
        NodeDLL curr = head;
        while(curr!=null){
            str = str + curr.data;
            curr = curr.next;
            if(curr!=null) str += ", ";
        }        
        str = str + "]";
        return str;
    }    
    
    
}

/* 3. Implementation*/

class DLLOpsTest{
    public static void main(String[] args) {
        
        NodeDLL n1 = new NodeDLL(10,null,null);
        NodeDLL n2 = new NodeDLL(20,null,null);
        NodeDLL n3 = new NodeDLL(30,null,null);
        /*
        Node
            a. data
            b. pointer (prev)  
            c. pointer (next)
          +------+------+------+
          | prev | data | next |
          +------+------+------+
            null <- n1 -> null
            null <- n2 -> null
            null <- n3 -> null            
        */
        
        // null <- 10 -> <- 20 -> <- 30 -> null
        // 10 <> 20 <> 30 DLL
        // [10, 20, 30] SLL
        n1.next = n2;
        n2.prev = n1;
        n2.next = n3;
        n3.prev = n2;
        
    }
}
