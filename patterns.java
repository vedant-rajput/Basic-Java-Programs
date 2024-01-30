
/*
    to print character pattern:

import java.util.*;

public class patterns {
    public static void main(String args[]) {
        int n = 4;
        char ch = 'A';
        for (int i = 1; i <= n; i++) {
            for (int chars = 1; chars <= i; chars++) {
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
}

*/

/*
    reverse star pattern:

import java.util.*;

public class patterns {
    public static void main(String args[]) {
        int n = 4;
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= (n - i + 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

*/