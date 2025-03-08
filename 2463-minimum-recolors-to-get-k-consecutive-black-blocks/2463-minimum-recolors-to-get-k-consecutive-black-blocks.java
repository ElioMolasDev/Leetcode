class Solution {
    public int minimumRecolors(String blocks, int k) {
        int n = blocks.length();
        int minOperations = Integer.MAX_VALUE;
        
        for (int i = 0; i <= n - k; i++) {
            int currentOperations = 0;
            
            for (int j = i; j < i + k; j++) {
                if (blocks.charAt(j) == 'W') {
                    currentOperations++;
                }
            }
            
            if (currentOperations < minOperations) {
                minOperations = currentOperations;
            }
        }
        
        return minOperations;
    }
}