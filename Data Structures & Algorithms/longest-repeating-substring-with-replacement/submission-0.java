class Solution {
    public int characterReplacement(String s, int k) {
        int[] freq = new int[26];
        int left = 0, maxFreq = 0, maxLen = 0;
        int replacements = 0;
        for(int i=0;i<s.length();i++) {
            int charIdx = s.charAt(i) - 'A';
            freq[charIdx]++;
            maxFreq = Math.max(maxFreq, freq[charIdx]);
            replacements = (i - left + 1) - maxFreq;
            if(replacements > k) {
                freq[s.charAt(left) - 'A']--;
                left++;
            }
            maxLen = Math.max(maxLen, i - left + 1);
        }
        return maxLen;
    }
}
