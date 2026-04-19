class Solution {
    public int numIslands(char[][] grid) {
        int m = grid.length, n = grid[0].length, res = 0;
        
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == '0') continue;
                res++;
                Queue<List<Integer>> qu = new LinkedList<>();
                qu.add(List.of(i,j));
                while (qu.size() > 0) {
                    List<Integer> curr = qu.poll();
                    int a = curr.get(0), b = curr.get(1);
                    grid[a][b] = '0';
                    if (a-1 >= 0 && grid[a-1][b] == '1') {
                        qu.add(List.of(a-1,b));
                    }
                    if (a+1 < m && grid[a+1][b] == '1') {
                        qu.add(List.of(a+1,b));
                    }
                    if (b-1 >= 0 && grid[a][b-1] == '1') {
                        qu.add(List.of(a,b-1));
                    }
                    if (b+1 < n && grid[a][b+1] == '1') {
                        qu.add(List.of(a,b+1));
                    }
                }
            }
        }
        return res;
    }
}
