class Solution {
    public int longestConsecutive(int[] nums) {
        List<Integer> list = Arrays.stream(nums).boxed().collect(Collectors.toList());
        int max=0,currele = 0,streak=0;
        for(int i=0;i<nums.length;i++) {
            int ele = list.get(i);
            if(!list.contains(ele - 1)) {
                currele = ele;
                streak = 1;
                while(list.contains(currele+1)) {
                    currele = currele + 1;
                    streak = streak + 1;
                }
                max = Math.max(max, streak);
            }
        }
        return max;
    }
}
/*
if num-1 is not in array then it is started element
iterate thr the list. if num not found, starter=1
loop for consecutive numbers
update max
*/