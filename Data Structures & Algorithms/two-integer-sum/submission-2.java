class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] out;
        for(int i = 0; i < nums.length; i++){
            int expectedTarget = target - nums[i];
            // 8, 5
            int left = i+1;
            while(left < nums.length){
                System.out.println(expectedTarget + " " + nums[left]);
                if(expectedTarget == nums[left]){
                   return new int[]{i, left};
                }
                left++;
            }
            // if(out.length > 0){
            //     return out;
            // }
        }
        return new int[]{};
    }
}
