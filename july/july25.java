public class july25 {
     public int maxSum(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int num : nums){
            if(num>0){
                set.add(num);
            }
        }
        if(set.isEmpty()){
            return Arrays.stream(nums).max().getAsInt();
        }
        int max=0;
        for(int item : set){
            max += item;
        }
        return max;
    }
}
