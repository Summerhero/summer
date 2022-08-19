package main;

import java.util.HashMap;
import java.util.Map;

/**
 * @author summer
 * @create 2022-08-18 9:52
 * @Description 1224. 最大相等频率
 *              https://leetcode.cn/problems/maximum-equal-frequency/
 */
public class _1224_MaxEqualFreq {
}

class MaxEquaFreq{

    /**
     * 定义数组元素以及个数
     */
    private Map<Integer, Integer> map ;

    public int maxCount(int[] nums) {
        // 参数校验
        if(null == nums || nums.length == 0) return -1;
        if(nums.length == 1) return 1;
        // 将数组按照整数以及整除出现次数进行分类,形成map

        // 定义初始位置
        int start = 0;
        // 暴力循环获取最长前缀
        while (start != nums.length){

        }
        return 0;
    }


    /**
     *
     * @param nums
     * @param map
     * @return
     */
    private boolean isEqualFreqArray(int[] nums,Map<Integer, Integer> map){
        map = (null == map) ? getMap(nums) : map;
        // 遍历数组，判断是否是等频次数组



        return false;
    }


    /**
     *  将数组按照元素以及元素出现的次数进行分类
     * @param nums  数组
     * @return  分类后map
     */
    private Map<Integer, Integer> getMap(int[] nums){
        // 参数校验 略
        // 初始化 成员变量 map
        map = new HashMap<>();
        for (int num : nums) {
            map.put(num,map.get(num) + 1);
        }
        return map;
    }

    public boolean isEqualArray(int num){
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        // 定义次数和
        int keyCount = 0;
        int sum = 0;
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            sum += entry.getValue();
            keyCount ++;
        }
        return sum%keyCount == 0;
    }
}