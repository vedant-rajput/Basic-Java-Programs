import java.util.*; 
public class conversions {
    public static void main(String args[]) {
        
        Scanner sc = new Scanner(System.in);
           // int number = sc.nextFloat(); as float cannit be stored in int
           float number = sc.nextInt();
           // int can be stored in float and it's value will be converted into float by java and similarly for othher data types.
            System.out.println(number);
        
      
    }
}

/*
TYPE CASTING: 
It is a type of conversion which java doesn't allow
and still converted forcefully.

float a = 25.12f;
int b = a; (error shown)
int b = (int) a;(crct)

TYPE PROMOTIONS:

 import java.uti.*;

 public class(filename){
    public ststic void main(String args[]){
         char a = 'a';
         char b = 'b';
     System.out.println(int(a));
     System.out.println(int(b));
         System.out.println(b-a); 
    }
 }

--> In this below code:
all the dove data types are converted to
one data type to produce one output.

int a = 10;
        float b = 20.25f;
        long c = 25;
        double d = 30;
        double ans = a+b+c+d;
        System.out.println(ans); 




*/ 
