import java.util.*;

class Solution {
    public int[] answerQueries(int[] nums, int[] queries) {

        int[] answer = new int[queries.length];

        Arrays.sort(nums);

        // prefix sum
        for(int i = 1; i < nums.length; i++){
            nums[i] = nums[i] + nums[i-1];
        }

        // process queries
        for(int i = 0; i < queries.length; i++){
            int j = Arrays.binarySearch(nums, queries[i]);
            answer[i] = Math.abs(j + 1);
        }

        return answer;
    }
}
