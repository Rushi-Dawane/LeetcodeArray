class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
     List<List<String>> list=new ArrayList<>();
        HashMap<String,ArrayList<String>> map=new HashMap<>();
        for(String s:strs)
        {
            char[] arr=s.toCharArray();
            Arrays.sort(arr);
            String key=new String(arr);
            if(!map.containsKey(key))
            {
                map.put(key,new ArrayList<>());
            }
            map.get(key).add(s);
        }
        list.addAll(map.values());
        return list;
    }
}