class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] output = new int[n];
        int[] left = new int[n];
        int[] right = new int[n];
        left[0] = 1;
        right[n-1] = 1;
        for(int i=1;i<nums.length;i++) {
            left[i] = left[i-1] * nums[i-1];
        }
        for(int i=n-2;i>=0;i--) {
            right[i] = right[i+1] * nums[i+1];
        }
        for(int i=0;i<n;i++) {
            output[i] = left[i] * right[i];
        }
        System.out.println(Arrays.toString(left));
        System.out.println(Arrays.toString(right));
        return output;
    }
}  
/*
0 1 2 3
1 2 4 6

0=4-4
1=4-3
2-4-2
3=4-1
r = 48 24 6 1
l = 1  1  2 8
sum=48 24 12 8
*/