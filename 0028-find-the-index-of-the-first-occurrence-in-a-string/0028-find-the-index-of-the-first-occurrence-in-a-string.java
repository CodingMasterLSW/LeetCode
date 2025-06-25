class Solution {
    public int strStr(String haystack, String needle) {
        if (haystack.equals(needle)) {
            return 0;
        }
        int count = haystack.length() - needle.length();
        if (count < 0) {
            return -1;
        }
        StringBuilder sb = new StringBuilder();        
        for (int i=0; i<=count; i++) {
            sb.append(haystack.substring(i, needle.length() + i));
            if (sb.toString().equals(needle)) {
                return i;
            } else {
                sb.setLength(0);
            }
        }
        return -1;
    }
}