public class Solution {
    public int countPrimes(int n) {
        boolean[] isPrime = new boolean[n];
        Arrays.fill(isPrime, true);
        
        for (int i = 2; i * i < n; i++) {
            if (!isPrime[i])
                continue;
            
            for (int j = i * i; j < n; j += i)
                isPrime[j] = false;
        }
        
        int count = 0;
        for (int i = 2; i < n; i++) {
            if (isPrime[i])
                count++;
        }
        
        return count;
    }
}

参考资料：https://segmentfault.com/a/1190000003709122
重点参考hint和leetcode中的TopSolutions的java解法。

这道题的关键是理解计算素数的算法埃拉托斯特尼筛法Sieve of Eratosthenes，重点理解一下，
暂时理解的七七八八，在leetcode题目的hint中有详细讲解。