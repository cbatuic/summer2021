package ArrayExamples;

public class Mul2D {
    public static void main(String[] args) {
        // 1. Array Initialization - by default all values is zero
        int mul2d [][] = new int[4][5];
        int i,j, k = 0;
        
        // 2. Assign values to the 2D Array
        for (i = 0; i < 4; i++){
            for(j = 0; j<5; j++){        
                mul2d[i][j] = k;
                k++;
            }            
        }// block statements - { }
        
        // 3. Display values
        for (i = 0; i < 4; i++){
            for(j = 0; j < 5; j++){
                System.out.printf("%d",mul2d[i][j]);                                
            }
            
        }
        
    }
}

/*
0 1 2 3 4 
5 6 7 8 9 .. 19


0
1
2
3
..
19
*/
