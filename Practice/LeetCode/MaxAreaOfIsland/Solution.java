/**
 * Solution Implementor.
 */
class CodeGoesHere {
  public int maxAreaOfIsland(int[][] grid) {
    int max = 0;

    // Base case, input validity
    if(grid == null || grid.length <= 0 || grid[0].length <= 0) {
      return max;
    }

    // Traverse the ocean, once cell at a time
    for(int rIdx = 0; rIdx < grid.length; rIdx++) {
      for(int cIdx = 0; cIdx < grid[rIdx].length; cIdx++) {
        // If land was found, traverse cells adjacent to land to determine land's extent
        if(grid[rIdx][cIdx] == 1) {
          // Ensure max is the maximum of previous & current
          max = Math.max(max, islandDFS(grid, rIdx, cIdx));
        }
      }
    }

    return max;
  }

  /**
   * Traverses all cells adjacent to the provided cell (grid[rIdx][cIdx]).
   * Marks adjacent cell(s) as "0" (not land).
   * Recursively counts each land cell ("1") encountered from origin.
  */
  private int islandDFS(int[][] grid, int rIdx, int cIdx) {
    // Initial count
    int count = 0;

    // Base case, return if current cell's co-ordinates are invalid or oceanic.
    if(rIdx < 0 || rIdx >= grid.length || cIdx < 0 || cIdx >= grid[rIdx].length || grid[rIdx][cIdx] == 0) {
      return count;
    }

    // At this point, the cell should be "1", so mark it as "0" to avoid double-counting.
    grid[rIdx][cIdx] = 0;
    count++;

    // Traverse vertically & horizontally to get the connected land count.
    count += islandDFS(grid, rIdx+1, cIdx);
    count += islandDFS(grid, rIdx-1, cIdx);
    count += islandDFS(grid, rIdx, cIdx+1);
    count += islandDFS(grid, rIdx, cIdx-1);

    return count;
  }
}

/**
 * Driver.
 */
public class Solution {
  /**
   * Entry point.
   * @param args {@link String} argument array from the standard input.
   */
  public static void main(String[] args) {
    CodeGoesHere cGH = new CodeGoesHere();
    int[][] grid = new int[][]{
      {0,0,1,0,0,0,0,1,0,0,0,0,0},
      {0,0,0,0,0,0,0,1,1,1,0,0,0},
      {0,1,1,0,1,0,0,0,0,0,0,0,0},
      {0,1,0,0,1,1,0,0,1,0,1,0,0},
      {0,1,0,0,1,1,0,0,1,1,1,0,0},
      {0,0,0,0,0,0,0,0,0,0,1,0,0},
      {0,0,0,0,0,0,0,1,1,1,0,0,0},
      {0,0,0,0,0,0,0,1,1,0,0,0,0},
    };
    System.out.println(cGH.maxAreaOfIsland(grid));
  }
}
