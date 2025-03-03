class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        List<Integer> less = new ArrayList<>();
        List<Integer> equal = new ArrayList<>();
        List<Integer> greater = new ArrayList<>();

        for (int num : nums) {
            if (num < pivot) {
                less.add(num); 
            } else if (num == pivot) {
                equal.add(num); 
            } else {
                greater.add(num); 
            }
        }

        List<Integer> result = new ArrayList<>();
        result.addAll(less);
        result.addAll(equal); 
        result.addAll(greater); 
        int[] output = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            output[i] = result.get(i);
        }

        return output;
    }
}