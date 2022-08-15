package reflection;

/**
 * @author summer
 * @create 2022-08-15 17:13
 * @Description 测试类什么时候会初始化
 */
public class Test04 {

    static {
        System.out.println("Main 方法所在类静态初始化");
    }


    public static void main(String[] args) throws ClassNotFoundException {

        // new 对象，主动引用
        // Son son = new Son();
        // System.out.println(son.s);

        // 该反射形式 - 主动引用，会初始化类
//         Class.forName("reflection.Son");
//         System.out.println("-------------0---------------");

        //此类形式不会发生初始化
        Class c = Son.class;
        System.out.println(c);
        System.out.println("-------------1---------------");

        System.out.println(Son.f);
        System.out.println("-------------2---------------");

        System.out.println(Son.s);
        System.out.println("-------------3---------------");

        System.out.println(Son.NUM);
        System.out.println("-------------4---------------");

        Son[] sons = new Son[3];



    }
}


class Father{

    static int f = 30;

    static {
        System.out.println("Father 被加载");
    }
}

class Son extends Father{

    static int s = 10;

    static final int NUM = 10;

    static {
        System.out.println("Son 被加载");
    }
}