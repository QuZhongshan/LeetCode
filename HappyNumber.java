public class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> set = new HashSet<Integer>();
        
        while (!set.contains(n)){
            set.add(n);
            
            int sum = 0;
            while (n > 0) {
                sum += (n % 10) * (n % 10);
                n = n / 10;
            }
            n = sum;
            
            if (n == 1)
                return true;
        }

        return false;
    }
}

参考资料：http://www.programcreek.com/2014/04/leetcode-happy-number-java/

时间复杂度：不太清楚

循环判断，创建一个set对象用来记录所有出现过的数字，如果再次出现说明不是happy number，
返回false，若出现1则说明是happy number，返回true。



