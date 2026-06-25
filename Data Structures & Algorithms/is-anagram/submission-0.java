class Solution {
    public boolean isAnagram(String s, String t) {
        char[] ans1 = s.toCharArray();
        char[] ans2 = t.toCharArray();
        Arrays.sort(ans1);
        Arrays.sort(ans2);
        // System.out.println(Arrays.toString(ans1) + " " + Arrays.toString(ans2));
        if(Arrays.equals(ans1, ans2)) return true;
        return false;
    }
}
