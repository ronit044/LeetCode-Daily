// Problem:
// Counting Bits
// Given an integer n, return an array ans of length n + 1 such that for each i (0 <= i <= n), ans[i] is the number of 1's in the binary representation of i.

// Example 1:
// Input: n = 2
// Output: [0,1,1]
// Explanation:
// 0 --> 0
// 1 --> 1
// 2 --> 10
  
// Example 2:
// Input: n = 5
// Output: [0,1,1,2,1,2]
// Explanation:
// 0 --> 0
// 1 --> 1
// 2 --> 10
// 3 --> 11
// 4 --> 100
// 5 --> 101
 
// Constraints:
// 0 <= n <= 105

// Solution:
class Solution {
public:
    vector<int> countBits(int n) {
        vector<int> a;

        int r=0,x=0,count=0;
        for(int i=0;i<=n;i++){
            x=i;
            count=0;
        while(x!=0){
            r=x%2;
            if(r==1)
            count++;
            x/=2;
        }
        a.push_back(count);

    }
    return a;
    }
};
