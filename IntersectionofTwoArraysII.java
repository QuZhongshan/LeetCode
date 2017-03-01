public class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        ArrayList<Integer> intersect = new ArrayList<Integer>();
        
        int i = 0, j = 0;
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] < nums2[j]) {
                i++;
            } else if (nums1[i] > nums2[j]) {
                j++;
            } else {
                intersect.add(nums1[i]);
                i++;
                j++;
            }
        }
        
        int[] res = new int[intersect.size()];
        int k = 0;
        for (int num : intersect)
            res[k++] = num;
        
        return res;
    }
}

参考资料：https://discuss.leetcode.com/topic/49429/4ms-java-solution

这道题要求相交的元素不管重复与否全部显示出来，适合使用双指针方法来进行，注意同时将set
转换为list来进行存储；

时间复杂度：O(nlogn)
