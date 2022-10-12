class Solution {
        public int myAtoi(String str) {
        int i = 0;
        int res = 0;
        int sign = 1;
        
        if(str.length() == 0) return 0;
      
        while(i < str.length() && str.charAt(i) == ' ')
            i++;
        if (i == str.length()) return 0;
        if(str.charAt(i) == '+' || str.charAt(i) == '-') {
            sign = str.charAt(i) == '+' ? 1 : -1;
            i++;
        }
        while(i < str.length()) {
            int digit = str.charAt(i) - '0';
            if(digit < 0 || digit > 9) break;
            
            if(Integer.MAX_VALUE / 10 < res || Integer.MAX_VALUE / 10 == res && Integer.MAX_VALUE % 10 < digit)
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            
            res = res*10 + digit;
            i++; 
        }
        return res*sign;
    }
}
