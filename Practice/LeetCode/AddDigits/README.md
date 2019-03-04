# [Add Digits](https://leetcode.com/problems/add-digits/)

## Description

Given a non-negative integer `num`, repeatedly add all its digits until the result has only one digit.

## Example

Input: `38`
Output: `2`

Explanation:
The process is like: 3 + 8 = 11, 1 + 1 = 2.
Since 2 has only one digit, return it.

## Analysis

An approach to this would be to convert the given number into a String such that we could easily loop over the characters in the String to identify the individual digits. Once we've summed up the digits, repeat the process if the sum is greater than 10; else return the sum.

Time Complexity: `O(n+1)`, where `n` is the number of digits in `num`.
Space Complexity: `O(1)` as the amount of space does not increase compared to an increase in `num` (relatively).

A constant time approach would be to check the modulo result of the number with 9. If it's 0, return 9; else return the modulo result.
Time & Space Complexity: `O(1)`

## Follow up:
Could you do it without any loop/recursion in `O(1)` runtime?

## Solution
 - [Java](Solution.java)