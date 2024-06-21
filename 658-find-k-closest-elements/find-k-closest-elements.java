//using priority Queue not the best approach but good to discuss with the interviewer
//as a brute or better approach
class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        class Pair implements Comparable<Pair>{
            int diff;
            int number;
            Pair(int diff, int number){
                this.diff = diff;
                this.number = number;
            }
            
            public int compareTo(Pair other){
                int val = this.diff - other.diff;
                if(val == 0)
                    return this.number - other.number;
                else
                    return val;
            }
        }
        
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        for(int i = 0; i < arr.length; i++){
            pq.add(new Pair(Math.abs(arr[i] - x), arr[i]));
        }
        List<Integer> res = new ArrayList<Integer>();
        for(int i = 1; i <= k; i++){
            res.add(pq.poll().number);
        }
        Collections.sort(res);
        return res;
    }
}