public class Solution {
    public int myAtoi(String str) {
        if (str == null || str.length() == 0)
            return 0;
        
        boolean isPositive = true;
        int res;

        str = str.trim();
        
        int i = 0;
        if (str.charAt(0) == '+') {
            i++;
        } else if (str.charAt(0) == '-') {
            isPositive = false;
            i++;
        }
        
        double tmp = 0;  
        for ( ; i < str.length(); i++) {  
            int digit = str.charAt(i) - '0';  
            if (digit < 0 || digit > 9) 
                break;  
              
            if (isPositive) {  
                tmp = 10 * tmp + digit;  
                if (tmp > Integer.MAX_VALUE) 
                    return Integer.MAX_VALUE;  
            } else {  
                tmp = 10 * tmp - digit; 
                if (tmp < Integer.MIN_VALUE) 
                    return Integer.MIN_VALUE;  
            }  
        }  
          
        res = (int)tmp;  
        return res;  
    }
}

参考资料：http://blog.csdn.net/ljiabin/article/details/40508889