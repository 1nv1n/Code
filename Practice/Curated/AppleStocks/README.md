# [AppleStocks](https://www.interviewcake.com/question/java/stock-price)

## Description

First, I wanna know how much money I could have made yesterday if I'd been trading Apple stocks all day.

So I grabbed Apple's stock prices from yesterday and put them in an array called stockPrices, where:

The indices are the time (in minutes) past trade opening time, which was `9:30am` local time.
The values are the price (in US dollars) of one share of Apple stock at that time.
So if the stock cost `$500` at `10:30am`, that means `stockPrices[60] = 500`.

Write an efficient method that takes stockPrices and returns the best profit I could have made from one purchase and one sale of one share of Apple stock yesterday.

### Notes

 - No "shorting"—you need to buy before you can sell. Also, you can't buy and sell in the same time step—at least 1 minute has to pass.
 - What if the price stays the same?
 - What if the price goes down all day?
 - This can also be found on [LeetCode](https://leetcode.com/problems/best-time-to-buy-and-sell-stock/).

### Example

Examples, both for the input as well as expected output go into this section.

Sample Input: `int[] stockPrices = new int[] {10, 7, 5, 8, 11, 9};`.

Sample output:
```
getMaxProfit(stockPrices);
// returns 6 (buying for $5 and selling for $11)
```

## Analysis

If we're going to do better than `O(n^2)`, we're probably going to do it in either `O(n log{n})` or `O(n)`. `O(n log{n})` comes up in sorting and searching algorithms where we're recursively cutting the array in half.

It's not obvious that we can save time by cutting the array in half here. Let's first see how well we can do by looping through the array only once.

Since we're trying to loop through the array once, let's use a greedy approach, where we keep a running `getMaxProfit` until we reach the end. We'll start our `maxProfit` at `$0`. As we're iterating, how do we know if we've found a new `maxProfit`?

At each iteration, our `maxProfit` is either:
 - The same as the `maxProfit` at the last time step, or;
 - The max profit we can get by selling at the `currentPrice`.
 - How do we know when we have case (2)?

The max profit we can get by selling at the `currentPrice` is simply the difference between the `currentPrice` and the `minPrice` from earlier in the day. If this difference is greater than the current `maxProfit`, we have a new `maxProfit`.

So for every price, we’ll need to:
 - Keep track of the lowest price we’ve seen so far
 - See if we can get a better profit

## Solution

 - [Java](Solution.java)
