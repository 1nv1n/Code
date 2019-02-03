# [Decode String](https://leetcode.com/problems/decode-string/description/)

## Description

Given an encoded string, return it's decoded string.

The encoding rule is: k[encoded_string], where the encoded_string inside the square brackets is being repeated exactly k times. Note that k is guaranteed to be a positive integer.

You may assume that the input string is always valid; No extra white spaces, square brackets are well-formed, etc.

Furthermore, you may assume that the original data does not contain any digits and that digits are only for those repeat numbers, k. For example, there won't be input like 3a or 2[4].

## Examples
```
s = "3[a]2[bc]", return "aaabcbc".
s = "3[a2[c]]", return "accaccacc".
s = "2[abc]3[cd]ef", return "abcabccdcdcdef".
```

## Analysis
After base case checks (null & String length greater than 3 - to form at least one complete encoding), we can start setting the inputs & any sub-inputs into a stack as a stack would work great for this use-case where we need to perform operations from the outer specifications to the inner specifications.
We can create a stack that stores a custom data structure. This data structure will hold the number of times we need to repeat the string as well as the same data structure. Then we recurse to form the decoded String.
