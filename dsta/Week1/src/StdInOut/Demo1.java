package StdInOut;
public class Demo1 {
    public static void main(String[] args) {
        System.out.print(6);
        System.out.print(6.5);
        System.out.print('c');
        System.out.print(true);
        
        System.out.println("\n" + 6 + (7 * (6 + 5)) + " " + 6.5);
        
        char ch = 'A';
        short s = 32767;
        boolean b = false;
        System.out.printf("%c\n%c\n%d\t%b",ch,ch,s,b);
        
        // Math support functions (floor(), ceil(), round())
        double x = 8.6;
        double y = 4.4;
        
        System.out.printf("\n%d",Math.round(x));
        System.out.println("\n-------");
        System.out.println(Math.round(x));
        System.out.println("-------");
        System.out.printf("\n");
        System.out.printf("%f",Math.ceil(y));
        System.out.printf("\n%f",Math.floor(y));
        
    }
}
