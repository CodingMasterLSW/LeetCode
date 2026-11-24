class Solution {
    public int reverse(int x) {
        String s = String.valueOf(x);
        char[] arr = new char[s.length()];
        for (int i=0; i<s.length(); i++) {
            arr[i] = s.charAt(i);
        }
        
        for (int i=0; i<s.length()/2; i++) {
            char tmp = arr[i];
            arr[i] = arr[s.length() -1 -i];
            arr[s.length()-1-i] = tmp;
        }

        StringBuilder sb = new StringBuilder();
        if (arr[s.length()-1] == '-') {
            sb.append('-');
        }

        for (int i=0; i<s.length(); i++) {
            if (i==0 && arr[i] == 0) {
                continue;
            }
            if (i == s.length()-1 && arr[i] == '-') {
                continue;
            }
            sb.append(arr[i]);
        }
        long value = Long.parseLong(sb.toString());
        if (Math.abs(value) > Integer.MAX_VALUE) {
            return 0;
        }
        return (int) value;
    }
}