// Problem:
// Reverse Vowels of a String
// Given a string s, reverse only all the vowels in the string and return it.
// The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in both lower and upper cases, more than once.

// Example 1:
// Input: s = "hello"
// Output: "holle"

// Example 2:
// Input: s = "leetcode"
// Output: "leotcede"
 
// Constraints:
// 1 <= s.length <= 3 * 105
// s consist of printable ASCII characters.

// Solution:

class Solution {
public:
    bool isVowel(char s){
        if(s=='a' ||s=='e' ||s=='i' ||s=='o' ||s=='u' ||s=='A' ||s=='E' ||s=='I' ||s=='O' ||s=='U'){
            return true;
        }
        return false;
    }
    string reverseVowels(string s) {
        string x="";
        int size=s.length();
        for(int i=size-1;i>=0;i--){
            if(isVowel(s[i]))
            {
                x+=s[i];
            }
        }
        int a=0;
        for(int i=0;i<size;i++){
            if(isVowel(s[i]))
            {
                s[i]=x[a++];
            }
        }
        return s;
    }
};
