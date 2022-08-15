package reflection;

import java.lang.annotation.ElementType;

/**
 * @author summer
 * @create 2022-08-15 16:18
 * @Description 所有类型的class (null 没有calss)
 */
public class Test02 {
    public static void main(String[] args) {

        Class c1 = Object.class;    // Obejct 对象
        Class c2 = Comparable.class;    // 接口
        Class c3 = Override.class;  // 注解
        Class c4 = ElementType.class;   // 枚举
        Class c5 = int[].class; // 一维数组
        Class c6 = int[][].class;   // 二维数组
        Class c7 = int.class;
        Class c8 = Integer.class;
        Class c9 = void.class;
        Class c10 = Class.class;

        // 输出打印
        System.out.println(c1 );
        System.out.println(c2 );
        System.out.println(c3 );
        System.out.println(c4 );
        System.out.println(c5 );
        System.out.println(c6 );
        System.out.println(c7 );
        System.out.println(c8 );
        System.out.println(c9 );
        System.out.println(c10);

        // 数组对比
        int[] a = new int[5];
        int[] b = new int[10];
        Class ca = a.getClass();
        Class cb = b.getClass();

        System.out.println(ca.hashCode());
        System.out.println(cb.hashCode());
        System.out.println(c5.hashCode());




    }
}
