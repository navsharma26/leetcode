class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<arr.length;i++){


            if(map.containsKey(arr[i])){
                int val=map.get(arr[i]);
                map.put(arr[i],val+1);
            }
            else{
                map.put(arr[i],1);
            }

        }
        HashSet<Integer>set=new HashSet<>();
        for(int key:map.keySet()){
            int val=map.get(key);
            set.add(val);
        }
        return (map.size()==set.size());
       
        

    }
}