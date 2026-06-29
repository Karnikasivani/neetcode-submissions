class Solution {

    public String encode(List<String> strs) {
        int len = 0;
        String encoded = "";
        for(String str : strs) {
            len = str.length();
            encoded = encoded + String.valueOf(len) + "#" + str ;
            // encoded = encoded + str + "#" + String.valueOf(len) ;
        }
        System.out.println("encoded " + encoded);
        return encoded;
    }

    public List<String> decode(String str) {
        List<String> decoded = new ArrayList<>();
        int wordlen = 0, j = 0,i = 0;
        String strwordlen = "", word = "";
        while(i < str.length()) {
            while(str.charAt(j) != '#') {
                // System.out.println(str.charAt(j));
                j++;
                strwordlen = str.substring(i,j);
            }
            wordlen = Integer.parseInt(strwordlen); 
            word = str.substring(j+1,j+1+wordlen);
            decoded.add(word);
            i = wordlen+1+j; j=i;
        }
        System.out.println("strwordlen " + strwordlen);
        return decoded;
    }
}
/*
Design a codec: how do you join strings and split them back unambiguously? 
The challenge — strings can contain any character including your delimiter. 
Think: what if you store the length of each string as a prefix?
Encode: for each string, prepend '{length}#'. 
Decode: read until '#' to get length, then read exactly that many chars. 
This handles any character inside strings.



*/