class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        HashMap<Character, Integer> map1 = new HashMap<>();
        for(int i=0;i<s.length();i++) {
            char c = s.charAt(i);
            map1.put(c, map1.getOrDefault(c,0) + 1);
        }
        for(int i=0;i<t.length();i++) {
            char c = t.charAt(i);
            if(!map1.containsKey(c)) return false;
            map1.put(c, map1.get(c) - 1);
            if(map1.get(c) < 0) return false;
        }
        return true;
    }
}
/*
char[] ans1 = s.toCharArray();
        char[] ans2 = t.toCharArray();
        Arrays.sort(ans1);
        Arrays.sort(ans2);
        // System.out.println(Arrays.toString(ans1) + " " + Arrays.toString(ans2));
        if(Arrays.equals(ans1, ans2)) return true;
        return false;
        */