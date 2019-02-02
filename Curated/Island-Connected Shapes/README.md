# [Island/Connected Shapes](https://www.geeksforgeeks.org/find-number-of-islands/)

## Problem Description
Given a boolean 2D matrix, find the number of islands. A group of connected 1s forms an island. For example, the below matrix contains 5 islands
This is a variation of the standard problem: “Counting the number of connected components in an undirected graph”.

## Example(s)
```
Input : mat[][] = { {1, 1, 0, 0, 0},
                    {0, 1, 0, 0, 1},
                    {1, 0, 0, 1, 1},
                    {0, 0, 0, 0, 0},
                    {1, 0, 1, 0, 1} }
Output : 5
```
A connected component of an undirected graph is a subgraph in which every two vertices are connected to each other by a path(s), and which is connected to no other vertices outside the subgraph.

## Solution Explanation
A group of connected 1s forms an island. A graph where all vertices are connected with each other has exactly one connected component, consisting of the whole graph. Such graph with only one connected component is called as Strongly Connected Graph.

The problem can be easily solved by applying DFS() on each component. In each DFS() call, a component or a sub-graph is visited. We will call DFS on the next un-visited component. The number of calls to DFS() gives the number of connected components. BFS can also be used.


## Additional Notes/Links
A cell in 2D matrix can be connected to 8 neighbours. So, unlike standard DFS(), where we recursively call for all adjacent vertices, here we can recursively call for 8 neighbours only. We keep track of the visited 1s so that they are not visited again.

#### Complexity Analysis

Time complexity: O(ROW x COL)

Space complexity: O(n)
