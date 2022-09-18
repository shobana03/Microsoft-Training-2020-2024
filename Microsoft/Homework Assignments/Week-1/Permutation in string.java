class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int[] counts = new int[26];
        for (char c : s1.toCharArray()) {
            counts[c - 'a']++;
        }
        
        int i = 0;
        int j = 0;
        int[] window = new int[26];
        while (i < s2.length() && j < s2.length()) {
            char c = s2.charAt(j++);
            window[c - 'a']++;
            while (window[c - 'a'] > counts[c - 'a']) {
                window[s2.charAt(i++) - 'a']--;
            }
            if (Arrays.equals(window, counts)) return true;
        }
        
        return false;
    }
}
