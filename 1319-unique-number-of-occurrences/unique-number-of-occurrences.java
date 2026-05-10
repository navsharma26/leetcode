class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        
        HashMap<Integer, Integer> hm = new HashMap<>();

        for(int i = 0; i < arr.length; i++) {
            
            int key = arr[i];

            if(hm.containsKey(key)) {
                hm.put(key, hm.get(key) + 1);
            }
            else {
                hm.put(key, 1);
            }
        }

        HashSet<Integer> set = new HashSet<>();

        for(int key : hm.keySet()) {
            int val = hm.get(key);
            set.add(val);
        }

        return (hm.size() == set.size());
    }
}