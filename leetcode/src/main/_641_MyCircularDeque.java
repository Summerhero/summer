package main;

import org.omg.CORBA.INTERNAL;

/**
 * @author summer
 * @create 2022-08-15 9:33
 * @Description 641. 设计循环双端队列
 *              https://leetcode.cn/problems/design-circular-deque/
 */
public class _641_MyCircularDeque {

    public static void main(String[] args) {

        CircularDequeArray circularDequeArray = new CircularDequeArray(5);
        System.out.println(circularDequeArray.deleteFront());
        System.out.println(circularDequeArray.deleteFront());
        circularDequeArray.insertFront(11);
        circularDequeArray.insertLast(91);
        circularDequeArray.insertFront(12);
        circularDequeArray.insertLast(92);
        circularDequeArray.insertFront(13);
        System.out.println(circularDequeArray.isEmpty());
        System.out.println(circularDequeArray.isFull());
        circularDequeArray.deleteLast();
        circularDequeArray.insertLast(93);
        circularDequeArray.deleteFront();
        circularDequeArray.insertFront(31);
        circularDequeArray.show();
    }



}

/**
 * @Description 使用数组完成双端对列设计
 */
class CircularDequeArray{

    // 定义数组
    private int[] array;

    // 定义当前数组大小,默认值为0
    private int size;


    /**
     * 双端队列构造函数
     * @param k 双端队列大小
     */
    public CircularDequeArray(int k) {
        // 参数校验
        if(k < 1 || k > Integer.MAX_VALUE){throw new IllegalArgumentException("请检查参数K="+k);}
        // 初始化数组
        array = new int[k];
    }

    /**
     * 首部添加元素
     * @param value 待添加元素
     * @return  结果    ture 成功  false 失败
     */
    public boolean insertFront(int value) {
        if (isFull()){return false;}
        // 遍历数组，添加元素,所有元素向后一位
        for (int i = size; i > 0 ; i--) {
            array[i] = array[i-1];
        }
        array[0] = value;
        size ++;
        return true;
    }

    /**
     * 尾部添加元素
     * @param value 待添加元素
     * @return  结果    ture 成功  false 失败
     */
    public boolean insertLast(int value) {
        if (isFull()){return false;}
        array[size] = value;
        size ++;
        return false;
    }

    /**
     * 从首部删除数组
     * @return  结果 ture 成功  false 失败
     */
    public boolean deleteFront() {
        if (isEmpty()){return false;}
        // 遍历数组，删除首元素,其余元素向前一位
        for (int i = 0; i < size - 1 ; i++) {
            array[i] = array[i+1];
        }
        size --;
        return false;
    }

    /**
     * 从尾部删除元素
     * @return  结果 ture 成功  false 失败
     */
    public boolean deleteLast() {
        if (isEmpty()){return false;}
        size --;
        return false;
    }

    /**
     * 从首部获取元素
     * @return  元素
     */
    public int getFront()  {
        return array[0];
    }

    /**
     * 从尾部获取元素
     * @return  元素
     */
    public int getRear()throws Exception {
        return array[size-1];
    }

    /**
     * 判断数组是否为空
     * @return  true 空 false 非空
     */
    public boolean isEmpty() {
        return size == 0;
    }

    /**
     * 判断数组是否已满
     * @return  true 已满 false 非满
     */
    public boolean isFull() {
        return size == array.length;
    }

    public void show(){
        System.out.println("deque: k = " + array.length +",size = " + size);
        if(!isEmpty()){
            for (int num:array) {
                System.out.println(num);
            }
        }


    }

}
