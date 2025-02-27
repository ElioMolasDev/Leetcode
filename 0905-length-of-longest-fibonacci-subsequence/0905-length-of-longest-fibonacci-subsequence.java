class Solution {
    public int lenLongestFibSubseq(int[] arr) {
        int n = arr.length;
        int maxLen = 0;
        
        // Mapa para almacenar el índice de cada elemento en el arreglo
        Map<Integer, Integer> indexMap = new HashMap<>();
        for (int i = 0; i < n; i++) {
            indexMap.put(arr[i], i);
        }
        
        int[][] dp = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int x = arr[i];
                int y = arr[j];
                int z = x + y;
                if (indexMap.containsKey(z)) {
                    int k = indexMap.get(z);
                    dp[j][k] = dp[i][j] == 0 ? 3 : dp[i][j] + 1;
                    maxLen = Math.max(maxLen, dp[j][k]);
                }
            }
        }
        
        return maxLen;
    }
}