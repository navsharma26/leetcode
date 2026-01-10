class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < operations.length; i++) {
            if (operations[i].equals("C")) {
                st.pop();
            } 
            else if (operations[i].equals("D")) {
                st.push(2 * st.peek());
            } 
            else if (operations[i].equals("+")) {
                int top = st.pop();
                int newTop = top + st.peek();
                st.push(top);
                st.push(newTop);
            } 
            else {
                st.push(Integer.parseInt(operations[i]));
            }
        }

        int sum = 0;
        for (int x : st) sum += x;
        return sum;
    }
}
