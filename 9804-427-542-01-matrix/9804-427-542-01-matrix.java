class Solution {
    public int[][] updateMatrix(int[][] mat) {
        // set
        int rows = mat.length;
        int cols = mat[0].length;
        int[][] dist = new int[rows][cols];
        Queue<int[]> que = new ArrayDeque<>();
        for (int[] row : dist) {
             Arrays.fill(row, Integer.MAX_VALUE);
        }

        // range

        // 0초기화 및 큐에 넣기

        for(int i = 0 ; i < rows ; i ++) {
            for(int j = 0 ; j < cols ; j ++ ) {
                if(mat[i][j] == 0) { 
                    dist[i][j] = 0;
                    que.offer(new int[]{i, j});
                }
            }
            
        }
        int[][] dir = {
            {0, 1},   // Right
            {1, 0},   // Down
            {0, -1},  // Left
            {-1, 0}   // Up
        };

        // 상하좌우 확인해서 유효하면 업데이트
        while(!que.isEmpty()) {
            int[] cur = que.poll();
            int r = cur[0], c = cur[1];
            // 
            
            for(int i = 0 ; i < 4 ; i ++ ) {
                int nr = r + dir[i][0];
                int nc = c + dir[i][1];
                // 인접한 노드의 현재의 거리와 이전 거리 +1 거리 비교
                if(nr >= 0 && nc >= 0 && nr < mat.length  && nc < mat[0].length ) {
                    if(dist[nr][nc] > dist[r][c] + 1) {
                        dist[nr][nc] = dist[r][c] + 1;
                        que.offer(new int[]{nr, nc});
                    }
                }
                
            }
            
        }
        return dist;
        
    }
}