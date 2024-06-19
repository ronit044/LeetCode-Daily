class Solution {
    public void daysCountDown(int[] arr, int day){
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > 0 && arr[i] <= day){
                arr[i] = -1;
            }
        }
    }

    public int adjCount(int[] arr, int k){
        int c = 0, res = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == -1){
                c++;
                if(c == k){
                    res++;
                    c = 0; // Reset counter after a bouquet is made
                }
            } else {
                c = 0; // Reset counter if a flower is not ready
            }
        }
        return res;
    }

    public int minDays(int[] bloomDay, int m, int k) {
        int max = 0;
        for(int i : bloomDay){
            max = Math.max(max, i);
        }

        int low = 1, high = max;
        while(low < high){
            int mid = (low + high) / 2;
            int[] temp = bloomDay.clone();
            daysCountDown(temp, mid);
            if(adjCount(temp, k) >= m){
                high = mid; // Try for a smaller day
            } else {
                low = mid + 1; // Increase the day
            }
        }

        // Final check to see if we can form m bouquets on the 'low' day
        int[] finalCheck = bloomDay.clone();
        daysCountDown(finalCheck, low);
        return (adjCount(finalCheck, k) >= m) ? low : -1;
    }
}
