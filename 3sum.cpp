// Question:
// 3Sum
// Solved
// Medium
// Topics
// Companies
// Hint
// Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.

// Notice that the solution set must not contain duplicate triplets.

 

// Example 1:

// Input: nums = [-1,0,1,2,-1,-4]
// Output: [[-1,-1,2],[-1,0,1]]
// Explanation: 
// nums[0] + nums[1] + nums[2] = (-1) + 0 + 1 = 0.
// nums[1] + nums[2] + nums[4] = 0 + 1 + (-1) = 0.
// nums[0] + nums[3] + nums[4] = (-1) + 2 + (-1) = 0.
// The distinct triplets are [-1,0,1] and [-1,-1,2].
// Notice that the order of the output and the order of the triplets does not matter.
// Example 2:

// Input: nums = [0,1,1]
// Output: []
// Explanation: The only possible triplet does not sum up to 0.
// Example 3:

// Input: nums = [0,0,0]
// Output: [[0,0,0]]
// Explanation: The only possible triplet sums up to 0.
 

// Constraints:

// 3 <= nums.length <= 3000
// -105 <= nums[i] <= 105


// Solution:

class Solution {
public:
    vector<vector<int>> threeSum(vector<int>& nums) {
       int size=nums.size();
       int pt1=1,pt2=size-1;
       vector<int> vec;
       vector<vector<int>> mainVec;
       sort(nums.begin(),nums.end());
        set<vector<int>> uniqueTriplets;
       for(int i=0;i<size;i++)
       {
           pt1=i+1;
           pt2=size-1;
           while(pt1<pt2){
           if(nums[i]+nums[pt1]+nums[pt2]==0){
               vec = {nums[i], nums[pt1], nums[pt2]};
                    uniqueTriplets.insert(vec);  
               pt1++;
               pt2--;
           }
           else if(nums[i]+nums[pt1]+nums[pt2]<0){
               pt1++;
           }
            else if(nums[i]+nums[pt1]+nums[pt2]>0){
               pt2--;
           }
           }
       } 
        mainVec = {uniqueTriplets.begin(), uniqueTriplets.end()};
       return mainVec;
    }
};
