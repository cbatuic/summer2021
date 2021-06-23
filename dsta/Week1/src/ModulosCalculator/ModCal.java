//package ModulosCalculator;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ModCal {
    public static void main(String[] args) throws FileNotFoundException {
        //Scanner sc = new Scanner(new File("src/ModulosCalculator/tc2.in"));
        Scanner sc = new Scanner(System.in);
        
        int A = sc.nextInt();
        int B = sc.nextInt();
        
        //find the modulo - %
        System.out.printf("%d",(A%B));
    }
}
