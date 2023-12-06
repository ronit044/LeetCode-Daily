// Problem:
// Is Subsequence
// Given two strings s and t, return true if s is a subsequence of t, or false otherwise.
// A subsequence of a string is a new string that is formed from the original string by deleting some (can be none) of the characters without disturbing the relative positions of the remaining characters. (i.e., "ace" is a subsequence of "abcde" while "aec" is not).

// Example 1:
// Input: s = "abc", t = "ahbgdc"
// Output: true

// Example 2:
// Input: s = "axc", t = "ahbgdc"
// Output: false

// Constraints:
// 0 <= s.length <= 100
// 0 <= t.length <= 104
// s and t consist only of lowercase English letters.

// Solution:

class Solution {
public:
    bool isSubsequence(string s, string t) {
        int s1=s.length(),s2=t.length(),prev=-1,c=0;
        char x;
        for(int i=0;i<s1;i++){
            x=s[i];
            c=0;
            for(int j=prev+1;j<s2;j++){
                if(t[j]==x){
                    prev=j;
                    c=1;
                    break;
                }
            }
            if(c==0) return false;
        }
        return true;
    }
};
