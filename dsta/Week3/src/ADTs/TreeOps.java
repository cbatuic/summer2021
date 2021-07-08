package NonLinear;

// Tree Data Structure using Linked List
/* 1. Specification 
    TreeOps
    Data: Nonlinear, Hierarchical arrangement. Binary Tree. (at most two children)
    Operations:
        toString()
        addLeftChild()
        addRightChild()
        preorder()
        postorder()
        inorder()
*/

/* 2. Representation */
class Node{
    char data;
    Node left, right; 
    
    Node(){
        data = 0;
        left = right = null;
    }
    
    Node(char d){
        data = d;
        left = right = null;
    }
    
    Node(char d, Node l, Node r){
        data = d;
        left = l;
        right = r;
    }
}

public class TreeOps {
    
    // In-order Traversal (LCR)
    /* 
        Traversal Problem => 
            (a) Iterative - loop e.g. for, do, while or 
            (b) Recursive - method that calls itself
    
             A
            / \
           B   C
          / \ / \
         0  0 0  0
    */
    
    void inorder(Node n){ // Recursive Statements
        // 1. base case
        if(n == null) return;
        // 2. general case/s
        inorder(n.left);
        System.out.print(n.data + " "); // mark as visited
        inorder(n.right);       
    }
    
    
}

/* 3. Implementation */
class TreeOpsTest{
    public static void main(String[] args) {
        
        //test1();
        test2();
    }
    
    public static void test2(){
        
        // 1. Node Construction
        Node a = new Node('A');
        Node b = new Node('B');
        Node c = new Node('C');
        Node d = new Node('D');
        Node e = new Node('E');
        Node f = new Node('F');
        Node g = new Node('G');
        Node h = new Node('H');
        Node i = new Node('I');
        Node j = new Node('J');
        Node k = new Node('K');        
        
        // 2. Tree Structure (creating edges)
        a.left = b;
        a.right = c;
        a.left.left = d; // b.left = d;
        a.left.right = e; // b.right = e;
        c.left = f;
        c.right = g;
        d.left = h;
        d.right = i;        
        f.right = j;
        g.left = k;        
        
        // 3. Tree Traversal
        TreeOps tree = new TreeOps();
        tree.inorder(a);
        System.out.println("");
        
        
    }
    
    public static void test1(){
        // Node Construction
        Node a = new Node('A');
        Node b = new Node('B');
        Node c = new Node('C');
        
        // Create a binary tree from the diagram below
        /*
                A
              /   \
             B     C 
        
        Inorder = B A C
        */
        
        // Tree Structure
        a.left = b;
        a.right = c;
                             
        TreeOps tree = new TreeOps();
        // upon calling the traversal method, always pass the root
        tree.inorder(a);
        System.out.println("");
    }
}
