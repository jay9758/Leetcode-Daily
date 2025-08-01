public class july27 {
     public int countHillValley(int[] nums) {
        int count = 0;
        for (int i = 1; i < nums.length; i++) {

            if(nums[i]==nums[i-1]) continue;
            
            int prev = i - 1;
            while (prev >= 0 && nums[prev] == nums[i]) {
                prev--;
            }

            int next = i + 1;
            while (next < nums.length && nums[next] == nums[i]) {
                next++;
            }
            if (prev >= 0 && next < nums.length) {
                if (nums[prev] < nums[i] && nums[next] < nums[i]) {
                    count++;
                } else if (nums[prev] > nums[i] && nums[next] > nums[i]) {
                    count++;
                }
            }
        }
        return count;
    }
}
