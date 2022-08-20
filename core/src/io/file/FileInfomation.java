package io.file;

import java.io.File;

/**
 * @Author Summer
 * @Date 2022/8/20 21:49
 * @Version 1.0
 * @Descrption  获取文件信息
 */
public class FileInfomation {
    public static void main(String[] args) {
        File file = new File("e:\\Projects\\hello_5.txt");
        FileInfomation fileInfomation = new FileInfomation();
        fileInfomation.info(file);
    }

    /**
     * 获取文件信息
     * @param file  文件
     */
    private void info(File file){
        // 文件是否存在
        System.out.println(file.exists());
        // 获取文件名称
        System.out.println(file.getName());
        // 获取绝对文件？
        System.out.println(file.getAbsoluteFile());
        // 获取文件绝对路径
        System.out.println(file.getAbsolutePath());
        // 获取文件父目录
        System.out.println(file.getParent());
        // file 对象 实例化时，构造入参是否是绝对路径
        System.out.println(file.isAbsolute());
    }
}
