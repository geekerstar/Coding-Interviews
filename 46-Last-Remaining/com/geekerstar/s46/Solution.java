package com.geekerstar.s46;

/**
 * @Author: Geekerstar(QQ : 247507792)
 * @Date: 2018/8/31 19:11
 * @Description:
 */
public class Solution {
    public int LastRemaining_Solution(int n, int m) {
        if (n == 0)     /* 特殊输入的处理 */
            return -1;
        if (n == 1)     /* 递归返回条件 */
            return 0;
        return (LastRemaining_Solution(n - 1, m) + m) % n;
    }
}
