# [Generate Random Point in a Circle](https://leetcode.com/problems/generate-random-point-in-a-circle/)

## Description

Given the radius and `x`-`y` positions of the center of a circle, write a function `randPoint` which generates a uniform random point in the circle.

The input is two lists: the subroutines called and their arguments. Solution's constructor has three arguments, the radius, x-position of the center, and y-position of the center of the circle. `randPoint` has no arguments. Arguments are always wrapped with a list, even if there aren't any.

## Example

Sample Input: `["Solution","randPoint","randPoint","randPoint"]
[[1,0,0],[],[],[]]`
Sample output: `[null,[-0.72939,-0.65505],[-0.78502,-0.28626],[-0.83119,-0.19803]]`

Sample Input: `["Solution","randPoint","randPoint","randPoint"]
[[10,5,-7.5],[],[],[]]`
Sample output: `[null,[11.52438,-8.33273],[2.46992,-16.21705],[11.13430,-12.42337]]`

## Analysis


## Notes

 - Input and output values are in floating-point.
 - Radius and x-y position of the center of the circle is passed into the class constructor.
 - A point on the circumference of the circle is considered to be in the circle.
 - `randPoint` returns a size 2 array containing x-position and y-position of the random point, in that order.


## Solution
 - [C](Solution.c)
 - [C++](Solution.cpp)
 - [Java](Solution.java)
 - [JavaScript](Solution.js)
 - [Python](Solution.py)
 - [Ruby](Solution.rb)
 - [TypeScript](Solution.ts)
