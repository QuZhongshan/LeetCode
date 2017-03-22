public class Solution {
    public List<Integer> grayCode(int n) {
        ArrayList<Integer> res = new ArrayList<>();
        if (n == 0) {
            res.add(0);
            return res;
        }
        
        res = (ArrayList<Integer>)grayCode(n - 1);
        int addNumber = 1 << (n - 1);
        int originalSize = res.size();
        
        for (int i = originalSize - 1; i >= 0; i--)
            res.add(addNumber + res.get(i));
        
        return res;
    }
}

参考资料：http://www.cnblogs.com/springfor/p/3889222.html

时间复杂度：不太清楚。。。

这是格雷码的问题，有规律可循，具体规律见参考资料，我就不再这里重复了。不过这种解法和
回溯算法没关系啊，不太有借鉴性。