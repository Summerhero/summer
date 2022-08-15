package reflection;

/**
 * @author summer
 * @create 2022-08-15 17:45
 * @Description 类加载器
 */
public class Test05 {
    public static void main(String[] args) throws ClassNotFoundException {

        // 获取系统类加载器
        ClassLoader loader = ClassLoader.getSystemClassLoader();
        System.out.println(loader);

        // 获取系统类加载器的父加载器 - 扩展类加载器
        ClassLoader expLoader = loader.getParent();
        System.out.println(expLoader);

        // 获取扩展类加载器的父加载器 - 根加载器
        ClassLoader rootLoader = expLoader.getParent();
        System.out.println(rootLoader);

        // 获取当前类的类加载器
        System.out.println(Class.forName("reflection.Test05").getClassLoader());

        // 获取核心类库的类加载器
        System.out.println(Class.forName("java.lang.String").getClassLoader());

        // 获取系统类加载可以加载的路径
        System.out.println(System.getProperty("java.class.path"));
        /*
        D:\Java\jdk1.8.0_251\jre\lib\charsets.jar;
        D:\Java\jdk1.8.0_251\jre\lib\deploy.jar;
        D:\Java\jdk1.8.0_251\jre\lib\ext\access-bridge-64.jar;
        D:\Java\jdk1.8.0_251\jre\lib\ext\cldrdata.jar;
        D:\Java\jdk1.8.0_251\jre\lib\ext\dnsns.jar;
        D:\Java\jdk1.8.0_251\jre\lib\ext\jaccess.jar;
        D:\Java\jdk1.8.0_251\jre\lib\ext\jfxrt.jar;
        D:\Java\jdk1.8.0_251\jre\lib\ext\localedata.jar;
        D:\Java\jdk1.8.0_251\jre\lib\ext\nashorn.jar;
        D:\Java\jdk1.8.0_251\jre\lib\ext\sunec.jar;
        D:\Java\jdk1.8.0_251\jre\lib\ext\sunjce_provider.jar;
        D:\Java\jdk1.8.0_251\jre\lib\ext\sunmscapi.jar;
        D:\Java\jdk1.8.0_251\jre\lib\ext\sunpkcs11.jar;
        D:\Java\jdk1.8.0_251\jre\lib\ext\zipfs.jar;
        D:\Java\jdk1.8.0_251\jre\lib\javaws.jar;
        D:\Java\jdk1.8.0_251\jre\lib\jce.jar;
        D:\Java\jdk1.8.0_251\jre\lib\jfr.jar;
        D:\Java\jdk1.8.0_251\jre\lib\jfxswt.jar;
        D:\Java\jdk1.8.0_251\jre\lib\jsse.jar;
        D:\Java\jdk1.8.0_251\jre\lib\management-agent.jar;
        D:\Java\jdk1.8.0_251\jre\lib\plugin.jar
        ;D:\Java\jdk1.8.0_251\jre\lib\resources.jar;
        D:\Java\jdk1.8.0_251\jre\lib\rt.jar;
        D:\Project\Java\summer\out\production\core;
        D:\software\develop\IDEA\IntelliJ IDEA 2018.2.8\lib\idea_rt.jar

         */

        // 双亲委派机制
    }
}
