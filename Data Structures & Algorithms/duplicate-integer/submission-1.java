class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> ans = new HashSet<>();
        for (int i=0;i<nums.length;i++) {
            if(ans.contains(nums[i])) return true;
            else ans.add(nums[i]);
        }
        return false;
    }
}

/*
for(int i=0;i<nums.length;i++) {
            for(int j=1;j<nums.length;j++) {
                if(i!=j && nums[i] == nums[j]) {
                    return true;
                }
            }
        }
        return false;
*/