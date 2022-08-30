package thread;

/**
 * @author summer
 * @create 2022-08-17 18:39
 * @Description
 */
public class ThreadTest01 {

    public static void main(String[] args) {

        MyThread01 thread01 = new MyThread01();
        thread01.start();
        for (int i = 0; i < 20; i++) {
            System.out.println("I am main = " + i);
        }
    }

}

/**
 *  多线程实现方式一
 *  继承 Thread 类，重写 run 方法
 *  实例化后，通过调用start 方法开启线程
 */
class MyThread01 extends Thread{

    @Override
    public void run() {
        for (int i = 0; i < 20 ; i++) {
            System.out.println("I am threa = " + i);
        }
    }
}