class Solution {
    private boolean[] visited;

    private void DFS(int idx, int size, int[][] stones){
        visited[idx] = true;
        for(int i = 0; i < size; ++i){
            if(visited[i]) continue;
            if(stones[idx][0] == stones[i][0] || stones[idx][1] == stones[i][1]) DFS(i, size, stones);
        }
        return;
    }
    public int removeStones(int[][] stones) {
        int size = stones.length, count = 0;
        visited = new boolean[size];
        Arrays.fill(visited, false);
        for(int i = 0; i < size; ++i){
            if(visited[i]) continue;
            count++;
            DFS(i, size, stones);
        }
        return size - count;    
    }
}