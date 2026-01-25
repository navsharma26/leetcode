class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character,Integer>hm=new HashMap<>();
        for(int i=0;i<s.length();i++){
            hm.put(s.charAt(i),hm.getOrDefault(s.charAt(i),0)+1);

        }
        char store='1';
        for(int i=0;i<s.length();i++){
            if(hm.get(s.charAt(i)) ==1){
                store=s.charAt(i);
                break;

            }
            
        }
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==store){
                return i;
            }
        }
        return -1;

        
    }
}