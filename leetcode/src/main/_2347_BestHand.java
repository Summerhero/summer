package main;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/**
 * @author summer
 * @create 2023-02-20 10:47
 * @Description _2347_最好的扑克手牌 https://leetcode.cn/problems/best-poker-hand/
 */
public class _2347_BestHand {

    public static void main(String[] args) {
        _2347_BestHand bestHand = new _2347_BestHand();

        String[] suits = {"a","a","a","a","a"};
        System.out.println(bestHand.maxSameCount(suits));

    }

    /**
     * 官网方法
     * @param ranks     点数数组
     * @param suits     花色数组
     * @return  牌状态
     */
    public String method_1(int[] ranks, char[] suits) {
        // 参数校验 略
        // 花色集合
        HashSet<Character> suitsSet = new HashSet<>();
        // 遍历花色数组，构建花色集合
        for (char suit:suits) {
            suitsSet.add(suit);
        }
        if(suitsSet.size() == 1) return "flush";
        // 点数按照 hashMap 划分归类
        HashMap<Integer,Integer> rankMap = new HashMap<>();
        // 遍历点数数组,构建点数map
        for (int rank:ranks) {
            rankMap.put(rank, rankMap.getOrDefault(rank, 0) + 1);
        }
        if(rankMap.size() == 5) return "high card";
        for (Map.Entry<Integer,Integer> entry:rankMap.entrySet()) {
            if (entry.getValue() > 2) {
                return "Three of a Kind";
            }
        }
        return "Pair";
    }



    private int maxSameCount(Object[] arr){
        // 参数校验
        // 预定义返回结果
        int maxCount = 0;
        // 遍历数组
        for (int i = 0; i < arr.length -1; i++) {
            int count = 1;
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i] == arr[j]){
                    count ++;
                }
            }
            maxCount = maxCount > count ? maxCount : count;
            if(maxCount == arr.length) break;
        }
        return  maxCount;
    }
}


