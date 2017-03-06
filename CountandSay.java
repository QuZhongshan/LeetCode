public class Solution {
    public String countAndSay(int n) {
        StringBuilder curr=new StringBuilder("1");
	    StringBuilder prev;
	    int count;
	    char say;
	    
	    for (int i = 1; i < n; i++) {
	        prev = curr;
	 	    curr = new StringBuilder();       
	 	    count = 1;
	 	    say = prev.charAt(0);
	 	        
	 	    for (int j = 1, len = prev.length(); j < len; j++) {
	 	        if (prev.charAt(j) != say) {
	 	            curr.append(count).append(say);
	 	        	count = 1;
	 	        	say = prev.charAt(j);
	 	        } else
	 	            count++;
	 	    }
	 	    
	 	    curr.append(count).append(say);
	    }	       	        
	    
	    return curr.toString();
    }
}

参考资料：http://www.bubuko.com/infodetail-1000123.html
		leetcode中的Solutions

时间复杂度：不太清楚。。

没怎么做，不过自己的思路还是正确的，一遍一遍的过就行，有点麻烦，好烦，以后再看。。。