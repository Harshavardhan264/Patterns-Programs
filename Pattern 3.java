// Pyramid pattern
import java.util.*;

public class Main {
    public static void printPattern(int n)
    {
        int i, j;

        for (i = n; i >= 1; i--) {
            for (j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String args[])
    {
        int n = 6;
        printPattern(n);
    }
}

//output
******
*****
****
***
**
*
