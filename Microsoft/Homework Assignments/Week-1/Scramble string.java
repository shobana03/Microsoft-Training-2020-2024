class Solution {
    public boolean isScramble(String s1, String s2) {
        if (s1 == null || s2 == null) {
            return false;
        }
        
        if (s1.equals(s2)) {
            return true;
        }
        
        Boolean[][][] dp = new Boolean[s1.length()][s2.length()][s1.length() + 1];
        
        return dfs(s1, 0, s2, 0, s1.length(), dp);
    }
    
    public boolean dfs(String s1, int start1, String s2, int start2, int delta, Boolean[][][] dp) {
        if (delta < 1) {
            return false;
        }
        
        if (dp[start1][start2][delta] != null) {
            return dp[start1][start2][delta];
        }
        
        if (delta == 1) {
            return s1.charAt(start1) == s2.charAt(start2);
        }
        
        int end1 = start1 + delta - 1;
        int end2 = start2 + delta - 1;
        
        boolean result = false;
        
        for (int i = 1; i < delta; i++) {
            //same parts equal
            boolean out1 = dfs(s1, start1, s2, start2, i, dp) && dfs(s1, start1 + i, s2, start2 + i, delta - i, dp);
            
            //reverse parts equal
            boolean out2 = dfs(s1, start1, s2, end2 - i + 1, i, dp) && dfs(s1, start1 + i, s2, start2, delta - i, dp);
            
            boolean out = out1 || out2;
            
            if (out) {
                result = true;
                break;
            }
        }
        
        dp[start1][start2][delta] = result;
        
        return result;
    }
}
