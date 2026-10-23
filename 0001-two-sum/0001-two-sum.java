import java.util.HashMap;
class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> seen = new HashMap<>();
        
        for(int i = 0; i < nums.length ;i++){
            int residue = target - nums[i];
            if(seen.containsKey(residue)){
                return new int[] {seen.get(residue), i};
            }
            seen.put(nums[i],i);
        }
        throw new IllegalArgumentException("No match found");
    }
}