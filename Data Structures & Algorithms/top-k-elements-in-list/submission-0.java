class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> b[1] - a[1]);
        int[] out = new int[k];
        for(int i = 0; i < nums.length; i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        for(Map.Entry<Integer, Integer> map2 : map.entrySet()){
            pq.offer(new int[]{map2.getKey(), map2.getValue()});
        }
        int key = 0;
        while(key < k){
            out[key] = pq.poll()[0];
            key++;
        }
        return out;
    }
}
