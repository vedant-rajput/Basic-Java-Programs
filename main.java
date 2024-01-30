// Scope:

/* 

public class main{
public static void main(String args[]){
   // System.out.println(s); // s in not define, but when added later it is accepted
   int s = 45;
   System.out.println(s);  
 }
}

*/

// block scope:
/*

public class main{
    public static void main (String args[]){

         {
            int s = 45;
            System.out.println(s);
         }
      // System.out.println(s); will not be accepted because it is out if the brackets!!
    }
}

*/

// public class main {
//     public static void main(String args[]) {

//         for (int i = 1; i <= 5; i++) {
//             for (int j = 1; j <= i; j++) {
//                 System.out.print(j);
//             }
//           System.out.println();
//         }
//     }
// }

// public class main {

//     public static void main(String[] args) {
//         for (int i = 1; i <= 5; i++) {
//             for (int j = 1; j <= i; j++) {
//                 System.out.print(j);
//             }
//             System.out.println();
//         }
//     }
// }

// public class main {

//     public static void main(String[] args) {
//          int count = 1;
//          while(count<=15){
//           System.out.println(count % 2 == 1 ? " *** " : "+++++");
//            ++count;
//         }

//     }
// }

/*

public class main {
    public static void hollow_rectangle(int totRows, int totCols) {
        // outer loop
        for (int i = 1; i <= totRows; i++) {
            // inner loop
            for (int j = 1; j <= totCols; j++) {
                // cell - (i,j)
                if (i == 1 || i == totRows || j == 1 || j == totCols) {
                    // boundary cells
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        hollow_rectangle(4, 5);// call the method
    }

}

*/

/* 

public class main {
    public static void halfpyramid(int n) {

            // outer loop
        for (int i=1; i<=n; i++) {
            // spaces
            for (int j=1; j<=n-1; j++) {
                System.out.print(" ");
            }
            // stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    public static void main(String args[]) {
        halfpyramid(7);
    }
}

*/

/*

//inverted_half_pyramid_with_numbers

public class main {
    public static void inverted_half_pyramid_with_numbers(int n) {

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print(j + " ");
            }
            System.out.println(" ");
        }

    }

    public static void main(String args[]) {
        inverted_half_pyramid_with_numbers(5);
    }
}

*/

/*
    // floye's triangle:

public class main{
    public static void floyds_triangle(int n){
      // outer
      int counter = 1;
      for(int i = 1; i<=n; i++){
        // inner - how many times will the counter be printed
        for(int j=1; j<=i;j++){
            System.out.print(counter+ " ");
            counter++;
        }
        System.out.println();
      }

    }
public static void main(String args[]){
    floyds_triangle(5);
  }  
}

*/

// 0-1 triangle pattern

/* 

public class main {
    public static void zero_one_triangle_pattern(int n) {
        int counter = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print("1");
                } else {
                    System.out.print("0");
                }
            }

            System.out.println();
        }
    }

public static void main (String args[]){
    zero_one_triangle_pattern(5);
}
}

*/

// butterfly pattern

/*

public class main{
 public static void butterfly_pattern(int n){
    // first half
    for(int i=1; i<=n;i++){
        // stars - i
        for(int j=1; j<=i;j++){
      System.out.print("*");
    }
        // spaces - 2*(n-i)
        for(int j = 1; j <=2*(n-i); j++){
            System.out.print(" ");
    } 
        // stars
        for(int j=1; j<=i; j++){
            System.out.print("*");
   }
   System.out.println();
  }
      // 2nd half
    
    for(int i=n; i>=1;i--){
        // stars - i
        for(int j=1; j<=i;j++){
      System.out.print("*");
    }
        // spaces - 2*(n-i)
        for(int j = 1; j <= 2*(n-i); j++){
            System.out.print(" ");
    } 
        // stars
        for(int j=1; j<=i; j++){
            System.out.print("*");
   }
   System.out.println();
  }
 }
   public static void main (String args[]){
    butterfly_pattern(4);
   }
}

*/

// soild rhombus with hollow rhombus

/*

public class main {
    public static void soild_rhombus(int n) {
        // outer loop
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }
            // stars
            for (int j = 1; j <= n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
 // hollow rhombus (the above code should also be present )
    public static void hollow_rhombus(int n) {
        for (int i = 1; i <= n; i++) {
            // spaces
            for (int j = 1; j <=(n-1); j++) {
                System.out.print(" ");
            }
            // hollow rectangle
            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == n || j == 1 || j == n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
              System.out.println();
        }
    }

    public static void main (String args[]) {
        hollow_rhombus(7);
    }
}

*/

public class main {
    public static void soild_diamond(int n) {
        // 1st half
        for (int i = 1; i <= n; i++) { 
            // spaces
            for( int j =1; j<=(n-i); j++){
              System.out.print(" ");
            }

           // stars 
           for(int j = 1; j<=(2*i)-1; j++){
            System.out.print("*");
           }
          
        System.out.println();
}   
// 2nd half

   for (int i = n; i >= 1; i--) { 
            for( int j =1; j<=(n-i); j++){
              System.out.print(" ");
            }
           // stars 
           for(int j = 1; j<=(2*i)-1; j++){
            System.out.print("*");
           }
              System.out.println();
    }
}

public static void main (String args[]){
    soild_diamond(5);
}
}
       



 



