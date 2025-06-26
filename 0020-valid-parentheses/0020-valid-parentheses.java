class Solution {
    public boolean isValid(String s) {
        Deque<Character> deq = new ArrayDeque<>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                deq.push(c);
            } else {
                if (deq.isEmpty()) {
                    return false;
                }
                char top = deq.peek();
                if ((top == '(' && c == ')')||
                 (top == '[' && c == ']')||
                  (top == '{' && c == '}')) {
                    deq.pop();
                } else {
                    return false;
                }
            }
        
        }
        if (deq.isEmpty()) {
            return true;
        } 
        return false;
    }
}