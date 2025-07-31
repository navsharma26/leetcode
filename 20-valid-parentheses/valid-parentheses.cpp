class Solution {
public:
    bool isValid(string s) {
        stack<char> st;
        unordered_map<char, char> bracketPairs = {
            {')', '('},
            {']', '['},
            {'}', '{'}
        };

        for (char ch : s) {
            if (bracketPairs.count(ch)) {
                if (st.empty() || st.top() != bracketPairs[ch]) {
                    return false;
                }
                st.pop(); 
            } else {
                st.push(ch);
            }
        }
        return st.empty();
    }
};