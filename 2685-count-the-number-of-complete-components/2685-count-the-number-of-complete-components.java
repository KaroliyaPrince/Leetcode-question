class Solution {
    public int countCompleteComponents(int n, int[][] edges) {

        int adjs[][] = new int[n][n];
        List<Integer> path = new ArrayList<Integer>();
        boolean visited[] = new boolean[n];

        for (int i = 0; i < edges.length; i++) {
            adjs[edges[i][0]][edges[i][1]] = 1;
            adjs[edges[i][1]][edges[i][0]] = 1;
        }

        for (int i = 0; i < n; i++) {
            adjs[i][i] = 1;
            visited[i] = false;
        }

        int vertex = 0;
        int count = 0;

        while (vertex != -1) {
            DFS(vertex, adjs, n, visited, path);
            count = count + checkComponent(edges, path);
            vertex = remainingVisited(visited, n);
        }

        return count;
    }

    void DFS(int vertex, int adjs[][], int n, boolean visited[], List<Integer> path) {

        visited[vertex] = true;
        path.add(vertex);

        for (int i = 0; i < n; i++) {

            if (adjs[vertex][i] != 0 && !visited[i]) {
                DFS(i, adjs, n, visited, path);
            }
        }

    }

    int remainingVisited(boolean visited[], int n) {
        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                return i;
            }
        }

        return -1;
    }

    int checkComponent(int[][] edges, List<Integer> path) {

        int u, v, numberOfEdges = 0, m = path.size();

        for (int i = 0; i < edges.length; i++) {
            u = edges[i][0];
            v = edges[i][1];

            if (path.contains(u) && path.contains(v)) {
                numberOfEdges++;
            }
        }

        path.clear();

        if (numberOfEdges == m * (m - 1) / 2) {
            return 1;
        }

        return 0;
    }
}