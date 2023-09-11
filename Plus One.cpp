// Problem:
// Plus One
// You are given a large integer represented as an integer array digits, where each digits[i] is the ith digit of the integer. The digits are ordered from most significant to least significant in left-to-right order. The large integer does not contain any leading 0's.
// Increment the large integer by one and return the resulting array of digits.

// Example 1:
// Input: digits = [1,2,3]
// Output: [1,2,4]
// Explanation: The array represents the integer 123.
// Incrementing by one gives 123 + 1 = 124.
// Thus, the result should be [1,2,4].

// Example 2:
// Input: digits = [4,3,2,1]
// Output: [4,3,2,2]
// Explanation: The array represents the integer 4321.
// Incrementing by one gives 4321 + 1 = 4322.
// Thus, the result should be [4,3,2,2].

// Example 3:
// Input: digits = [9]
// Output: [1,0]
// Explanation: The array represents the integer 9.
// Incrementing by one gives 9 + 1 = 10.
// Thus, the result should be [1,0].

// Constraints:
// 1 <= digits.length <= 100
// 0 <= digits[i] <= 9
// digits does not contain any leading 0's.

// Solution:

class Solution {
public:
    vector<int> plusOne(vector<int>& digits) {
        int x=0,m=1,c=0;
        int l=digits.size();
        if(digits[l-1]!=9){
            digits[l-1]++;
        }
        else{
            for(int i=l-1;i>=0;i--){
                if(digits[i]!=9)
                break;
                if(digits[i]==9)
                    x=i;
            }
            for(int i=x;i<l;i++){
                if(x!=0 && digits[x-1]!=9 && c==0){
                    digits[i-1]++;
                    m=0;
                    c++;
                    i--;
                    continue;
                }
                digits[i]=m;
                m=0;
            }
            if(c==0)
            digits.push_back(0);
        }
        return digits;
    }
};
