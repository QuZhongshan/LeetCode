/**
 * Definition for an interval.
 * public class Interval {
 *     int start;
 *     int end;
 *     Interval() { start = 0; end = 0; }
 *     Interval(int s, int e) { start = s; end = e; }
 * }
 */
public class Solution {
    public int eraseOverlapIntervals(Interval[] intervals) {
        if (intervals == null || intervals.length == 0 || intervals.length == 1)
            return 0;
        
        Arrays.sort(intervals, new Comparator<Interval>() {
            @Override
            public int compare(Interval o1, Interval o2) {
                if (o1.end != o2.end)
                    return o1.end - o2.end;
                return o2.start - o1.start;
            }
        });
        
        int end = Integer.MIN_VALUE;
        int count = 0;
        for (Interval interval : intervals) {
            if (interval.start >= end)
                end = interval.end;
            else
                count++;
        }

        return count;
    }
}

参考资料：http://blog.csdn.net/awawfwfw/article/details/53210083

时间复杂度：不太清楚。。

典型的贪心算法的应用。。暂时还没有总结，等总结了贪心算法再回来看这道题。。



