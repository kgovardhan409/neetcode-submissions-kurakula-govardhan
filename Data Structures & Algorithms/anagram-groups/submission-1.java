class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
        List<List<String>> out = new ArrayList<>();

        for (int i = 0; i < strs.length; i++) {
            PriorityQueue<Character> pq = new PriorityQueue<>();
            char[] charArr = strs[i].toCharArray();
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < charArr.length; j++) {
                pq.add(charArr[j]);
            }
            while(!pq.isEmpty()){
                sb.append(String.valueOf(pq.poll()));
            }

            if (map.containsKey(sb.toString())) {
                List<String> ls = map.get(sb.toString());
                ls.add(strs[i]);
                map.put(sb.toString(), ls);
            } else {
                List<String> l2 = new ArrayList();
                l2.add(strs[i]);
                map.put(sb.toString(), l2);
            }
        }
        return new ArrayList<>(map.values());
    }
}
