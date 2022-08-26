package io.stream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/**
 * @author summer
 * @create 2022-08-23 10:41
 * @Description
 */
public class MFileOutStream {

    public static void main(String[] args) {
        MFileOutStream outStream = new MFileOutStream();
        String filePath = "d:\\Project\\Java\\hello.txt";
        String content = "Hello World\nHello YW" ;
        outStream.write01(filePath,content);
    }

    private void write01(String  filePath,String content){
        // 参数校验
        // 定义文件写入流
        OutputStream outputStream = null;
        try {
            outputStream = new FileOutputStream(filePath);
            outputStream.write(content.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                outputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }


}
