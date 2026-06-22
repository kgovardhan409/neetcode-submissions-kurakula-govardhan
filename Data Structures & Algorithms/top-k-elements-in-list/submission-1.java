class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> b[1] - a[1]);
        int[] out = new int[k];
        for(int num: nums){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for(Map.Entry<Integer, Integer> map2 : map.entrySet()){
            pq.offer(new int[]{map2.getKey(), map2.getValue()});
        }
        int i = 0;
        while(i < k){
            out[i] = pq.poll()[0];
            i++;
        }
        return out;
    }
}
