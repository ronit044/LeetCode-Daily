// Problem:
// 14. Longest Common Prefix
// Easy
// Write a function to find the longest common prefix string amongst an array of strings.
// If there is no common prefix, return an empty string "".

// Example 1:
// Input: strs = ["flower","flow","flight"]
// Output: "fl"

// Example 2:
// Input: strs = ["dog","racecar","car"]
// Output: ""
// Explanation: There is no common prefix among the input strings.

// Constraints:
// 1 <= strs.length <= 200
// 0 <= strs[i].length <= 200
// strs[i] consists of only lowercase English letters.




// Solution:

class Solution {
public:
    string longestCommonPrefix(vector<string>& strs) {
        int i,j,k=1,c=0,b=0;
        string ele="",final="";
        string x=strs[0],a="";
        for(i=0;i<x.size();i++){
                ele=x.substr(0,k);
                for(j=0;j<strs.size();j++){
                a=strs[j].substr(0,k);
                if(ele==a)
                    c++;
            }
            if(c==strs.size())
            final=ele;
            k++;
            c=0;
        }
        if(final!="")
        return final;
        else
        return "";
    
    }
};
