class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int left=0,right=numbers.length-1;
        int[] arr = new int[2];
        for(int i=0;i<numbers.length;i++) {
            int sum = numbers[left] + numbers[right];
            if(sum > target) right--;
            else if(sum < target) left++; 
            else return new int[]{left+1, right+1};
        }
        return new int[]{};
    }
}
