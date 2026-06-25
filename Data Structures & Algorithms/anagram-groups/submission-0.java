class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for(String words : strs) {
            char[] charArr = words.toCharArray();
            Arrays.sort(charArr);
            // System.out.println(charArr);
            String key = new String(charArr);
            map.computeIfAbsent(key, k -> new ArrayList()).add(words);
        }
        return new ArrayList<>(map.values());
    }
}
