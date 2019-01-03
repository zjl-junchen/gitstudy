public class 爬楼梯70 {
    /**
     * 其他方法
     * https://www.cnblogs.com/baiqiantao/p/10085787.html
     * You are climbing a stair case. It takes n steps to reach to the top.
     *
     * Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
     *
     * Note: Given n will be a positive integer.
     *
     * Example 1:
     *
     * Input: 2
     * Output: 2
     * Explanation: There are two ways to climb to the top.
     * 1. 1 step + 1 step
     * 2. 2 steps
     * Example 2:
     *
     * Input: 3
     * Output: 3
     * Explanation: There are three ways to climb to the top.
     * 1. 1 step + 1 step + 1 step
     * 2. 1 step + 2 steps
     * 3. 2 steps + 1 step
     *
     * 假设你正在爬楼梯。需要 n 阶你才能到达楼顶。
     *
     * 每次你可以爬 1 或 2 个台阶。你有多少种不同的方法可以爬到楼顶呢？
     *
     * 注意：给定 n 是一个正整数。
     *
     * 示例 1：
     *
     * 输入： 2
     * 输出： 2
     * 解释： 有两种方法可以爬到楼顶。
     * 1.  1 阶 + 1 阶
     * 2.  2 阶
     * 示例 2：
     *
     * 输入： 3
     * 输出： 3
     * 解释： 有三种方法可以爬到楼顶。
     * 1.  1 阶 + 1 阶 + 1 阶
     * 2.  1 阶 + 2 阶
     * 3.  2 阶 + 1 阶
     *
     */

    public static void main(String[] args) {
        System.out.println("结果为："+climbStairs2(6));

    }

    /**
     * 无限栈
     * @param n
     * @return
     */
    public  static int climbStairs1(int n) {
        if(n==1) return 1;
        if(n==2) return 2;

        int s = climbStairs1(n-1)+climbStairs1(n-2);
        return s;
    }

    /**
     * 动态规划法
     * @param n
     * @return
     */
    public  static int climbStairs2(int n) {
       int[] arr = new int[n+1];
        arr[0]=1;
        arr[1]=2;
        for (int i = 2; i < n; i++) {
            arr[i] = arr[i-1] + arr[i-2];
        }
        return arr[n-1];
    }

}
