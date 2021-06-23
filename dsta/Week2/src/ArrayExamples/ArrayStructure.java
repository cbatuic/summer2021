
package ArrayExamples;

public class ArrayStructure {
    // Stage 1: Specification
    int arr[];
    
    
    // Stage 2: Representation
    ArrayStructure(int size){ // constructor method
        arr = new int[size];
    }
    
    //Define ArrayOperations here..
}

// Stage 3: Implementation
class ArrayStructureTest{
    public static void main(String[] args) {
        ArrayStructure arr1 = new ArrayStructure(5);
        // Perform array operations here..
    }
}

/*
    class ArrayOps{
        public static void main(String [] args){
            int arr[] = new int[5];
            //Array Operations
        }        
    }
*/