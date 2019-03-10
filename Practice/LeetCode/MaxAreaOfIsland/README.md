# [Max Area of Island](https://leetcode.com/problems/max-area-of-island/description/)

## Description

Given a non-empty 2D array grid of 0's and 1's, an island is a group of 1's (representing land) connected 4-directionally (horizontal or vertical). You may assume all four edges of the grid are surrounded by water.

Find the maximum area of an island in the given 2D array. (If there is no island, the maximum area is 0).

### Notes

The length of each dimension in the given grid does not exceed 50.

### Example

Example 1:

`[[0,0,1,0,0,0,0,1,0,0,0,0,0],
  [0,0,0,0,0,0,0,1,1,1,0,0,0],
  [0,1,1,0,1,0,0,0,0,0,0,0,0],
  [0,1,0,0,1,1,0,0,1,0,1,0,0],
  [0,1,0,0,1,1,0,0,1,1,1,0,0],
  [0,0,0,0,0,0,0,0,0,0,1,0,0],
  [0,0,0,0,0,0,0,1,1,1,0,0,0],
  [0,0,0,0,0,0,0,1,1,0,0,0,0]]`

Given the above grid, return 6. Note the answer is not 11, because the island must be connected 4-directionally.

Example 2:

`[[0,0,0,0,0,0,0,0]]`

Given the above grid, return 0.

## Analysis

Once we find a "piece" of an island (look at each cell, using a double-nested `for` loop), a DFS approach can be used to recursively find any connected land pieces.

Time Complexity: `r*c` for the main loop & a worst case `(r*c)-1` for DFS which should give us a worst-case complexity of `O(r^2*c^2)`.

Space Complexity: `O(1)` for memory as our storage does not grow with the input & `O(r*c)` stack-space complexity for the recursive method calls.

Where `r` is the number of rows in the grid & `c` is the number of columns.

Submission Stats:

Runtime: 14 ms, faster than 98.31% of Java online submissions for Max Area of Island.

Memory Usage: 46.4 MB, less than 11.90% of Java online submissions for Max Area of Island.

## Solution

This section links to the Solution.

 - [Java](Solution.java)