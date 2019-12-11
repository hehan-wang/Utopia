package com.david.leetcode;

/**
 * 给定一个非空整数数组，除了某个元素只出现一次以外，其余每个元素均出现两次。找出那个只出现了一次的元素。
 * 你的算法应该具有线性时间复杂度。 你可以不使用额外空间来实现吗？
 * 链接：https://leetcode-cn.com/problems/single-number
 */
public class Question136 {
    public static void main(String[] args) {
        int i = new Solution().singleNumber(new int[]{1,1,111, 2, 3, 2, 3});
        System.out.println(i);
    }

    /**
     * 标签：位运算
     * 本题根据题意，线性时间复杂度 O(n)O(n)，很容易想到使用 Hash 映射来进行计算，遍历一次后结束得到结果，但是在空间复杂度上会达到 O(n)O(n)，需要使用较多的额外空间
     * 既满足时间复杂度又满足空间复杂度，就要提到位运算中的异或运算 XOR，主要因为异或运算有以下几个特点：
     * 一个数和 0 做 XOR 运算等于本身：a⊕0 = a
     * 一个数和其本身做 XOR 运算等于 0：a⊕a = 0
     * XOR 运算满足交换律和结合律：a⊕b⊕a = (a⊕a)⊕b = 0⊕b = b
     * 故而在以上的基础条件上，将所有数字按照顺序做抑或运算，最后剩下的结果即为唯一的数字
     * 时间复杂度：O(n)O(n)，空间复杂度：O(1)O(1)
     * 链接：https://leetcode-cn.com/problems/single-number/solution/hua-jie-suan-fa-136-zhi-chu-xian-yi-ci-de-shu-zi-b/
     */
    public static class Solution {
        public int singleNumber(int[] nums) {
            int res = 0;
            for (int n : nums) {
                res ^= n;
            }
            return res;
        }
    }
}
