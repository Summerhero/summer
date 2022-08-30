package main;

/**
 * @author summer
 * @create 2022-08-29 10:25
 * @Description 1470. 重新排列数组
 *              https://leetcode.cn/problems/shuffle-the-array/
 */
public class _1470_Shuffle {

    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3,4,4,3,2,1};
        _1470_Shuffle shuffle = new _1470_Shuffle();
        int[] result = shuffle.method_1(nums,4);
        for (int num : result) {
            System.out.println(num);
        }
    }


    /**
     *  重新排列数组
     * @param nums  原数组
     * @param n     数组长度一半
     * @return      排列后数组
     */
    private int[] method_1(int[] nums, int n){
        // 参数校验 略
        // 定义返回结果
        int[] result = new int[2*n];
        // 遍历排列数组
        for (int i = 0; i < n ; i++) {
            result[2*i] = nums[i];
            result[2*i+1] = nums[i+n];
        }
        return result;
    }
}
