class Solution {
    public boolean isPalindrome(String s) {
        String newS = s.replaceAll(" ", "").toLowerCase();

        StringBuilder sb = new StringBuilder();

        for (int i=0; i<newS.length(); i++) {
            if (isAble(newS.charAt(i))) {
                sb.append(newS.charAt(i));
            }
        }
        
        String r = sb.toString();
        for (int i=0; i<r.length(); i++) {
            if (r.charAt(i) != r.charAt(r.length()-1-i)) {
                return false;
            }
        }
        return true;
    }

    public boolean isAble(char c) {
        if (isAlphabet(c) || isNumber(c)) {
            return true;
        }
        return false;
    }

    public boolean isNumber(char c) {
        if (c < '0' || c > '9') {
            return false;
        }
        return true;
    }

    public boolean isAlphabet(char c) {
        if (c < 'a' || c > 'z') {
            return false;
        }
        return true;
    }
}