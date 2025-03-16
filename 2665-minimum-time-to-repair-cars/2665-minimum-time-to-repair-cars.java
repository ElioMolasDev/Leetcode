class Solution {
    public long repairCars(int[] ranks, int cars) {
        long maxRank = 0;
        for (int rank : ranks) {
            if (rank > maxRank) {
                maxRank = rank;
            }
        }
        long left = 1; 
        long right = maxRank * cars * cars; // Tiempo máximo posible

        while (left < right) {
            long mid = left + (right - left) / 2; 
            if (canRepairAllCars(ranks, cars, mid)) {
                right = mid; 
            } else {
                left = mid + 1; 
            }
        }
        return left; 
    }

    private static boolean canRepairAllCars(int[] ranks, int cars, long time) {
        long totalCarsRepaired = 0;
        for (int rank : ranks) {
            long carsRepaired = (long) Math.sqrt(time / rank);
            totalCarsRepaired += carsRepaired;
            if (totalCarsRepaired >= cars) {
                return true; 
            }
        }
        return false; 
    }
    
}