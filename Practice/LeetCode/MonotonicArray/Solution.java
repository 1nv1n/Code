class Solution {
    public boolean isMonotonic(int[] A) {
      
      // Was the last match in the array ascending
      boolean wasLastMatchAsc = false;
      
      // Was the last match in the array descending
      boolean wasLastMatchDesc = false;
      
      // Was the last match in the array equal?
      boolean wasLastMatchEqual = false;
      
      // Are all the elements in the array the same
      boolean areAllMatchesEqual = true;
      
      // Array index
      int arrIdx = 1;
        
      // Base case for non-monotonocity
      if(null == A || A.length == 0) {
        return false;
      }
      
      // Base case for monotonocity
      if(A.length == 1) {
        return true;
      }
      
      // Check whether all the elements are equal
      for(arrIdx = 1; arrIdx < A.length; arrIdx++) {
        if(A[arrIdx] != A[0]) {
          areAllMatchesEqual = false;
          break;
        }
      }
      
      // Array is monotonic if all the elements are equal
      if(areAllMatchesEqual) {
        return true;
      }
      
      // Reset Array Index
      arrIdx = 1;
      
      // Check if the first two elements form a descending or an ascending order
      if(A[0] > A[arrIdx]) {
        wasLastMatchDesc = true;
      } else if(A[0] < A[arrIdx]) {
        wasLastMatchAsc = true;
      } else {
        wasLastMatchEqual = true;
      }
      
      // Increment array index & loop through it.
      arrIdx++;
      while(arrIdx < A.length) {
        // If the last match was equal, just increment the index & continue to check the enxt two.
        if(wasLastMatchEqual) {
          // If it was ascending before it was equal
          if(wasLastMatchAsc) {
            if(A[arrIdx-1] < A[arrIdx]) {
              wasLastMatchAsc = true;
            } else if(A[arrIdx-1] > A[arrIdx]) {
              return false;
            } else {
              wasLastMatchEqual = true;
            }
          }
          
          // If it was descending before it was equal
          if(wasLastMatchDesc) {
            if(A[arrIdx-1] > A[arrIdx]) {
              wasLastMatchDesc = true;
            } else if(A[arrIdx-1] < A[arrIdx]) {
              return false;
            } else {
              wasLastMatchEqual = true;
            }
          }
          
          if(A[arrIdx-1] < A[arrIdx]) {
            wasLastMatchAsc = true;
          } else if(A[arrIdx-1] > A[arrIdx]) {
            wasLastMatchDesc = true;
          } else {
            wasLastMatchEqual = true;
          }
          
          arrIdx++;
          continue;
        }
        
        // If the last match was ascending, check if it is still ascending
        // Return false if it is not
        // If equal, set the flag & continue onto the next pair.
        if(wasLastMatchAsc) {
          if(A[arrIdx-1] < A[arrIdx]) {
            wasLastMatchAsc = true;
          } else if(A[arrIdx-1] > A[arrIdx]) {
            return false;
          } else {
            wasLastMatchEqual = true;
          }
          
          arrIdx++;
          continue;
        }
        
        
        // If the last match was descending, check if it is still descending
        // Return false if it is not.
        // If equal, set the flag & continue onto the next pair.
        if(wasLastMatchDesc) {
          if(A[arrIdx-1] > A[arrIdx]) {
            wasLastMatchDesc = true;
          } else if(A[arrIdx-1] < A[arrIdx]) {
            return false;
          } else {
            wasLastMatchEqual = true;
          }
          
          arrIdx++;
          continue;
        }
      }
      
      return true;
    }
}
