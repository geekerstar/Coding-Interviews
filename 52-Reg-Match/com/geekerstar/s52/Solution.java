package com.geekerstar.s52;

/**
 * @Author: Geekerstar(QQ : 247507792)
 * @Date: 2018/8/31 19:36
 * @Description:
 */
public class Solution {
    public boolean match(char[] str, char[] pattern) {

        int m = str.length, n = pattern.length;
        boolean[][] dp = new boolean[m + 1][n + 1];

        dp[0][0] = true;
        for (int i = 1; i <= n; i++) {
            if (pattern[i - 1] == '*') {
                dp[0][i] = dp[0][i - 2];
            }
        }

        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (str[i - 1] == pattern[j - 1] || pattern[j - 1] == '.') {
                    dp[i][j] = dp[i - 1][j - 1];
                }
                else if (pattern[j - 1] == '*') {
                    if (pattern[j - 2] == str[i - 1] || pattern[j - 2] == '.') {
                        // a* counts as single a
                        dp[i][j] |= dp[i][j - 1];
                        // a* counts as multiple a
                        dp[i][j] |= dp[i - 1][j];
                        // a* counts as empty
                        dp[i][j] |= dp[i][j - 2];
                    } else {
                        // a* only counts as empty
                        dp[i][j] = dp[i][j - 2];
                    }
                }
            }
        }
        return dp[m][n];
    }
}
