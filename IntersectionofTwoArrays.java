public class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<Integer>();
        for (int i = 0; i < nums1.length; i++) {
            set.add(nums1[i]);
        }
        
        HashSet<Integer> intersect = new HashSet<Integer>();
        for (int i = 0; i < nums2.length; i++) {
            if (set.contains(nums2[i]))
                intersect.add(nums2[i]);
        }
        
        int[] res = new int[intersect.size()];
        int i = 0;
        for (int num : intersect)
            res[i++] = num;
        
        return res;
    }
}

参考资料：leetcode中的Solutions就好，很清楚

没什么可说的，用两个set对象就可以实现，参考资料里有列举了三种方法，有时间了可以看看；

时间复杂度：O(n)
