# [Valid Parentheses](https://leetcode.com/problems/valid-parentheses/)

## Description

Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

 - Open brackets must be closed by the same type of brackets.
 - Open brackets must be closed in the correct order.


## Example

Input: `"()"`
Output: `true`

Input: `"()[]{}"`
Output: `true`

Input: `"(]"`
Output: `false`

Input: `"([)}"`
Output: `false`

Input: `"{[]}"`
Output: `true`

## Analysis

The key here is to use a Stack. One can keep a count of the number of each type of bracket, but ultimately, it is the order of the brackets that is the issue to be validated.
After each entry of a type of bracket into the stack (starting with the opening bracket of any type), the only valid next entry is an opening bracket of any type.
If we encounter a bracket of the same type & it is a closing bracket; then we pop the top of the stack & move to the next.
If we encounter a closing bracket of another type (as compared to what the current top of the stack is); then we know that the provided expression is an invalid expression.

### Time Complexity

We are iterating over each character of the String, so the time complexity of this solution will be `O(n)` where `n` is the number of characters in the given String.

### Space Complexity

A Stack of characters is created, so the space complexity will be `O(n)` where `n` is the number of characters in the given String.

## Notes

Note that an empty string is also considered valid.

## Solution
 - [Java](Solution.java)
