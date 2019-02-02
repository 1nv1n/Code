# [Jump Game](https://leetcode.com/problems/jump-game/)

## Problem Description
Given an array of non-negative integers, you are initially positioned at the first index of the array.

Each element in the array represents your maximum jump length at that position.

Determine if you are able to reach the last index.

## Example(s)
Example 1:
```
Input: [2,3,1,1,4]
Output: true
Explanation: Jump 1 step from index 0 to 1, then 3 steps to the last index.
```

Example 2:
```
Input: [3,2,1,0,4]
Output: false
Explanation: You will always arrive at index 3 no matter what. Its maximum jump length is 0, which makes it impossible to reach the last index.
```

## Solution Explanation
A simple approach would be to start from the second-to-the-last element of the input array; call it our current index.
If the value at this index is such that we can reach (or over-reach) the last index of the array, we can add this index to a list; say the `jumpList`.
Now that we have an index that can sucessfully reach the target index with, we set the current index as the target index & decrement the current index to repeat the process for the (new) current index.
If we cannot reach the target index, we just decerement the current index & leave the target index set to what it is.
At the end of the run, if our `jumpList` contains the 0th index; we can assert that there is a path from the start of the array (0th index to the end index (initial target index))

## Additional Notes/Links
A similar question is on CSDoJo; the differentiating factor being that the CSDoJo one returns success if it's possible to leave the array (i.e. go to any index greater than the last index of the array) & not just to the last index exactly (https://www.youtube.com/watch?v=kHWy5nEfRIQ).

#### Complexity Analysis

Time complexity: We are going over each element in the array, so the time it takes for us to solve this problem will scale linearly with the input, so the time complexity can be thought of as being O(n) where `n` is the length of the input array.

Space complexity: We're using 2 placeholders, but regardless of the input; we will always use only the two placeholders. So the space complexity can be thought of as being O(1) as we will need a constant amount of space regardless of the input. The additional ArrayList containing the jump-list-order in reverse is not strictly necessary & can be removed to save space; & another single placeholder could be used in it's place instead.
