// you can also use imports, for example:
// import java.util.*;
import java.util.Arrays;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        Arrays.sort(A);
        int max = A[A.length-1];
        if( max < 0 ) return 1;

        int zeros[] = new int[max];

        for( int i = 0; i< A.length; i++ ) {
          zeros[i] = 0;
        }

        for( int i = 0; i< A.length; i++ ) {
          if( A[i] > 0 ) {
            int pos = A[i] - 1;
            zeros[pos] = A[i];
          }
        }

        for( int i = 0; i< A.length; i++ ) {
          if( zeros[i] == 0 ) {
            System.out.println("Entre");
            return i + 1;
          }
        }

        return 1;
    }

    public static void main(String args[]) {
      Solution s = new Solution();
      int arr[] = {-1,-3};
      int arr2[] = {1,1,4,6,3, 2};
      System.out.println("Sol: " + s.solution(arr));
      System.out.println("Sol: " + s.solution(arr2));
    }
}

