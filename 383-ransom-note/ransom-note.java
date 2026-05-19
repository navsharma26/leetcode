class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character,Integer>hm=new HashMap<>();
        // #now checking the magazine
        for(int i=0;i<magazine.length();i++){
            char ch=magazine.charAt(i);
            if (hm.containsKey(ch)) {

                hm.put(ch, hm.get(ch) + 1);

            } 
            else {

                hm.put(ch, 1);

            }
        }
        // #now for the ransomnote
        for(int i=0;i<ransomNote.length();i++){
            char ch = ransomNote.charAt(i);
            if(!hm.containsKey(ch)||hm.get(ch) == 0){
                return false;
            }
            hm.put(ch,hm.get(ch)-1);

        }
        return true;
        
    }
}