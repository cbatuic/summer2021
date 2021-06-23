package ArrayExamples;

public class ArrayOps {
    // 1. Specification: ArrayOps ADT
    /*    
        Data: 
            * Sequence of integers - The length is from 5 to 100 numbers
        Operations:
            * toString() - function that converts the sequence to string.
            * addToFirst(elem) - function that insert element at the beginning of the sequence.
            * addToLast(elem) - function that insert element at the end of the sequence.
            * addBefore(pos,elem) - function that insert element before the specified position.
            * addAfter(pos, elem) - function that insert element after the specified position.    
    */
    
    // 2. Representation
    byte arr[];
    byte ptr;
    
    ArrayOps(byte size){
        arr = new byte[size];
    }
    
    @Override
    public String toString(){
        String s = "";
        // Traverse the array
        for(int i=0; i < arr.length; i++){
            s = s + arr[i] + " ";
        }
        return s;
    }
    
    // 3 9 7 1
    // addToFirst(6)
    // 6 3 9 7 1
    public void addToFirst(byte elem){
        /*
            1. Create a dummy array with the same size of the main array.
            2. Set dummy's first element value to elem.
            3. Copy the remaining values from the main array to dummy array.
            4. Set dummy array as the new main array.
        */
        
        byte dummy[] = new byte[arr.length];
        dummy[0] = elem;
        for(int i=1;i<arr.length;i++){
            dummy[i] = arr[i-1];
        }
        arr = dummy;
    }    
}

// 3. Implementation
class ArrayOpsTest{
    public static void main(String[] args) {        
        ArrayOps arr = new ArrayOps((byte)5);
        
        System.out.printf("%s\n",arr.toString());
        arr.addToFirst((byte)1);
        arr.addToFirst((byte)7);
        arr.addToFirst((byte)9);
        arr.addToFirst((byte)3);
        System.out.printf("%s\n",arr.toString());
        arr.addToFirst((byte)6);
        System.out.printf("%s\n",arr.toString());
    }
}