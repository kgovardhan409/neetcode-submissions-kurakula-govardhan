class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
        List<List<String>> out = new ArrayList<>();

        for (int i = 0; i < strs.length; i++) {
            char[] charArr = strs[i].toCharArray();
            Arrays.sort(charArr);
            String str = new String(charArr);
            map.computeIfAbsent(str, k -> new ArrayList<>()).add(strs[i]);
        }
        System.out.println(map);
        return new ArrayList<>(map.values());
    }
}
