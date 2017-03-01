public class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        if (nums == null || nums.length == 0)
            return list;
        
        int len = nums.length;
        for (int i = 0; i < len; i++) {
            int pos = Math.abs(nums[i]) - 1;
            if (nums[pos] > 0)
                nums[pos] = -nums[pos];
        }
        
        for (int i = 0; i < len; i++) {
            if (nums[i] > 0)
                list.add(i + 1);
        }
        
        return list;
    }
}

参考资料：http://blog.csdn.net/qq_30351805/article/details/53125837
重点看leetcode中的TopSolutions的。

这道题要好好总结一下，比较难以理解。乍一看起来，这道题目不是特别难，但是它是有限制
条件的，时间复杂度O（n），不适用额外空间，也就是说空间复杂度O（1）。在这两个前提下，
就比较困难了，不过整理后的思路还挺好的。主要思想是查看应该在数组中某个位置出现的元素
是否出现，如果出现了的话，就将该元素应该所在的位置的数组元素进行标记，表示应该在这个
位置出现的元素出现了，这里采用的做法是将该位置的元素取负值，明白了这一点，代码也就好理解
了。但愿未来的自己可以看懂哈。。。挺绕的。。。。