class Solution {
    public boolean containsDuplicate(int[] nums) {
        
        HashMap<Integer,Integer>hmap=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int key=nums[i];
            if(hmap.containsKey(key)){
                int num=hmap.get(key);
                hmap.put(key,num+1);

            }
            else{
                hmap.put(key,1);
            }
        }
       for (int key : hmap.keySet()) {     // keyset() -> hmap.keySet()
            if (hmap.get(key) > 1) {        // keyset(num) wrong
                return true;
            }
        }
       return false;

        
    }
}