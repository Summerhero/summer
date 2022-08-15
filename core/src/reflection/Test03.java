package reflection;

/**
 * @author summer
 * @create 2022-08-15 16:43
 * @Description
 */
public class Test03 {

    public static void main(String[] args) {
        A a = new A();
        System.out.println(a.num);
        B b = new B();
        System.out.println(b.num);
    }
}


class A{

    /**
     * 静态代码块
     */
    static {
        System.out.println("A: 静态代码快出初始化");
        num  = 100;
    }

    // 静态变量
    static int num = 10;

    /**
     * 无参构造
     */
   public A(){
       System.out.println("A: 无参构造器构造完成");
   }

}

class B{

    /**
     * 静态变量
     */
    static int num;

    /**
     * 静态代码块
     */
    static {
        System.out.println("B: 静态代码快出初始化");
        num  = 200;
    }

    /**
     * 无参构造
     */
    public B(){
        System.out.println("B: 无参构造器构造完成");
    }
}