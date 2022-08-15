package reflection;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author summer
 * @create 2022-08-15 20:37
 * @Description 性能测试
 */
public class Test07 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        test01();
        test02();
        test03();
    }

    public static void test01() {
        long startTime = System.currentTimeMillis();
        Student student = new Student();
        for (int i = 0; i <Integer.MAX_VALUE ; i++) {
            student.getStudentNum();
        }
        long endTime = System.currentTimeMillis();
        System.out.println("普通方法：" + (endTime - startTime) + "ms");
    }

    public static void test02() throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {

        Class  c = Class.forName("reflection.Student");
        Student student = (Student) c.newInstance();
        Method method = c.getMethod("getStudentNum");
        long startTime = System.currentTimeMillis();
        for (int i = 0; i <Integer.MAX_VALUE ; i++) {
            method.invoke(student);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("反射方法：" + (endTime - startTime) + "ms");
    }

    public static void test03() throws ClassNotFoundException, IllegalAccessException, InstantiationException, InvocationTargetException, NoSuchMethodException {
        Class  c = Class.forName("reflection.Student");
        Student student = (Student) c.newInstance();
        Method method = c.getMethod("getStudentNum");
        method.setAccessible(true);
        long startTime = System.currentTimeMillis();
        for (int i = 0; i <Integer.MAX_VALUE ; i++) {
            method.invoke(student);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("普通方法：" + (endTime - startTime) + "ms");
    }
}
