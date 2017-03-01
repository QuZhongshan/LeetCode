public class Solution {
    public List<Integer> topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        
        // begin bucket sort
        List<Integer>[] bucket = new List[nums.length + 1];
        for (int key : map.keySet()) {
            int frequency = map.get(key);
            if (bucket[frequency] == null)
                bucket[frequency] = new ArrayList<Integer>();
            bucket[frequency].add(key);
        }
        
        ArrayList<Integer> res = new ArrayList<Integer>();
        for (int i = bucket.length - 1; i >= 0; i--) {
            if (bucket[i] != null)
                res.addAll(bucket[i]);
            
            if (res.size() == k)
                break;
        }
        
        return res;
    }
}

参考资料：http://www.programcreek.com/2014/05/leetcode-top-k-frequent-elements-java/

桶排序参考资料：http://blog.csdn.net/houapple/article/details/6480100

这道题的思路很清晰，首先创建一个map对象，将各个数值以及他们的频率进行存储，之后从中找取
频率最高的前k个数；难点在于这道题目要求时间复杂度必须优于O(nlogn)，这就要求不能使用一般
的排序算法，因此想到使用同排序来进行筛选，重点理解桶排序就好；

还有，在Java中桶排序非常非常重要，一定要掌握；

时间复杂度：O(n)