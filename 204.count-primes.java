/*
 * @lc app=leetcode id=204 lang=java
 *
 * [204] Count Primes
 */

// @lc code=start
class Solution {

    static int sieve(int N)
    {
        if(N < 3)
            return 0;
        int cnt = 0;
        boolean[] prime= new boolean[N];
        for(int i = 2 ; i < N ; i++)
            prime[i] = true;
        for(int i = 2 ; i * i < N ; i++)
        {
            if(prime[i])
                for(int j = i * i ; j < N ; j += i)
                    prime[j] = false;
        }
        for(int i = 2 ; i < N ; i++)
            if(prime[i])
                cnt++;
        return cnt;
    }

    public int countPrimes(int N) {
        {
            if(N < 3)
                return 0;
            return sieve(N);
        }
    }
}
// @lc code=end

