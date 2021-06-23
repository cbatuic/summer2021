//package StdInOut;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Demo2 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(System.in);
//        Scanner sc = new Scanner(new File("src/StdInOut/tc3.in"));
        
        int x = sc.nextInt();
        short s = sc.nextShort();
        
        System.out.printf("The input is: %d\n",x);
        System.out.printf("The input is: %d\n",s);
        System.out.printf("sum is: %d", (x+s));
    }
}
