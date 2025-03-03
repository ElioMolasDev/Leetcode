class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        Map<Integer, Integer> map = new TreeMap<>();

        for (int[] pair : nums1) {
            int id = pair[0];
            int value = pair[1];
            map.put(id, map.getOrDefault(id, 0) + value);
        }
        for (int[] pair : nums2) {
            int id = pair[0];
            int value = pair[1];
            map.put(id, map.getOrDefault(id, 0) + value);
        }
        int[][] result = new int[map.size()][2];
        int index = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            result[index][0] = entry.getKey(); 
            result[index][1] = entry.getValue(); 
            index++;
        }

        return result;
    }
}