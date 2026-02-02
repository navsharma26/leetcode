#include <bits/stdc++.h>
using namespace std;

class Solution {
public:
    bool canCross(vector<int>& stones) {
        unordered_map<int, unordered_set<int>> mp;
        
        for (int s : stones) {
            mp[s] = unordered_set<int>();
        }
        
        // Start at stone 0 with jump 0
        mp[0].insert(0);
        
        for (int stone : stones) {
            for (int k : mp[stone]) {
                for (int step = k - 1; step <= k + 1; step++) {
                    if (step > 0 && mp.count(stone + step)) {
                        mp[stone + step].insert(step);
                    }
                }
            }
        }
        
        // Check if last stone is reachable
        return !mp[stones.back()].empty();
    }
};
