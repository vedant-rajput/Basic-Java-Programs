/*import java.util.*;

public class conditionals {
      public static void main (String args[]) {
        int age = 21;
        if(age>=18) {
            System.out.println("adult can : drive, vote");
        } 
        else{
          System.out.println("not adult");     
       }
      }
} */

/*import java.util.*;

public class conditionals {
  public static void main(String args[]) {
    int A = 5;
    int B = 3;
    if (A >= B) {
      System.out.println("A is the largerst of 2");
    } else {
      System.out.println("B is largest of 2 ");
    }

  }
}
 */

// TO PRINT ODD OR EVEN NUMBER : 

/*
 import java.util.*;

public class conditionals {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int number = sc.nextInt();
    if (number % 2 == 0) {
      System.out.println("EVEN");
    } else {
      System.out.println("ODD");
    }
  }
}
 */

/*import java.util.*;

public class conditionals {
  public static void main(String args[]) {
    int age = 21;

    if (age >= 18) {
      System.out.println("adult");
    }
     else if (age >= 13 && age < 18) {
      System.out.println("teenager");
    } 
    
    else {
      System.out.println("child");
    }
  }
} */

 /*
  import java.util.*;
 public class conditionals{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int income = sc.nextInt();
    int tax; 
    if(income < 500000){
      tax =0;
    }
    else if(income >= 500000 && income <1000000){
      tax = (int) (income * 0.2);
    }
    else{
      tax = (int) (income * 0.3);
    }
    System.out.println("your tax is :"+tax);
 }
} 
  */

/*
 import java.util.*;
      public class conditionals{
    public static void main(String args[]){

      int A = 1;
      int B = 3;
      int C = 6;
      if((A>=B) && (A>=C)){
        System.out.println("A");
      }
      else if(B>=C){
        System.out.println("B");
      }
      else{
        System.out.println("C");
      }
    }
  }
 */

/*
 import java.util.*;
  public class conditionals{
    public static void main(String args[]){
      int marks = 67;
      String reportcard = marks >= 33 ? "PASS" : "FAIL";
       System.out.println(reportcard);
    }
  }
 */

/* SWITCH STATEMENTS */

import java.util.*;
 public class conditionals{
  public static void main(String args[]){

    int number = 2 ;
    switch(number){
      case 1 : System.out.println("momos");
           break;

      case 2 : System.out.println("burger");

           break;
      case 3 : System.out.println("sharza");

           break;
      default : System.out.println("wake up");
     }
   }
 }
 