class Solution {
    public String smallestNumber(String pattern) {
        int n = pattern.length();
        Stack<Integer> stack = new Stack<>();
        StringBuilder result = new StringBuilder();
        int currentNumber = 1;

        for (int i = 0; i <= n; i++) {
            stack.push(currentNumber);
            currentNumber++;
            if (i == n || pattern.charAt(i) == 'I') {
                while (!stack.isEmpty()) {
                    result.append(stack.pop());
                }
            }
        }
        return result.toString();
    }
}