


class Solution {
public:
    int findNumbers(vector<int>& nums) {
        int count = 0;
        for (int num : nums) {
            int digits = (num == 0) ? 1 : (int)log10(abs(num)) + 1;
            if (digits % 2 == 0) {
                count++;
            }
        }
        return count;
    }
};