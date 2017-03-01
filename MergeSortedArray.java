public class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        while(m > 0 && n > 0) {
            if (nums1[m-1] > nums2[n-1]) {
                nums1[m+n-1] = nums1[m-1];
                m--;
            } else {
                nums1[m+n-1] = nums2[n-1];
                n--;
            }
        }
 
        while (n > 0) {
            nums1[m+n-1] = nums2[n-1];
            n--;
        }
    }
}

参考资料：http://www.programcreek.com/2012/12/leetcode-merge-sorted-array-java/
        http://blog.csdn.net/xudli/article/details/8492041

从后往前进行比较是这种解法思路的重点，记住啊哈哈哈！