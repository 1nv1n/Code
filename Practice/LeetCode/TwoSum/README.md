# [Two Sum](https://leetcode.com/problems/two-sum/)

## Description

Given an array of integers, return *indices* of the two numbers such that they add up to a specific target.

You may assume that each input would have _exactly_ one solution, and you may not use the same element twice.

### Notes

#### Brute Force Approach

Match every element in the array with every other element & if they add up to the target, return the pair.

#### Better Approach:

Initialize a placeholder map that will store the number & the index for that number. Loop through the array. For every element, determine its complement. Check if the map contains the complement & that the complement is not at the same index. If it does, return the pair. If it does not, add the complement & the index to the map.

### Example

Input: `nums = [2, 7, 11, 15], target = 9`
Output: `[0, 1]`

## Analysis

#### Computational Complexity

We scan every number in the array in a loop & for every iteration, we perform a lookup on the map as well as an insert into the map (both of which can be considered as constant-time operations), so the time complexity of the solution would scale with the number of input numbers & can be considered to be `O(n)`.

#### Space Complexity

The only extra memory that is utilized is the map, which will scale linearly with the input, so the space complexity can be considered to be `O(n)`.

## Solution

 - [Java](Solution.java)
