public class Solution {
    public int compareVersion(String version1, String version2) {
        String[] str1 = version1.split("\\.");
        String[] str2 = version2.split("\\.");
        
        int len = Math.max(str1.length, str2.length);
        for (int i = 0; i < len; i++) {
            int num1 = i < str1.length ? Integer.parseInt(str1[i]) : 0;
            int num2 = i < str2.length ? Integer.parseInt(str2[i]) : 0;
            if (num1 < num2)
                return -1;
            else if (num1 > num2)
                return 1;
        }
        
        return 0;
    }
}

参考资料：http://blog.csdn.net/xudli/article/details/42081113

需要注意一个关键的问题，版本号不一定是两部分，例如“1.3”，还有可能由多部分构成，例如“1.2.3”，
之后思路就比较简单了，首先将字符串根据“.”分成多个部分，分别比较各部分的大小就可以了。