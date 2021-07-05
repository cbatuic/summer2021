package ADTs;

/* 1. Specification 
    
    Data: Linear arrangement that follows FIFO principle.
          Items are in a restricted list, where all insertions occur at one end,
          the tail/rear, and all deletions occur at the other end, the head/front.
    Operations: 
        * toString( )   - function that convert and return the array elements to string.
        * enqueue(elem) - inserts item at the tail of the queue.
        * dequeque( )   - removes item from the head of the queue.
        * size( )       - returns the number of items in the queue.
        * isEmpty( )    - returns true if the queue is empty.
        * isFull( )     - returns true if the queue is full.
        * peek( )       - returns item at the front of the queue without removing the item.
*/

public class QueueOps {
    /*2. Representation */
    private int queue[];
    private int head;
    private int tail;
    
    //constructor
    QueueOps(int size){
        queue = new int[size];
        head = tail = -1;
    }

    @Override
    public String toString() {
        String str = "";
        for (int i = 0; i < queue.length; i++) {
            if (queue[i] == 0) {
                str = str + "_" + " ";
            } else {
                str = str + queue[i] + " ";
            }
        }
        return str;
    }    
    
    public void enqueue(int elem){ // linear queue
        // case 1: if head and tail is = -1, then head and tail set to 0
        if(head==-1 && tail==-1){
            head = tail = 0;
        }        
        // case 2: if (head is equal to tail) and (tail is less than queue size), then increment tail
        else if(head == tail && tail < queue.length-1){
            if(queue[head]>0)
                tail = tail + 1;
        }
        // case 3: if (head is less than tail) and (tail is less than queue size), then increment tail
        else if(head < tail && tail < queue.length-1){
            tail = tail + 1;
        }
        // case 4: else, display queue overflow
        else{
            System.out.printf("Queue Overflow!\n");
            return;
        }
        
        queue[tail] = elem;
        System.out.printf("Enqueue(%s) head=%s tail=%s\n", elem, head, tail);
    }
    
    public void dequeue(){
        // case 1: if head and tail = -1, then display queue underflow
        if(head == -1 && tail == -1){
            System.out.printf("Queue Underflow!\n");
            return;
        }        
        
        // case 2: if head is equal to tail and tail is less than the queue size
        //          then, 
        //          if queue head element is empty then display underflow
        //          else assign queue head element to zero 
        //              and increment tail
        else if(head==tail && tail < queue.length-1){
            if(queue[head]==0){
                System.out.printf("Queue Underflow!\n");
                return;                
            }            
            tail = tail + 1;            
        }
        
        queue[head] = 0;
        head = head + 1;
        System.out.printf("Dequeue() head=%s tail=%s\n", head, tail);
    }    
}

class QueueOpsTest{
    public static void main(String[] args) {
        /* 3. Implementation */   
        QueueOps q = new QueueOps(4);
        System.out.printf("%s\n",q.toString());
        q.enqueue(2);
        q.enqueue(5);
        q.enqueue(7);
        q.dequeue();
        q.enqueue(10);
        q.enqueue(20);        
        q.dequeue();
        System.out.printf("%s\n",q.toString());

    }
}
