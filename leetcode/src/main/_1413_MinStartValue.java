package main;

/**
 * @author summer
 * @create 2022-08-09 10:38
 * @Description 1413. 逐步求和得到正数的最小值
 *              https://leetcode.cn/problems/minimum-value-to-get-positive-step-by-step-sum/
 */
public class _1413_MinStartValue {

    public static void main(String[] args) {

        int[] nums = {-3,2,-3,4,2};
        _minStartValue minStartValue = new _minStartValue();
        System.out.println(minStartValue.method_1(nums));


    }


}

class _minStartValue{

    /**
     *  逐步求和得到正数的最小值
     *  -- 暴力遍历
     * @param nums  整数数组
     * @return      最小整数起始值
     */
    public int method_1(int[] nums) {
        // 参数校验
        if(nums == null || nums.length == 0 ) return -1;
        // 获取数组的最大值
        int startValue = max(nums);
        boolean flag = true;
        while(flag){
       


            return 0;
        }


        return startValue;
    }


    /**
     *  遍历获取数组的最大值
     * @param nums  整数数组
     * @return  最大值
     */
    private int max(int[] nums) {
        // 参数校验
        //if(nums == null || nums.length == 0 ) return -1;
        // 定义最大值
        int max = nums[1];
        for (int num:nums) {
            max = max > num ? max : num;
        }
        return max;

    }

    /**
     *  遍历数组,使用初始值开始一次求和,判断初始值是否正确
     * @param nums  整数数组
     * @param startValue    初始值
     * @return  true 正确 false 错误
     */
    private boolean sumWithStratValue(int[] nums,int startValue) {
        // 遍历数组
        for (int num:nums) {
            startValue = startValue + num;
            if(startValue < 1){
                return false;
            }
        }
        return true;
    }
}

