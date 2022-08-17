package reflection;


import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Map;

/**
 * @author summer
 * @create 2022-08-17 10:25
 * @Description
 */
public class Test08 {

    public static void main(String[] args) throws NoSuchMethodException {
        // 获取 class 对象
        Class c = GenericityTest.class;
        // 入参泛型测试
        testParamType(c);
        // 返回值入参测试
        testReturnType(c);

    }

    private static void testParamType(Class c) throws NoSuchMethodException {
        // 获取方法
       Method parmMethod = c.getMethod("setStudent",Map.class,List.class);
       // 获取参数泛型
        Type[] genericParameterTypes = parmMethod.getGenericParameterTypes();
        // 遍历参数泛型数组
        for (Type genericParameterType : genericParameterTypes) {
            System.out.println(genericParameterType);
            // 获取实际参数类型列表
            Type[] actualTypeArguments = ((ParameterizedType) genericParameterType).getActualTypeArguments();
            for (Type actualTypeArgument : actualTypeArguments) {
                System.out.println("------" + actualTypeArgument);
            }
        }
    }


    private static void testReturnType(Class c) throws NoSuchMethodException {
        // 获取方法
        Method retMethod = c.getMethod("getStudent");
        // 获取参数泛型
        Type genericReturnType = retMethod.getGenericReturnType();
        // 获取实际参数类型列表
        Type[] actualTypeArguments = ((ParameterizedType) genericReturnType).getActualTypeArguments();
        for (Type actualTypeArgument : actualTypeArguments) {
            System.out.println("======" + actualTypeArgument);
        }

    }

}


class GenericityTest{

        public Map<String,Student> getStudent(){
            System.out.println("getStudent------");
            return null;
        }

        public void setStudent(Map<String,Student> map, List<Son> list){
            System.out.println("setStudent------");
        }


}