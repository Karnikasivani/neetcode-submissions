class Solution {
    public int[] productExceptSelf(int[] nums) {
        if(nums.length == 1) return new int[]{1};
        int[] ans = new int[nums.length];
        // ans[0] = nums[0];
        ans[0] = rprod(1,nums.length,nums);
        for(int i= 1;i<nums.length;i++) {
            ans[i] = rprod(0,i,nums) * rprod(i+1,nums.length,nums);
        }
        ans[nums.length-1] = rprod(0,nums.length-1,nums);
        return ans;
    }
    public int rprod(int a, int b, int[] nums) {
        // System.out.println(a + " " + b);
        int prod = 1;
        for(int i=a;i<b;i++) {
            prod = prod * nums[i];
        }
        System.out.println(prod);
        return prod;
    }
}  
