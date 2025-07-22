class july22 {
    public int maximumUniqueSubarray(int[] nums) {
        int left=0;
        int right=0;
        int sum=0;
        int score=0;
        HashSet<Integer> set=new HashSet<>();

        while(right<nums.length){
            if(!set.contains(nums[right])){
                sum += nums[right];
                set.add(nums[right]);
                score=Math.max(score,sum);
                right++;
            }
            else{
                sum -= nums[left];
                set.remove(nums[left]);
                left++;
            }
        }
    return score;
    }
}