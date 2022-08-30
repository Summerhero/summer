package main;

import java.util.Arrays;

/**
 * @author summer
 * @create 2022-08-26 10:08
 * @Description 1464. 数组中两元素的最大乘积
 *              https://leetcode.cn/problems/maximum-product-of-two-elements-in-an-array/
 */
public class _1464_MaxProduct {

    public static void main(String[] args) {

        _1464_MaxProduct maxProduct = new _1464_MaxProduct();
        int[] nums = new int[]{3,4,5,2};
        System.out.println(maxProduct.method_1(nums));
        System.out.println(maxProduct.method_2(nums));


    }

    /**
     * 数组中两元素的最大乘积
     * @param nums  数组
     * @return  乘积
     */
    private int method_1(int[] nums){
        Arrays.sort(nums);
        return (nums[nums.length -1] - 1) * (nums[nums .length -2] - 1);
    }

    /**
     * 数组中两元素的最大乘积
     * 遍历数组，获取最大值以及次大值，进行计算
     * @param nums  数组
     * @return  乘积
     */
    private int method_2(int[] nums){
        // 参数判断
        if (nums == null || nums.length == 0) return -1;
        if (nums.length == 1) return nums[0] -1;
        if (nums.length == 2) return (nums[0] -1) * (nums[1] -1);
        // 遍历获取最大值以及次大值
        // 定义以及初始化最大值以及次大值
        //int max = nums[0] > nums[1] ? nums[0] : nums[1];
        //int _max = nums[0] > nums[1] ? nums[1] : nums[0];
        int max = nums[0];
        int _max = nums[1];
        if(max < _max){
            max = max + _max;
            _max = max - _max;
            max = max - _max;
        }
        for (int i = 2; i < nums.length ; i++) {
            if (nums[i] > _max){
                if (nums[i] > max){
                    _max = max;
                    max = nums[i];
                }else{
                    _max = nums[i];
                }
            }
        }
        return (max -1) * (_max -1);
    }

}

