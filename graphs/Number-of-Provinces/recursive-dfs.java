class Solution {
    int[] visited;
       List<List<Integer>> adj;
         int matrixSize;
         int count = 0;
    public int findCircleNum(int[][] isConnected) {
        //convert adjacency matrix to adjaceny list
        adj = new ArrayList<>();
         matrixSize = isConnected.length;
          visited = new int[matrixSize];

        for(int i =0;i<matrixSize; i++){
            adj.add(new ArrayList());
            for(int j = 0; j<matrixSize;j++){
                if(i!=j && isConnected[i][j] == 1){
                    adj.get(i).add(j);
                }
            }
            System.out.println(adj);
        }


        //for each node, dfs neighbors
        for(int i = 0; i< adj.size();i++){
           if(visited[i] != 1){
            count+=1;
            dfs(i);
           }
      
        }
       

        return count;
    }

    void dfs( int node){
        visited[node]=1;
        List<Integer> neighbors = adj.get(node);
        for(int i = 0; i < neighbors.size();i ++){
            if(visited[neighbors.get(i)] != 1){
                dfs(neighbors.get(i));
            }
        }
    }
}