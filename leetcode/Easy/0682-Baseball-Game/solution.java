// LeetCode Problem: Baseball Game
// Link: https://leetcode.com/problems/baseball-game/
// Difficulty: Easy
// Language: java

class Solution {
    public int calPoints(String[] ops) {
        Stack<Integer> st = new Stack<>();

        for (String op : ops) {
            if (op.equals("C")) {
                st.pop();
            } 
            else if (op.equals("D")) {
                st.push(2 * st.peek());
            } 
            else if (op.equals("+")) {
                int top = st.pop();
                int newScore = top + st.peek();
                st.push(top);
                st.push(newScore);
            } 
            else {
                st.push(Integer.parseInt(op));
            }
        }

        int sum = 0;
        while (!st.isEmpty()) {
            sum += st.pop();
        }

        return sum;
    }
}