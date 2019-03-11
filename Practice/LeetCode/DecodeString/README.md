# [Decode String](https://leetcode.com/problems/decode-string/description/)

## Description

Given an encoded string, return it's decoded string.

The encoding rule is: `k[encoded_string]`, where the encoded_string inside the square brackets is being repeated exactly k times. Note that k is guaranteed to be a positive integer.

You may assume that the input string is always valid; No extra white spaces, square brackets are well-formed, etc.

Furthermore, you may assume that the original data does not contain any digits and that digits are only for those repeat numbers, `k`. For example, there won't be input like `3a` or `2[4]`.

## Examples
```
s = "3[a]2[bc]", return "aaabcbc".
s = "3[a2[c]]", return "accaccacc".
s = "2[abc]3[cd]ef", return "abcabccdcdcdef".
```

## Analysis

Loop over every charcater in the input. If a non-digit, non-bracket character is encountered; append it to the current string. If a digit is enountered, it should be kept in a stack of numbers. Each number in this stack represents the number of times the corresponding string needs to be repeated. If an opening bracket is encountered, the current string should be pushed up into the string stack. If a closing bracket is encountered, an intermediate string should be created with the last string from the stack - with the current string - the number of times from the last number stack.

Time Complexity: `O(n)` where `n` is the total number of characters in the final output/decoded string.

Space Complexity: `O(n)` where `n` is the total number of characters in the final output/decoded string.

## Solution

 - [Java](Solution.java)
