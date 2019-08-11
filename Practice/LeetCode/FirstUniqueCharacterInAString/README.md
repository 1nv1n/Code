# [387. First Unique Character in a String](https://leetcode.com/problems/first-unique-character-in-a-string/)

## Description

Given a string, find the first non-repeating character in it and return it's index. If it doesn't exist, return -1.

## Notes

You may assume the string contain only lowercase letters.

## Example

Sample Input: `"leetcode"`.

Sample output: `0`.

Sample Input: `"loveleetcode"`.

Sample output: `2`.

## Approach

Since the total number of unique characters that are possible is limited, we can store each character in a Map, along with the index that it occurs at. If a repeat occurrence is detected, we can store a `-1` as that character's value. After we've iterated through the string; we can determine the smallest value in the Map & return that.

## Analysis

### Computational Complexity

`O(n)` for traversing the input string. We are additionally traversing the map, but the total number of values in the map will always be lesser than or equal to the number of characters in the input string.

### Space Complexity

`O(n)` since our Map scales with the input, which could be all unique characters.

## Solution

 - [Java](Solution.java)
