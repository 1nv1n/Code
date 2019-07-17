# [1022 Smallest Integer Divisible by K](https://leetcode.com/problems/smallest-integer-divisible-by-k/description/)

## Description

Given a positive integer `K`, you need find the smallest positive integer `N` such that `N` is divisible by `K`, and `N` only contains the digit `1`.

Return the length of `N`. If there is no such `N`, return `-1`.

## Notes

`1 <= K <= 10^5`

## Approach

### Brute-Force

Start with `1`. Check if it is divisible by `K`. If it is, return 1. Else, get the next number that is all 1s & check that - repeat.

## Examples

### Example 1

Input: `1`.

Output: `1`.

Explanation: The smallest answer is `N = 1`, which has length `1`.

### Example 2

Input: `2`.

Output: `-1`.

Explanation: There is no such positive integer `N` divisible by `2`.

### Example 3

Input: `3`.

Output: `3`.

Explanation: The smallest answer is `N = 111`, which has length `3`.

## Analysis

### Computational Complexity

Calculating the next number to check can be thought of as being in constant time.
The number of times we will need to re-calculate the next number to check can be a maximum of 19 times, going with the limitation of the maximum number of digits in a Long that Java can store, `9,223,372,036,854,775,807`.
Overall, the time complexity can be thought of as being `O(1)`.

### Space Complexity

As our solution does not consume memory that scales with the input, this can also be considered to be `O(1)`.

## Solution

 - [Java](Solution.java)
