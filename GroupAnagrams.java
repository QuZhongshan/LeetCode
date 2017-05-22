public class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res = new ArrayList<List<String>>();
        if (strs == null || strs.length == 0)
            return res;
        
        HashMap<String, ArrayList<String>> map = new HashMap<>();
        for (String str : strs) {
            char[] strChars = str.toCharArray();
            Arrays.sort(strChars);
            String strSorted = String.valueOf(strChars);
            
            if (map.containsKey(strSorted)) {
                ArrayList<String> list = map.get(strSorted);
                list.add(str);
                map.put(strSorted, list);
            } else {
                ArrayList<String> list = new ArrayList<String>();
                list.add(str);
                map.put(strSorted, list);
            }
        }
        
        Set<String> keySet = map.keySet();
        for (String key : keySet) {
            ArrayList<String> list = map.get(key);
            Collections.sort(list);
            res.add(list);
        }
        
        return res;
    }
}

参考资料：算法总结资料里面，很详细

