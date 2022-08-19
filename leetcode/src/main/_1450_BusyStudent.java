package main;

import java.util.Arrays;

/**
 * @author summer
 * @create 2022-08-19 9:56
 * @Description
 */
public class _1450_BusyStudent {


    /**
     *  给你两个整数数组 startTime（开始时间）和 endTime（结束时间）,并指定一个整数 queryTime 作为查询时间,
     *  返回能够使 queryTime 处于区间 [startTime[i], endTime[i]]（含）的学生人数
     * @param startTime 开始时间数组
     * @param endTime   结束时间数组
     * @param queryTime 查询时间
     * @return  正则做作业
     */
    public static int busyStudent(int[] startTime, int[] endTime, int queryTime) {
        // 定义结果
        int count = 0;
        // 遍历获取
        for (int i = 0; i < startTime.length; i++) {
            // 开始时间等于查询时间，必然处于做作业状态
           // if(startTime[i] == queryTime) count ++;
            // 开始时间小于查询时间
            if(startTime[i] <= queryTime && endTime[i] >= queryTime) count ++;
        }
        return count;
    }


    public static int busyStudent_2(int[] startTime, int[] endTime, int queryTime) {
        // 将开始时间进行排序
        // 定义结果
        int count = 0;
        // 遍历获取
        for (int i = 0; i < startTime.length; i++) {
            // 开始时间等于查询时间，必然处于做作业状态
            // if(startTime[i] == queryTime) count ++;
            // 开始时间小于查询时间
            if(startTime[i] <= queryTime && endTime[i] >= queryTime) count ++;
        }
        return count;
    }


    public static void main(String[] args) {
        int[] startTime = new int[]{1,2,3};
        int[] endTime = new int[]{3,2,7};
        int queryTime = 4;
        System.out.println("test_1 result = " + busyStudent(startTime, endTime, queryTime));
        startTime = new int[]{4};
        endTime = new int[]{4};
        queryTime = 4;
        System.out.println("test_2 result = " + busyStudent(startTime, endTime, queryTime));
        queryTime = 5;
        System.out.println("test_3 result = " + busyStudent(startTime, endTime, queryTime));
        startTime = new int[]{1,1,1,1};
        endTime = new int[]{1,3,2,4};
        queryTime = 7;
        System.out.println("test_4 result = " + busyStudent(startTime, endTime, queryTime));
        startTime = new int[]{9,8,7,6,5,4,3,2,1};
        endTime = new int[]{10,10,10,10,10,10,10,10,10};
        queryTime = 5;
        System.out.println("test_5 result = " + busyStudent(startTime, endTime, queryTime));
    }

}

