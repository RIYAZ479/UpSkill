import java.util.*;

class Solution {
    public boolean isSubsequence(String s, String t) {
        HashMap<Character, List<Integer>> map = new HashMap<>();
        int count = 0;

        for (int i = 0; i < t.length(); i++) {
            char ch = t.charAt(i);

            map.putIfAbsent(ch, new ArrayList<>());
            map.get(ch).add(i);
        }

        int temp = -1;

        for (int j = 0; j < s.length(); j++) {
            char ch = s.charAt(j);

            if (!map.containsKey(ch)) {
                return false;
            }

            boolean found = false;

            for (int p : map.get(ch)) {
                if (p > temp) {
                    temp = p;
                    count++;
                    found = true;
                    break;
                }
            }

            if (!found) {
                return false;
            }
        }

        return count == s.length();
    }
}