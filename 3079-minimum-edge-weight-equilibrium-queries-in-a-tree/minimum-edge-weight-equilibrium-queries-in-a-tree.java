import java.util.*;

class Solution {

    List<int[]>[] graph;
    int[][] parent;
    int[][] count;
    int[] depth;
    int LOG = 17; // since n <= 10^5

    public int[] minOperationsQueries(int n, int[][] edges, int[][] queries) {

        graph = new ArrayList[n];
        for (int i = 0; i < n; i++)
            graph[i] = new ArrayList<>();

        for (int[] e : edges) {
            graph[e[0]].add(new int[]{e[1], e[2]});
            graph[e[1]].add(new int[]{e[0], e[2]});
        }

        parent = new int[n][LOG];
        count = new int[n][27]; // weights 1 to 26
        depth = new int[n];

        dfs(0, -1);

        // Binary lifting preprocessing
        for (int j = 1; j < LOG; j++) {
            for (int i = 0; i < n; i++) {
                if (parent[i][j - 1] != -1)
                    parent[i][j] = parent[parent[i][j - 1]][j - 1];
                else
                    parent[i][j] = -1;
            }
        }

        int[] ans = new int[queries.length];

        for (int i = 0; i < queries.length; i++) {
            int a = queries[i][0];
            int b = queries[i][1];
            int lca = getLCA(a, b);

            int totalEdges = depth[a] + depth[b] - 2 * depth[lca];
            int maxFreq = 0;

            for (int w = 1; w <= 26; w++) {
                int freq = count[a][w] + count[b][w] - 2 * count[lca][w];
                maxFreq = Math.max(maxFreq, freq);
            }

            ans[i] = totalEdges - maxFreq;
        }

        return ans;
    }

    private void dfs(int node, int par) {
        parent[node][0] = par;

        for (int[] nei : graph[node]) {
            int next = nei[0];
            int weight = nei[1];

            if (next == par) continue;

            depth[next] = depth[node] + 1;

            for (int w = 1; w <= 26; w++)
                count[next][w] = count[node][w];

            count[next][weight]++;

            dfs(next, node);
        }
    }

    private int getLCA(int a, int b) {

        if (depth[a] < depth[b]) {
            int temp = a;
            a = b;
            b = temp;
        }

        for (int i = LOG - 1; i >= 0; i--) {
            if (parent[a][i] != -1 &&
                depth[a] - (1 << i) >= depth[b]) {
                a = parent[a][i];
            }
        }

        if (a == b) return a;

        for (int i = LOG - 1; i >= 0; i--) {
            if (parent[a][i] != parent[b][i]) {
                a = parent[a][i];
                b = parent[b][i];
            }
        }

        return parent[a][0];
    }
}

