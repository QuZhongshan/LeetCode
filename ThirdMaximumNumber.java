解法一：set
public class Solution {
    public int thirdMax(int[] nums) {
        HashSet<Integer> set = new HashSet<Integer>();
        for (int i = 0; i < nums.length; i++)
            set.add(nums[i]);
        
        if (set.size() < 3) {
            int max = Integer.MIN_VALUE;
            for (int num : set) {
                if (num > max)
                    max = num;
            }
            
            return max;
        } else {
            for (int i = 0; i < 2; i++) {
                int max = Integer.MIN_VALUE;
                for (int num : set)
                    if (num > max)
                        max = num;
                set.remove(max);
            }
            
            int max = Integer.MIN_VALUE;
            for (int num : set)
                if (num > max)
                    max = num;
                        
            return max;
        }
    }
}

解法二：
public class Solution {
    public int thirdMax(int[] nums) {
        long first = Long.MIN_VALUE;
        long second = Long.MIN_VALUE;
        long third = Long.MIN_VALUE;
        
        for (int num : nums) {
            if (num == first || num == second || num == third)
                continue;
            
            if (num > first) {
                third = second;
                second = first;
                first = num;
            } else if (num > second) {
                third = second;
                second = num;
            } else if (num > third) {
                third = num;
            }
        }
        
        return third == Long.MIN_VALUE ? (int)first : (int)third;
    }
}

参考资料：http://blog.csdn.net/xiexingshishu/article/details/52840988

解法一为自己的思考，主要是使用set数据结构用来存储数组中不同的元素，首先 进行判断，若set
中的数组元素个数小于3，那么就返回最大值，否则先遍历两遍set，除去最大值，之后再次遍历一遍，
找到最大值，返回接口，思路简单，但过程较为繁琐。

解法二为参考资料，思路简单，设置三个变量用来存储最大的三个数，只需要注意一点，这三个变量
的初始值不能设置为Integer.MIN_VALUE，这是因为数组中可能存在这个最小值，应该设置为如上
所示的Long.MIN_VALUE,这样数组中的所有值都比这三个值大。




