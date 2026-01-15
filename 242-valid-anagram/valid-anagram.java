import java.util.HashMap;

class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

        HashMap<Character, Integer> hmap = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char key = s.charAt(i);
            if (hmap.containsKey(key)) {
                int num1=hmap.get(key);
                hmap.put(key, num1 + 1);
            } else {
                hmap.put(key, 1);
            }
        }

        HashMap<Character, Integer> tmap = new HashMap<>();

        for (int i = 0; i < t.length(); i++) {
            char key = t.charAt(i);
            if (tmap.containsKey(key)) {
               int num2= tmap.get(key);
                tmap.put(key, num2 + 1);
            } else {
                tmap.put(key, 1);
            }
        }

        for (char key : hmap.keySet()) {
            if (!tmap.containsKey(key)) return false;
            if (!hmap.get(key).equals(tmap.get(key))) return false;
        }

        return true;
    }
}
