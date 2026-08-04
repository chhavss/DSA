class Solution {
    public int uniqueXorTriplets(int[] nums) {
        boolean[] possible = new boolean[4096]; // 1500 < 2048, XOR fits in this range
        
        int n = nums.length;

        // Store all pair XOR values
        boolean[] pairs = new boolean[4096];

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                pairs[nums[i] ^ nums[j]] = true;
            }
        }

        // Combine pair XOR with third element
        for (int x = 0; x < pairs.length; x++) {
            if (pairs[x]) {
                for (int num : nums) {
                    possible[x ^ num] = true;
                }
            }
        }

        int count = 0;
        for (boolean val : possible) {
            if (val) count++;
        }

        return count;
    }
}