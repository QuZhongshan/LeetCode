public class Solution {
    public int strStr(String haystack, String needle) {
        if(haystack==null || needle==null)    
            return 0;
 
        if(needle.length() == 0)
            return 0;
 
        for (int i = 0; i < haystack.length(); i++) {
            if(i + needle.length() > haystack.length())
                return -1;
 
            int m = i;
            for(int j = 0; j < needle.length(); j++){
                if(needle.charAt(j) == haystack.charAt(m)){
                    if(j == needle.length() - 1)
                        return i;
                    m++;
                } else {
                    break;
                }
            }    
        }   
 
        return -1;
    }
}

参考资料：http://www.programcreek.com/2012/12/leetcode-implement-strstr-java/
        http://www.cnblogs.com/springfor/p/3896469.html

心情不好，题目都没怎么想，总之如果用java写的话直接用String对象的indeOf()方法就能搞定，
参考资料给的解答挺好的，一共两种思路，今天也没仔细看，以后有时间在总结吧，哈哈。不知道
有时间是什么时候。