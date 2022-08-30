package thread;

import java.io.*;

/**
 * @author summer
 * @create 2022-08-17 19:19
 * @Description
 */
public class ThreadTest02 extends Thread {

    public static void main(String[] args) throws IOException {
        ThreadTest02 thread01 = new ThreadTest02( new CopyPicture("D:\\Project\\Java\\1.png","D:\\Project\\java\\copy"));
        ThreadTest02 thread02 = new ThreadTest02( new CopyPicture("D:\\Project\\Java\\2.png","D:\\Project\\java\\copy"));
        ThreadTest02 thread03 = new ThreadTest02( new CopyPicture("D:\\Project\\Java\\3.png","D:\\Project\\java\\copy"));
        thread01.start();
        thread02.start();
        thread03.start();
    }

    /**
     * 属性,图片复制类
     */
    CopyPicture copyPicture;

    /**
     * 无参构造
     */
    public ThreadTest02(){}

    /**
     * 带参构造
     * @param copyPicture   复制图片类
     */
    public ThreadTest02(CopyPicture copyPicture){
        this.copyPicture = copyPicture;
    }

    @Override
    public void run() {
        copyPicture.copy();
    }
}

