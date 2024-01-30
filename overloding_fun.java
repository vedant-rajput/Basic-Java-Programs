/*

public class overloding_fun {
    // funtion to calculate 2 nummbers
    public static int sum(int a, int b){
        return a+b;
    }

   // function to calculate sum of 3 numbers
   public static int sum(int a, int b, int c){
    return (a + b + c);
   }
  public static void main(String args[]){
     System.out.println(sum(3,5));
     System.out.println(sum(5,2,1));
  }
}

*/

// public class overloding_fun{
//     public static int sum (int a,int b){
//         return a+b;
//     }

//     public static float sum (float a, float b){
//         return a+b;
//     }
//     public static void main(String args[]){
//         System.out.println(sum(3,6));
//         System.out.println(sum(3.2f,5.8f));
//     }
// }

/*

// for prime or not:

public class overloding_fun {
    public static boolean isPrime(int n) {

        boolean isPrime = true;
        for (int i = 2; i <= n - 1; i++) {
            if (n % i == 0) { // compeletly dividing
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }

    public static void main(String args[]) {
        System.out.println(isPrime(5));
    }
}

public class overloding_fun{

}

*/

/* 

// optimized code for prime or not :

public class overloding_fun {
    public static boolean isPrime(int n) {
        if (n == 2) {
            return true;
        }

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
    return true;
}
public static void main(String args[]){
    System.out.println(isPrime(4));
  }
}

*/


// to find prime number in a given range:

/*

public class overloding_fun {
    public static boolean isPrime(int n) {
        if (n == 2) {
            return true;
        }

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    // additional part added to find prime numbers in a range:
    public static void primesInRange(int n) {
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) { // true
                System.out.println(i+" ");
            }
        }
    } // upto here

    public static void main(String args[]) {
        primesInRange(30);
    }
}

*/


