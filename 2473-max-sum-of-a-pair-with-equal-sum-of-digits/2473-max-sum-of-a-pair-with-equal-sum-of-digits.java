class Solution {
    public int maximumSum(int[] nums) {
         Map<Integer, List<Integer>> sumMap = new HashMap<>();
        for (int num : nums) {
            int sum = digitSum(num);
            sumMap.putIfAbsent(sum, new ArrayList<>());
            sumMap.get(sum).add(num);
        }

        int maxSum = -1;
        for (List<Integer> list : sumMap.values()) {
            if (list.size() > 1) {
                Collections.sort(list, Collections.reverseOrder());
                int pairSum = list.get(0) + list.get(1);
                maxSum = Math.max(maxSum, pairSum);
            }
        }
        return maxSum;  
    }
    
    public static int digitSum(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
}