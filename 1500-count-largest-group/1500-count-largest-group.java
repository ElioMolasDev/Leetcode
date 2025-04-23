class Solution {
    public int countLargestGroup(int n) {
     Map<Integer, Integer> groupSizes = new HashMap<>();
        
        int maxSize = 0;
        int count = 0;
        for (int i = 1; i <= n; i++) {
            int sum = sumOfDigits(i);      
            groupSizes.put(sum, groupSizes.getOrDefault(sum, 0) + 1);           
            int currentSize = groupSizes.get(sum);       
            if (currentSize > maxSize) {
                maxSize = currentSize;
                count = 1;
            } else if (currentSize == maxSize) {
                count++;
            }
        }
        return count;
    }
    
    private int sumOfDigits(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
}