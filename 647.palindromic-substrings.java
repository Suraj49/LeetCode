/*
 * @lc app=leetcode id=647 lang=java
 *
 * [647] Palindromic Substrings
 */

// @lc code=start
class Solution {
    public int countSubstrings(String str) {
        
        int n=str.length();
        int count=0;
        for(int st=0;st<n;st++){

            for (int end=st;end<n;end++){
                String ss=str.substring(st,end+1);
                if(islPalindromic(ss)){
                   count++;
                }
            }
        }
        return count;
    }
    public static boolean islPalindromic(String s){
        int i=0;
        int j=s.length()-1;
        while (i<=j){
            char lstr=s.charAt(i);
            char rstr=s.charAt(j);
            if(lstr!=rstr){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
// @lc code=end

