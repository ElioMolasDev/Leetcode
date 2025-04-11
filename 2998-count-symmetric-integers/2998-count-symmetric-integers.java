class Solution {
    public int countSymmetricIntegers(int low, int high) {
        int count = 0;
        for (int num = low; num <= high; num++) {
            if (isSymmetric(num)) {
                count++;
            }
        }
        return count;
    }
    
    private boolean isSymmetric(int num) {
        String s = Integer.toString(num);
        int n = s.length();
        
        if (n % 2 != 0) {
            return false;
        }
        
        int half = n / 2;
        int sumFirstHalf = 0;
        int sumSecondHalf = 0;
        
        for (int i = 0; i < half; i++) {
            sumFirstHalf += Character.getNumericValue(s.charAt(i));
        }
        
        for (int i = half; i < n; i++) {
            sumSecondHalf += Character.getNumericValue(s.charAt(i));
        }
        
        return sumFirstHalf == sumSecondHalf;
    }
    
}