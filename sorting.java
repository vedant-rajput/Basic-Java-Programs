import java.util.*;

// import java.util.Arrays; -> package in java used to solve 
//sorting with a calling function

// bubble sorting:

/*

public class sorting {
  public static void bubblesort(int arr[]) {
    for(int turn = 0; turn<arr.length-1; turn++ ){
      for(int j=0; j<arr.length-1-turn; j++){
        if(arr[j]>arr[j+1]){
            // swap
            int temp = arr[j];
            arr[j] = arr[j+1];
            arr[j+1] = temp;
        }
      }
    }
  }
   public static void printARR(int arr[]){
    for(int i =0; i<arr.length;i++){
        System.out.print(arr[i]+" ");
    }
     System.out.println();
   }
public static void main(String args[]){
    int arr[] = {5,4,1,3,2};
    bubblesort(arr);
    printARR(arr);
 }
}

*/

//selection sort:

/*

public class sorting {
  public static void SelectioSort(int arr[]) {
    for(int turn = 0; turn<arr.length-1; turn++ ){
      for(int j=0; j<arr.length-1-turn; j++){
        if(arr[j]>arr[j+1]){
            // swap
            int temp = arr[j];
            arr[j] = arr[j+1];
            arr[j+1] = temp;
        }
      }
    }
  }
   public static void printARR(int arr[]){
    for(int i =0; i<arr.length;i++){
        System.out.print(arr[i]+" ");
    }
     System.out.println();
   }
      public static void selectioSort(int arr[]){
        for(int i=0; i<arr.length-1; i++){
          int minPos = i;
          for(int j= i+1; j<arr.length; j++){
            if(arr[minPos]>arr[j]){
              // if(arr[minPos]<arr[j]) to print in decending order
              minPos = j;
            }
          }
          //swap
          int temp = arr[minPos];
          arr[minPos]=arr[i];
          arr[i]=temp;
        }
      }     


public static void main(String args[]){
    int arr[] = {5,4,1,3,2};
    selectioSort(arr);
    printARR(arr);
 }
}

*/

// insertion sort:

/*

public class sorting {
  public static void SelectioSort(int arr[]) {
    for(int turn = 0; turn<arr.length-1; turn++ ){
      for(int j=0; j<arr.length-1-turn; j++){
        if(arr[j]>arr[j+1]){
            // swap
            int temp = arr[j];
            arr[j] = arr[j+1];
            arr[j+1] = temp;
        }
      }
    }
  }
   public static void printARR(int arr[]){
    for(int i =0; i<arr.length;i++){
        System.out.print(arr[i]+" ");
    }
     System.out.println();
   }
      public static void selectioSort(int arr[]){
        for(int i=0; i<arr.length-1; i++){
          int minPos = i;
          for(int j= i+1; j<arr.length; j++){
            if(arr[minPos]>arr[j]){
              // if(arr[minPos]<arr[j]) to print in decending order
              minPos = j;
            }
          }
          //swap
          int temp = arr[minPos];
          arr[minPos]=arr[i];
          arr[i]=temp;
        }
      }     
  
      public static void insertionSort(int arr[]) {
      for (int i=1 ; i < arr.length; i++) {
        int curr = i;
        int prev = i-1 ;
        while(prev>=0 && arr [prev] > arr [curr]){
          arr[prev+1] = arr[prev];
          prev--;
        }
        // insertion
        arr[prev+1] = curr;
      }
     }

public static void main(String args[]){
    int arr[] = {5,4,1,3,2};
    insertionSort(arr);
    printARR(arr);
 }
}

*/

//inbuilt sorting:

/*

public class sorting {
  public static void SelectioSort(int arr[]) {
    for(int turn = 0; turn<arr.length-1; turn++ ){
      for(int j=0; j<arr.length-1-turn; j++){
        if(arr[j]>arr[j+1]){
            // swap
            int temp = arr[j];
            arr[j] = arr[j+1];
            arr[j+1] = temp;
        }
      }
    }
  }
   public static void printARR(int arr[]){
    for(int i =0; i<arr.length;i++){
        System.out.print(arr[i]+" ");
    }
     System.out.println();
   }
      public static void selectioSort(int arr[]){
        for(int i=0; i<arr.length-1; i++){
          int minPos = i;
          for(int j= i+1; j<arr.length; j++){
            if(arr[minPos]>arr[j]){
              // if(arr[minPos]<arr[j]) to print in decending order
              minPos = j;
            }
          }
          //swap
          int temp = arr[minPos];
          arr[minPos]=arr[i];
          arr[i]=temp;
        }
      }     
  
      public static void insertionSort(int arr[]) {
      for (int i=1 ; i < arr.length; i++) {
        int curr = i;
        int prev = i-1 ;
        while(prev>=0 && arr [prev] > arr [curr]){
          arr[prev+1] = arr[prev];
          prev--;
        }
        // insertion
        arr[prev+1] = curr;
      }
     }

public static void main(String args[]){
    int arr[] = {5,4,1,3,2};
    // insertionSort(arr);
    Arrays.sort(arr);
    printARR(arr);
 }
}

*/

// counting sort

/*

public class sorting {
  public static void SelectioSort(int arr[]) {
    for(int turn = 0; turn<arr.length-1; turn++ ){
      for(int j=0; j<arr.length-1-turn; j++){
        if(arr[j]>arr[j+1]){
            // swap
            int temp = arr[j];
            arr[j] = arr[j+1];
            arr[j+1] = temp;
        }
      }
    }
  }
   public static void printARR(int arr[]){
    for(int i =0; i<arr.length;i++){
        System.out.print(arr[i]+" ");
    }
     System.out.println();
   }

   //selection sort

      public static void selectioSort(int arr[]){
        for(int i=0; i<arr.length-1; i++){
          int minPos = i;
          for(int j= i+1; j<arr.length; j++){
            if(arr[minPos]>arr[j]){
              // if(arr[minPos]<arr[j]) to print in decending order
              minPos = j;
            }
          }
          //swap
          int temp = arr[minPos];
          arr[minPos]=arr[i];
          arr[i]=temp;
        }
      }     
  // insertion sort
      public static void insertionSort(int arr[]) {
      for (int i=1 ; i < arr.length; i++) {
        int curr = i;
        int prev = i-1 ;
        while(prev>=0 && arr [prev] > arr [curr]){
          arr[prev+1] = arr[prev];
          prev--;
        }
        // insertion
        arr[prev+1] = curr;
      }
     }

// counting sort

     public static void countingSort(int arr[]){
      int largerst = Integer.MIN_VALUE;
      for(int i=0; i<arr.length; i++){
        largerst = Math.max(largerst, arr[i]);
      }

       int count[] = new int[largerst+1];
       for(int i =0; i<arr.length;i++){
        count[arr[i]]++;
       }
         //sorting
         int j=0;
         for(int i=0; i<count.length;i++){
           while(count[i]>0){
            arr[j] = i;
            j++;
            count[i]--;
           }
         }
     }

public static void main(String args[]){
    //int arr[] = {5,4,1,3,2};
    int arr[] = {1,4,3,2,4,3,7};
    countingSort(arr);
    //Arrays.sort(arr);
    printARR(arr);
 }
}

*/































