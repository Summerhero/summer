package io.stream;

import java.io.*;

/**
 * @author summer
 * @create 2022-08-23 11:10
 * @Description 文件拷贝
 */
public class CopyFile {

    public static void main(String[] args) {
        CopyFile copyFile = new CopyFile();
        String source = "D:\\Project\\Java\\hello.txt";
        String destination = "D:\\Project\\hello.txt";
        copyFile.copy(source,destination);


    }


    /**
     * 文件拷贝
     * @param source    源文件
     * @param destination   目的路径
     */
    private boolean copy(String source,String destination){
        // 源文件是否存在
        if(!checkPath(source)){
            System.out.println("被复制文件路径错误：" + source);
            return false;
        }
        // 目的路径是否存在
        if(!checkPath(new File(destination).getParent())){
            System.out.println("目的路径错误：" + destination);
            return false;
        }
        // 构建拷贝后文件名 todo
        // 判断目的路径下是否已有同名文件  todo
        // 定时文件读取流
        FileInputStream inputStream = null;
        // 定义文件输出流
        FileOutputStream outputStream = null;
       // 文件拷贝操作
        try {
            inputStream = new FileInputStream(source);
            outputStream = new FileOutputStream(destination);
            // 文件读取缓存
            byte[] buffer = new byte[1024];
            // 读取长度
            int readLen ;
            while((readLen = inputStream.read(buffer))!= -1){
                outputStream.write(buffer,0,readLen);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                inputStream.close();
                outputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        // 文件拷贝处理
        return true;
    }

    /**
     * 判断路径是否存在
     * @param path  路径
     * @return  true 存在 反之不存在
     */
    private boolean checkPath(String path){
        return new File(path).exists();
    }

    /**
     * 删除文件
     * @param path  路径
     * @return  true 成功  false 失败
     */
    private boolean delete(String path){
        return new File(path).delete();

    }
}
