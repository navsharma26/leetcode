class Solution {
    List<List<Integer>> result = new ArrayList<>();
    List<Integer>[] graph;
    int[] disc, low;
    int time = 0;

    public List<List<Integer>> criticalConnections(int n, List<List<Integer>> connections) {
        graph = new ArrayList[n];
        for (int i = 0; i < n; i++) graph[i] = new ArrayList<>();

        for (List<Integer> e : connections) {
            graph[e.get(0)].add(e.get(1));
            graph[e.get(1)].add(e.get(0));
        }

        disc = new int[n];
        low = new int[n];
        Arrays.fill(disc, -1);

        dfs(0, -1);
        return result;
    }

    private void dfs(int u, int parent) {
        disc[u] = low[u] = time++;
        for (int v : graph[u]) {
            if (v == parent) continue;
            if (disc[v] == -1) {
                dfs(v, u);
                low[u] = Math.min(low[u], low[v]);
                if (low[v] > disc[u]) {
                    result.add(Arrays.asList(u, v));
                }
            } else {
                low[u] = Math.min(low[u], disc[v]);
            }
        }
    }
}
