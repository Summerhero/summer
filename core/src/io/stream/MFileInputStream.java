package io.stream;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/**
 * @author summer
 * @create 2022-08-23 10:15
 * @Description  文件读取
 */
public class MFileInputStream {

    public static void main(String[] args) {
        MFileInputStream inputStream = new MFileInputStream();
        inputStream.read01("d:\\Project\\Java\\hello.txt");
    }



    public void read01(String filePath){
        // 参数校验

        // 定义文件读取流对象
        InputStream inputStream = null;
        // 定义读取字符数
        int readData = 0;
        try {
            inputStream = new FileInputStream(filePath);
            while((readData = inputStream.read())!= -1){
                System.out.println("read:" + (char)inputStream.read());
                //System.out.println("readData:" + readData);
                //readData = inputStream.read();
            }
        }  catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                inputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
