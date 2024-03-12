class Solution {
    public int orangesRotting(int[][] grid) {
        final int[][] dirs = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
        final int m = grid.length;
        final int n = grid[0].length;
        int ans = 0;
        int countFresh = 0;
        Queue<int[]> q = new LinkedList<>();

        for (int i = 0; i < m; ++i) {
            for (int j = 0; j < n; ++j) {
                if (grid[i][j] == 1) {
                    ++countFresh;
                } else if (grid[i][j] == 2) {
                    q.offer(new int[]{i, j});
                }
            }
        }

        if (countFresh == 0) {
            return 0;
        }

        while (!q.isEmpty()) {
            ++ans;
            int sz = q.size();
            for (int k = 0; k < sz; ++k) {
                int[] curr = q.poll();
                int i = curr[0];
                int j = curr[1];
                for (int[] dir : dirs) {
                    int x = i + dir[0];
                    int y = j + dir[1];
                    if (x < 0 || x == m || y < 0 || y == n) {
                        continue;
                    }
                    if (grid[x][y] != 1) {
                        continue;
                    }
                    grid[x][y] = 2;   // Mark grid[x][y] as rotten.
                    q.offer(new int[]{x, y});  // Push the newly rotten orange to the queue.
                    --countFresh;     // Decrease the count of fresh oranges by 1.
                }
            }
        }

        return countFresh == 0 ? ans - 1 : -1;
    }
}
