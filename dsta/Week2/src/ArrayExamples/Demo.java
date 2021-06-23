package ArrayExamples;

public class Demo {
    public static void main(String[] args) {
        int a = 2;     // a = 2
        //a++;           // a = 2
        //int b = a + 1; // a = 3
        
        int b = (++a) + 1; // a = 3
        System.out.printf("%d - %d", a, b); // a = 3
        
        // ++a -> pre increment
        // a++ -> post increment
    }
}
