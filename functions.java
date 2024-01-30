/*
import java.util.*;
public class functions {
  public static void printelloworld(){
    System.out.println("hello world");
  }    
    public static void main(String args[]){
        printelloworld();
    }
}

*/

/* 

import java.util.*;
 public class functions {
public static void calculateSum(){
  Scanner sc = new Scanner(System.in);
  int a = sc.nextInt();
  int b = sc.nextInt();
  int sum  = a+b;
  System.out.println("sum is : " + sum);

}

public static void main(String args[]) {
   calculateSum();
}
}

*/

/*

import java.util.*;
  public class functions{
  public static void calculateSum(int num1, int num2) {

    int sum = num1 + num2;
    System.out.println("sum is : " + sum);

  }

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    calculateSum(a, b);
  }
}

*/

/* 

public class functions {
  public static void main(String args[]) {
    int a = 5;
    int b = 10;

    // swap:

    int temp = a;
    a = b;
    b = temp;

    System.out.println("a = " + a);
    System.out.println("b = " + b);
  }
}

*/

/*

Swapping done by using call function:

public class functions {
  public static void swap(int a, int b) {
    int temp = a;
    a = b;
    b = temp;

    System.out.println("a = " + a);
    System.out.println("b = " + b);
  }

  public static void main(String args[]) {
    int a = 5;
    int b = 10;
    swap(a, b);
  }

}

*/

/* 

multiplycation by using calling  function:

public class functions{
  public static int multiply(int a, int b){

    int product = a * b;
    return product;

  }

public static void main(String args[]){
   int a = 5;
   int b = 20;  
   int prod = multiply(a, b);
   System.out.println("a * b = "+prod);

  }
}

*/

 
public class functions{
  public static int factorial(int n) {
    int f = 1;
    for (int i = 1; i <= n; i++) {
      f = f * i;
    }
    return f;
  }
    
  // remove this part to find the factorial
  public static int binCoeff(int n, int r) {
    int fact_n = factorial(n);
    int fact_r = factorial(r);
    int fact_nmr = factorial(n-r);

    int binCoeff = fact_n / (fact_r * fact_nmr);
    return binCoeff;
  } // up to here
  public static void main(String args[]) {

        System.out.println(binCoeff(5,2));
  }
}





