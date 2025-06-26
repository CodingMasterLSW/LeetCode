class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String start = strs[0];
        String last = strs[strs.length-1];
        int idx = 0;

        System.out.println(start);
        System.out.println(last);
        

        if (start.equals(last)) {
            return start;
        }

        if (start.isBlank() && last.isBlank()) {
            return "";
        }

        if (start.isBlank() && !last.isBlank()) {
            return "";
        }
        if (!start.isBlank() && last.isBlank()) {
            return "";
        }

        while (idx != start.length()) {
            if (start.charAt(idx) == last.charAt(idx)) {
                idx++;
            } else {
                break;
            }
        }
        return start.substring(0, idx);
    }
}