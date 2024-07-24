class Solution {
     private int transform(int num, int[] mapping) {
        if (num == 0) {
            return mapping[0];
        }

        int transformedNum = 0;
        int place = 1;
        while (num > 0) {
            int digit = num % 10;
            transformedNum += mapping[digit] * place;
            num /= 10;
            place *= 10;
        }

        return transformedNum;
    }
    public int[] sortJumbled(int[] mapping, int[] nums) {
         Integer[] indices = new Integer[nums.length];
        for (int i = 0; i < nums.length; i++) {
            indices[i] = i;
        }

        // Sort indices based on the mapped values
        Arrays.sort(indices, (a, b) -> {
            int mappedA = transform(nums[a], mapping);
            int mappedB = transform(nums[b], mapping);
            if (mappedA == mappedB) {
                return a - b; // Maintain original order for equal mapped values
            }
            return Integer.compare(mappedA, mappedB);
        });

        // Prepare the result array
        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            result[i] = nums[indices[i]];
        }

        return result;
    }
}