package thread;

/**
 * @author summer
 * @create 2022-08-29 18:05
 * @Description 通过实现Runable接口实现多线程
 */
public class ThreadTest03 implements Runnable {





    @Override
    public void run() {
        System.out.println("ThreadTest03");
    }

    public static void main(String[] args) {

        Thread thread_1 = new Thread(new ThreadTest03());
        thread_1.start();

        Thread thread_2 = new Thread(new ThreadTest03());
        thread_2.start();

        System.out.println("main");
    }
}
