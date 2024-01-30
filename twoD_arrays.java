import java.util.*;

// spiral matrix : --> important in interviews

/*

public class twoD_arrays {

public static void printSpiral(int martix[][]){
    int startrow = 0;
    int startcol = 0;
    int endrow = martix.length-1;
    int endcol = martix[0].length -1;

    while(startrow<=endrow && startcol<=endcol){
      
    // top boundary:
      for(int j = startcol; j<=endcol; j++){
        System.out.print(martix[startrow][j] + " ");
      }

      // right
      for(int i = startrow+1; i<=endrow; i++){
        System.out.print(martix[i][endcol] +" ");
      }

      // bottom
      for(int j = endcol-1; j>=startcol; j--){
        if(startrow == endrow){
            break;
        }
        System.out.print(martix[endrow][j] + " ");
      }

      //left
      for( int i = endrow-1; i>=startrow+1;i--){
        if(startcol == endcol){
            break;
        }
        System.out.print(martix[i][startcol]+ " ");
      }
      startcol++;
      startrow++;
      endcol--;
      endrow--;
  }
  System.out.println();
}
public static void main(String[] args){
   int martix[] []= {{1,2,3,4},
                   {5,6,7,8},
                   {9,10,11,12},
                   {13,14,15,16}};
    printSpiral(martix);
 }
}

*/

// printing diagonal sum :

/*

public class twoD_arrays {

public static int diagonalSum(int martix[][]){
  int sum = 0;

// brute force method:

//   for(int i=0; i<martix.length;i++){
//     for(int j=0; j<martix[0].length;j++) {
//         if(i==j){
//           sum += martix[i][j];
//    }
//       else if (i+j == martix.length-1){
//         sum += martix[i][j];
//     }
//   }
//  }


// optimized code :

   for(int i = 0; i<martix.length; i++){
    // pd
    sum += martix[i][i];
    //sd
    if(i != martix.length-1-i)
    sum += martix[i][martix.length-i-1];
   }
 return sum ;
}

public static void main(String[] args){
   int martix[] []= {{1,2,3,4},
                    {5,6,7,8},
                    {9,10,11,12},
                    {13,14,15,16}};
    System.out.println(diagonalSum(martix));
 }
}

*/

// search in sorted array : 

/*

public class twoD_arrays {
  public static boolean staircasesearch(int matrix[][], int key) {
    int row = 0, col = matrix[0].length - 1;

    while(row < matrix.length && col >=0){
      if(matrix[row][col] == key){
        System.out.println("found key at (" + row + "," + col +")");
        return true;
      }
      else if(key<matrix[row][col]){
        col--;
      }
       else {
        row++;
       }
    }
    System.out.println("key doesn't exist !");
    return false;
  }

  public static void main(String[] args) {
    int martix[][] = { { 10, 20, 30, 40 },
                       { 15,25, 30, 40 },
                       { 27, 29, 37, 45 },
                       { 32, 33, 39, 50 } };
    int key = 33;
    staircasesearch(martix, key);
  }
}

*/

