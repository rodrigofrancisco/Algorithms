import java.util.Arrays;

class Solution {
  /*
   * Cases:
   *  1) All negative -> 1
   *  2) Normal case -> min number
   */
  int solution(int A[]) {

    // Sorting for getting max element
    Arrays.sort(A);
    int maxElement = A[A.length -1];

    if( maxElement <= 0 ) return 1; // All negative
    int cellElements[] = new int[maxElement];

    for( int i = 0; i< cellElements.length; i++ ) {
      cellElements[i] = -1;
    }

    for( int i = 0; i< A.length; i++ ) {
      if( A[i] > 0 ) {
        int pos = A[i] - 1;
        cellElements[pos] = A[i];
      } 
    }

    for( int i = 0; i< cellElements.length; i++ ) {
      if( cellElements[i] == -1 ) return i + 1;
    }

    return 1; // All negative

  }

  public static void main(String args[]) {
    Solution s = new Solution();
    int testA[] = {-3,-2};
    System.out.println("Result testA " + s.solution(testA));
    int testB[] = {-3, 5, 4, 3, 1, 6};
    System.out.println("Result testB " + s.solution(testB));
    int testC[] = { 2, 3, -7, 6, 8, 1, -10, 15 };
    System.out.println("Result testC " + s.solution(testC));
  }
}
