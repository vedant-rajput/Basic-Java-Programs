import java.util.*;

/*

public class arrays {
    public static void main(String args[]){
        int marks[] = new int [100];
        Scanner sc = new Scanner(System.in);

        //int phy
        // phy = sc.nextInt();

        marks[0] = sc.nextInt(); // phy
        marks[1] = sc.nextInt(); // chem
        marks[2] = sc.nextInt(); // math
        
        System.out.println("phy : " + marks[0]);
        System.out.println("phy : " + marks[1]);
        System.out.println("phy : " + marks[2]);

        int percentage = ( marks [0] + marks [1] + marks [2] / 3);
        System.out.println("percentage = " + percentage + " % " );
    }
}

*/

// performing linear search

/*

public class arrays {
    public static void update(int marks[]) {
        for (int i = 0; i < marks.length; i++) {
            marks[i] = marks[i] + 1;
        }
    }

    public static void main(String args[]) {
        int marks[] = { 94, 96, 95 };
        update(marks);

        // print our marks
        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i] + " ");
        }
        System.out.println();
    }
}

*/

/* 

public class arrays {
    public static int linearsearch(int array1[], int key){
      for(int i=0; i < array1.length; i++){
        if(array1[i] == key){
            return i;
        }
      }
        return -1;
    }    
    public static void main(String args[]){
        int array1[] = {2,4,6,8,10,12,14,16};
        int key = 10 ;
         
      int index = linearsearch(array1, key);
      if(index == -1){
        System.out.println("NOT found");
      } else {
        System.out.println("key is at index :" + index);
      }
}
}

*/

// finding largest number

/*
public class arrays{
    public static int getlargest (int numbers[]) {
         int largest = Integer.MIN_VALUE;
         int smallest = Integer.MAX_VALUE;
         for(int i = 0; i<numbers.length; i++){
            if(largest<numbers[i]){
                largest= numbers[i];
            }  
              if(smallest>numbers[i]){
                smallest = numbers[i];
              }
         }
         System.out.println("smallest value is : " + smallest);
         return largest;
    }


public static void main(String args[]){
    int numbers[] = {1,2,6,3,5};
     System.out.println("largest value is : " + getlargest(numbers));
  }
} 

*/

/*

public class arrays {
  public static int binarysearch(int numbers[], int key) {
    int start = 0, end = numbers.length - 1;

    while (start <= end) {
      int mid = (start + end) / 2;

      // comparisons
      if (numbers[mid] == key) {
        return mid;
      }
      if (numbers[mid] < key) {
        start = mid + 1;
      } else {
        end = mid - 1;
      }
    }
    return -1;
  }

  public static void main(String args[]) {
    int numbers[] = { 2, 4, 6, 8, 10, 12, 14 };
    int key = 10;

    System.out.println("index for key is : " + binarysearch(numbers, key));
  }
}

*/

// reversing the array

/*

public class arrays{
  public static void reversedarray(int numbers[]){
   int first = 0, last = numbers.length-1;

   while(first<last){
    int temp = numbers[last];
    numbers[last] = numbers[first];
     numbers[first]=temp;

     first++;
     last--;
   }
  }

public static void main(String args[]) {
    int numbers[] = { 2, 4, 6, 8, 10 };
    reversedarray(numbers);
    for(int i=0; i<numbers.length;i++){
      System.out.println(numbers[i] + " ");
  }
    System.out.println();
 }
}

*/

// pairs in an array

/*

public class arrays{
   public static void printpairs(int numbers[]){
    for(int i=0; i<numbers.length;i++){
      int curr = numbers[i];
       for(int j=i+1;j<numbers.length;j++){
        System.out.println("(" + curr + "," + numbers[j] + ")");
    }
       System.out.println();
  }
}


public static void main(String args[]) {
    int numbers[] = { 2, 4, 6, 8, 10 };
    printpairs(numbers);
 }
}
 
*/

// printing sub arrays:

/*

public class arrays {
  public static void subarray(int numbers[]) {
    int ts = 0;
    for (int i = 0; i < numbers.length; i++) {
      int start = i;
      for (int j = i; j < numbers.length; j++) {
        int end = j;
        for (int k = start; k <= end; k++) {
          System.out.print(numbers[k] + " ");
        }
        ts++;
        System.out.println();
      }
      System.out.println();
    }
      System.out.println("total sub arrays are : " + ts);
  }

  public static void main(String args[]) {
    int numbers[] = { 2, 4, 6, 8, 10 };
    subarray(numbers);
  }
}

*/

// finding the sum of sub arrays:

/*

public class arrays {
  public static void maxsubarraysum(int numbers[]) {
    int currsum = 0;
    int maxsum = Integer.MIN_VALUE;


    for (int i = 0; i < numbers.length; i++) {
      int start = i;
      for (int j = i; j < numbers.length; j++) {
        int end = j;
        currsum = 0;
        for (int k = start; k <= end; k++) {
          currsum += numbers[k];
        }
        System.out.println(currsum);
        if(maxsum<currsum){
          maxsum=currsum;
        }
      }
    }
    System.out.println("max sum is = " + maxsum );
  }

  public static void main(String args[]) {
    int numbers[] = { 1, -2, 6, -1, 3 };
    maxsubarraysum(numbers);
  }
}

*/

// prefix sum of array

/*

public class arrays {
  public static void maxsubarraysum(int numbers[]) {
    int currsum = 0;
    int maxsum = Integer.MIN_VALUE;
    int prefix[] = new int[numbers.length];
    
    prefix[0] = numbers[0];
    // calulating prefix array

    for(int i=1; i<prefix.length;i++){
      prefix[i] = prefix[i-1]+numbers[i];
    }

    for (int i = 0; i < numbers.length; i++) {
      int start = i;
        for (int j = i; j < numbers.length; j++) {
          int end = j;

        currsum = start == 0 ? prefix[end] : prefix[end]-prefix[start-1];
        
        if(maxsum<currsum){
          maxsum=currsum;
        }
      }
    }
    System.out.println("max sum is = " + maxsum );
  }

  public static void main(String args[]) {
    int numbers[] = { 1, -2, 6, -1, 3 };
    maxsubarraysum(numbers);
  }
}

*/

// kadanes rule:

/*

public class arrays {
  public static void maxsubarraysum(int numbers[]) {
    int currsum = 0;
    int maxsum = Integer.MIN_VALUE;
    int prefix[] = new int[numbers.length];
    
    prefix[0] = numbers[0];
    // calulating prefix array

    for(int i=1; i<prefix.length;i++){
      prefix[i] = prefix[i-1]+numbers[i];
    }

    for (int i = 0; i < numbers.length; i++) {
      int start = i;
        for (int j = i; j < numbers.length; j++) {
          int end = j;

        currsum = start == 0 ? prefix[end] : prefix[end]-prefix[start-1];
        
        if(maxsum<currsum){
          maxsum=currsum;
        }
      }
    }
    System.out.println("max sum is = " + maxsum );
  } 

   public static void kadanes(int numbers[]){
    int ms = Integer.MIN_VALUE;
    int cs = 0;

    for(int i =0; i<numbers.length; i++){
      cs = cs + numbers[i];
      if(cs<0){
         cs=0;
      }
       ms = Math.max(cs, ms);
    }
        System.out.println(" our maximun sub array sum is : " + ms);
}

  public static void main(String args[]) {
    int numbers[] = {-2, -3, 4, -1, -2, 1, 5, -3};
    kadanes(numbers);
  }
}

*/

 // trapping rain water problem:

 /*
 given a non -ve integers representing an elevation
 map where the width of each bar is 1, compute how much water can it trap.
*/

/*

public class arrays{
  public static int TrappingRainWater(int height[]){
    int n = height.length;
   // to calculate left max boundary -> array
     
     int leftmax[] = new int[n];
     leftmax[0] = height[0];
     for(int i=1; i<n; i++){
       leftmax[i] = Math.max(height[i], leftmax[i-1]);

    }   

   // to calculate right max boundary -> array
   
   int rightmax[] = new int[n];
   rightmax[n-1] = height[n-1];
   for(int i = n-2; i>=0; i--){
    rightmax[i] = Math.max(height[i],rightmax[i+1]);
   }

  
     int trappedwater = 0;
   //loop
      for(int i = 0; i<n; i++){

      // waterlevel = min(leftmax bound , rightmax bound)  
      int waterlevel = Math.min(leftmax[i], rightmax[i]);

      // trappedwater = waterlevel - height[i]
       trappedwater += waterlevel- height[i];
    }
   return trappedwater;
 }  


public static void main(String args[]) {
   int height[] = {4,2,0,6,3,2,5};
   System.out.println(" the trapped water is :" + TrappingRainWater(height));
 }
}

*/


// BUY OR SELL STOCKS:

/*

 you are given an array prices, [i] is the price of a given stock
 on the ith day. you want to maximize your profit by chossing a single day
to buy one stock and choosing a different day in future to sell that 
stock, return the max profit you can achieve by this transaction, if you
cannot achieve any profit then retuen zero.

[prices] = 7,1,5,3,6,4

 */

 //solution:

 /*

 public class arrays{
   public static int buyAndsellStocks(int prices[]){
    int buyPrice = Integer.MAX_VALUE;
    int maxProfit = 0;

    for( int i =0; i<prices.length; i++){
      if(buyPrice<prices[i]){
        // profit
        int profit = prices[i] - buyPrice;
        maxProfit = Math.max(maxProfit, profit);
      } else {
        buyPrice = prices[i];

      }
    }
    return maxProfit;
  }


public static void main(String args[]){
  int prices[] = {7,1,5,3,6,4};
  System.out.println("the maximum profit earned is : " + buyAndsellStocks(prices));
}
}

*/






