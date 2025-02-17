class Solution {
    public int numTilePossibilities(String tiles) {
        // Contar la frecuencia de cada letra
        Map<Character, Integer> frequencyMap = new HashMap<>();
        for (char c : tiles.toCharArray()) {
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
        }
        return backtrack(frequencyMap);
    }

     private int backtrack(Map<Character, Integer> frequencyMap) {
        int count = 0;
        for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
            char letter = entry.getKey();
            int frequency = entry.getValue();
            if (frequency > 0) {
                count++;
                frequencyMap.put(letter, frequency - 1);
                count += backtrack(frequencyMap);
                // Restaurar la frecuencia (backtracking)
                frequencyMap.put(letter, frequency);
            }
        }
        return count;
    }

}