// Question:

// Find the Index of the First Occurrence in a String
// Easy

// Given two strings needle and haystack, return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.

// Example 1:
// Input: haystack = "sadbutsad", needle = "sad"
// Output: 0
// Explanation: "sad" occurs at index 0 and 6.
// The first occurrence is at index 0, so we return 0.

// Example 2:
// Input: haystack = "leetcode", needle = "leeto"
// Output: -1
// Explanation: "leeto" did not occur in "leetcode", so we return -1.
 
// Constraints:
// 1 <= haystack.length, needle.length <= 104
// haystack and needle consist of only lowercase English characters.



// Solution:

class Solution {
public:
    int strStr(string haystack, string needle) {
        int i,j,k=0;
        string st="";
        int h=haystack.size();
        int n=needle.size();
        if(n>h){
            return -1;
        }
        else{
        for(i=0;i<=(h-n);i++){
            k=i;
            for(j=0;j<n;j++){
                st+=haystack[k++];
            }
            if(st==needle)
            return i;
            k=0;
            st="";
        }}
        return -1;
        
    }
};
