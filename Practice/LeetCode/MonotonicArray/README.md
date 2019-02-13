# [Monotonic Array](https://leetcode.com/problems/monotonic-array/description/)

## Description

An array is monotonic if it is either monotone increasing or monotone decreasing.

An array A is monotone increasing if for all i <= j, A[i] <= A[j].  An array A is monotone decreasing if for all i <= j, A[i] >= A[j].

Return true if and only if the given array A is monotonic.

## Example
```
Input: [1,2,2,3]
Output: true
```

## Example 2:
```
Input: [6,5,4,4]
Output: true
```

## Example 3:
```
Input: [1,3,2]
Output: false
```

## Example 4:
```
Input: [1,2,4,5]
Output: true
```

## Example 5:
```
Input: [1,1,1]
Output: true
```

## Analysis
### Approach #1 (Two Pass) [Accepted]

#### Intuition

An array is monotonic if it is monotone increasing, or monotone decreasing. Since a <= b and b <= c implies a <= c, we only need to check adjacent elements to determine if the array is monotone increasing (or decreasing, respectively). We can check each of these properties in one pass.

#### Algorithm

To check whether an array A is monotone increasing, we'll check A[i] <= A[i+1] for all i. The check for monotone decreasing is similar.

```
class Solution {
    public boolean isMonotonic(int[] A) {
        return increasing(A) || decreasing(A);
    }

    public boolean increasing(int[] A) {
        for (int i = 0; i < A.length - 1; ++i)
            if (A[i] > A[i+1]) return false;
        return true;
    }

    public boolean decreasing(int[] A) {
        for (int i = 0; i < A.length - 1; ++i)
            if (A[i] < A[i+1]) return false;
        return true;
    }
}
```

#### Complexity Analysis:

Time complexity : O(n) where N is the length of A.

Space complexity : O(1)

### Approach #2 (One Pass) [Accepted]

#### Intuition

To perform this check in one pass, we want to handle a stream of comparisons from \{-1, 0, 1\}{−1,0,1}, corresponding to <, ==, or >. For example, with the array [1, 2, 2, 3, 0], we will see the stream (-1, 0, -1, 1).

#### Algorithm

Keep track of store, equal to the first non-zero comparison seen (if it exists.) If we see the opposite comparison, the answer is False.

Otherwise, every comparison was (necessarily) in the set \{-1, 0\}{−1,0}, or every comparison was in the set \{0, 1\}{0,1}, and therefore the array is monotonic

```
class Solution {
    public boolean isMonotonic(int[] A) {
        int store = 0;
        for (int i = 0; i < A.length - 1; ++i) {
            int c = Integer.compare(A[i], A[i+1]);
            if (c != 0) {
                if (c != store && store != 0)
                    return false;
                store = c;
            }
        }

        return true;
    }
}
```

#### Complexity Analysis:

Time complexity : O(n) where N is the length of A.

Space complexity : O(1)

## Solution
 - [Java](Solution.java)