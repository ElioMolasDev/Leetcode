class Solution {
    public int minOperations(int[] nums, int k) {
        for (int num : nums) {
            if (num < k) {
                return -1;
            }
        }
        
        // Usamos un TreeSet para obtener valores únicos ordenados descendente
        TreeSet<Integer> uniqueValues = new TreeSet<>(Collections.reverseOrder());
        
        for (int num : nums) {
            if (num > k) {
                uniqueValues.add(num);
            }
        }
        
        // El número de operaciones es igual al número de valores únicos > k
        return uniqueValues.size();
    }
}