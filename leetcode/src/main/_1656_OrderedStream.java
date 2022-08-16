package main;

import java.util.ArrayList;
import java.util.List;

/**
 * @author summer
 * @create 2022-08-16 9:25
 * @Description 1656. 设计有序流
 *              https://leetcode.cn/problems/design-an-ordered-stream/
 */
public class _1656_OrderedStream {

    public static void main(String[] args) {
        OrderStream stream = new OrderStream(5);
        stream.insert(5,null);
        stream.insert(3,"cccc");
        stream.insert(1,"aaaa");
        stream.insert(2,"bbbb");
        stream.insert(5,"eeee");
        stream.insert(4,"dddd");



    }
}


class OrderStream{

    /**
     * 数组
     */
    private String[] stream;

    /**
     * 查询指针
     */
    private int ptr;


    /**
     * 带参构造器
     * @param n 整数 n
     */
    public OrderStream(int n){
        // 参数校验,暂略
        // 初始化列表
        stream = new String[n + 1];
        ptr = 1;
    }

    /**
     * 添加元素
     * @param idKey id
     * @param value value
     * @return  连续结果列表
     */
    public List<String> insert(int idKey, String value) {
        // 参数校验,暂略
        // 添加复制操作
        stream[idKey] = value;
        // 定义列表
        List<String> list = new ArrayList<>();
        while (ptr < stream.length && stream[ptr] != null) {
            list.add(stream[ptr]);
            ++ptr;
        }
        System.out.println(list.toString());
        return list;
    }



}
