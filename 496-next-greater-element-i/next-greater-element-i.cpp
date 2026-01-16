class Solution {
public:
    vector<int> nextGreaterElement(vector<int>& nums1, vector<int>& nums2) {
        stack<int> s;
        unordered_map<int,int> ans;
        for(int i =nums2.size()-1; i >=0; i--){
            while(s.size() > 0 && nums2[i] >= s.top()){
                s.pop();
            }
            if(s.empty()){
                ans[nums2[i]] = -1;
            }else{
                ans[nums2[i]] = s.top();
            }
            s.push(nums2[i]);
        }
        vector<int> res(nums1.size());
        for(int i =0; i < nums1.size(); i++){
            res[i] = ans[nums1[i]];
        }
        return res;
    }
};