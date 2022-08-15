package reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * @author summer
 * @create 2022-08-15 18:19
 * @Description 反射获取类成员
 */
public class Test06 {

    public static void main(String[] args) throws ClassNotFoundException {

        Class c = Class.forName("reflection.Student");

        System.out.println("-----------------name------------------");
        // 获取类名 - 全类名
        System.out.println(c.getName());
        // 获取类名称
        System.out.println(c.getSimpleName());
        // 获取类型名称
        System.out.println(c.getTypeName());

        System.out.println("-----------------Field------------------");
        // 获取成员变量 - 非private
        Field[] fields = c.getFields();
        for (Field field:fields) {
            System.out.println(field);
        }
        // 获取全部成员变量
        fields = c.getDeclaredFields();
        for (Field field:fields) {
            System.out.println("__DeclaredFields = " + field);
        }

        System.out.println("-----------------Method------------------");
        // 获取方法 - 非private
        Method[] methods = c.getMethods();
        for (Method method:methods) {
            System.out.println(method);
        }
        methods = c.getDeclaredMethods();
        for (Method method:methods) {
            System.out.println("__DeclaredMethods = " + method);
        }

        System.out.println("-----------------Constructor------------------");
        // 获取构造器
        Constructor[] constructors = c.getConstructors();
        for (Constructor constructor:constructors) {
            System.out.println(constructor);
        }
        constructors = c.getDeclaredConstructors();
        for (Constructor constructor:constructors) {
            System.out.println("__DeclaredConstructors = " + constructor);
        }

    }
}
