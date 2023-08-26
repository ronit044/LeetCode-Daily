// Question:
// Find All Duplicates in an Array

// Given an integer array nums of length n where all the integers of nums are in the range [1, n] and each integer appears once or twice, return an array of all the integers that appears twice.
// You must write an algorithm that runs in O(n) time and uses only constant extra space.

// Example 1:
// Input: nums = [4,3,2,7,8,2,3,1]
// Output: [2,3]

// Example 2:
// Input: nums = [1,1,2]
// Output: [1]

// Example 3:
// Input: nums = [1]
// Output: []

// Constraints:
// n == nums.length
// 1 <= n <= 105
// 1 <= nums[i] <= n
// Each element in nums appears once or twice.

// Solution:

class Solution {
public:
    vector<int> findDuplicates(vector<int>& nums) {
        int s=nums.size();
        vector<int> n(s+1,0);
        vector<int> x;

        for(int i : nums){
            n[i]++;
        }
        for(int j=0;j<n.size();j++){
            if(n[j]==2){
            // cout<<j;
            x.push_back(j);
            }
        }
        return x;
       
    }
};
