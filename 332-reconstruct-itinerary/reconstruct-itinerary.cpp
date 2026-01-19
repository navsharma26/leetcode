class Solution {
public:
    unordered_map<string, priority_queue<string, vector<string>, greater<string>>> graph;
    vector<string> ans;

    void dfs(string u) {
        auto &pq = graph[u];
        while (!pq.empty()) {
            string v = pq.top();
            pq.pop();
            dfs(v);
        }
        ans.push_back(u);
    }

    vector<string> findItinerary(vector<vector<string>>& tickets) {
        for (auto &t : tickets) {
            graph[t[0]].push(t[1]);
        }
        dfs("JFK");
        reverse(ans.begin(), ans.end());
        return ans;
    }
};
