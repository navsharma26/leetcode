class Solution {
    public int maximumNumberOfStringPairs(String[] words) {
       HashSet<String>set=new HashSet<>();
       int count=0;
       for(int i=0;i<words.length;i++){
        if(set.contains(reverse(words[i]))){
            count++;
        }
        else{
            set.add(words[i]);
        }
        
       }
       return count;

        
    }
    public String reverse(String s){
        StringBuilder sb=new StringBuilder(s);
        sb.reverse();
         return sb.toString();

    }
}