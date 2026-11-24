class Solution {
    public int firstUniqChar(String s) {
        Set<Character> arr = new HashSet<>();
        Set<Character> wrong = new HashSet<>();

        for (int i=0; i<s.length(); i++) {
            char t = s.charAt(i);
            if (wrong.contains(t)) {
                continue;
            }
            if (arr.contains(t)) {
                arr.remove(t);
                wrong.add(t);
            } else {
                arr.add(t);
            }
        }

        for (int i=0; i<s.length(); i++) {
            if (arr.contains(s.charAt(i))) {
                return i;
            }
        }
        return -1;
    }
}