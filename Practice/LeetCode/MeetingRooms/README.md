# [Meeting Rooms](https://leetcode.com/problems/meeting-rooms)

## Description

Given an array of meeting time intervals consisting of start & end times `[[s1,e1],[s2,e2],...]` (`si <ei`), determine if a person could attend all meetings.

## Example

Input: `[[0,30],[5,10],[15,20]]`
Output: `false`

Input: `[[7,10],[2,4]]`
Output: `true`

## Analysis

The key is to ensure that each meeting's start time (each meeting after the first one that is) is never lesser than the end time of the meeting before it.

### Time Complexity

Two for loops, one till n & another till n-1
And O(nlogn) for Arrays.sort

O(n + nlogn + (n-1) -> O(n)

### Space Complexity

Two more arrays initialized + Arrays.sort's space.

O(2n + 1~n + 1~n) -> O(n)

## Notes
N/A

## Solution
 - [Java](Solution.java)
