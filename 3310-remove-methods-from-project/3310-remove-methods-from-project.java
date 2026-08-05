class Solution {
    public List<Integer> remainingMethods(int n, int k, int[][] invocations) {
        
        List<Integer> graph[] = new ArrayList[n];
        int numberOfEdges = invocations.length;
        int suspicious[] = new int[n];
        List<Integer> ans = new ArrayList<Integer>();
        boolean flag = true;

        for(int i=0 ; i<n ;i++){
            graph[i] = new ArrayList<Integer>();
        }

        for(int i=0 ; i<numberOfEdges ; i++){
            graph[invocations[i][0]].add(invocations[i][1]);
        }

        DFS(k,n,graph,suspicious);

        for(int i=0 ; i<numberOfEdges ; i++){
            if(suspicious[invocations[i][0]]==0 && suspicious[invocations[i][1]] == 1){
                flag = false;
                break;
            }
        }

        if(flag == false){
            for(int i=0 ; i<n ; i++){
                ans.add(i);
            }
        }

        else{
            for(int i=0 ; i<n ; i++){
                if(suspicious[i] == 0){
                    ans.add(i);
                }
            }
        }

        return ans;

    }

    public void DFS(int k ,int n ,List<Integer>[] graph , int[] suspicious){
        
        suspicious[k] = 1;

        for(int i=0 ; i<graph[k].size() ; i++){
            if(suspicious[graph[k].get(i)] == 0){
                DFS(graph[k].get(i),n,graph,suspicious);
            }
        }
    }
}