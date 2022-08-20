package io.file;

import java.io.File;
import java.io.IOException;

/**
 * @Author Summer
 * @Date 2022/8/20 21:15
 * @Version 1.0
 * @Descrption  创建文件
 *              方法一与方法二的最终生成文件目录必须真实存在
 */
public class CreateFile {

    public static void main(String[] args) {
        CreateFile createFile = new CreateFile();
        // 文件名称，生成在当前目录下
        //createFile.create01("hello_1.txt");
        //System.out.println(new File("hello_1.txt").isAbsolute());
        // 文件全路径
        //createFile.create01("e:\\Projects\\hello_2.txt");
        //目录 + 文件名
        //createFile.create02("e:\\Projects","hello_3.txt");
        // 上级目录 + 目录\\文件名你
        //createFile.create02("e:\\Projects","IDEA\\hello_4.txt");
        //File parentFile = new File("e:\\Projects");
        // 父文件 + 带创建文件名
        //createFile.create03(parentFile,"hello_5.txt");
        // 父文件 + 带创建文件路径
        //createFile.create03(parentFile,"IDEA\\hello_6.txt");

    }


    /**
     *  创建文件
     * @param filePath  文件路径
     */
    private void create01(String filePath){
        // 仅仅是一个文件对象而已，此刻并未创建文件
        File file = new File(filePath);
        try {
            // 创建文件的动作
            file.createNewFile();
            System.out.println("file: " + filePath + "创建成功");
        } catch (IOException e) {
            System.out.println("file: " + filePath + "创建失败");
            e.printStackTrace();
        }
    }


    /**
     *  创建文件
     * @param parentPath    上/父级路径
     * @param filePath  文件路径
     */
    private void create02(String parentPath,String filePath){
        // 仅仅是一个文件对象而已，此刻并未创建文件
        File file = new File(parentPath,filePath);
        try {
            // 创建文件的动作
            file.createNewFile();
            System.out.println("parent path: "+ parentPath + ",file: " + filePath + "创建成功");
        } catch (IOException e) {
            System.out.println("parent path: "+ parentPath + ",file: " + filePath + "创建失败");
            e.printStackTrace();
        }
    }


    /**
     * 创建文件 注，此时parentFile 只能是目录不能是文件
     * @param parentFile    父亲文件
     * @param filePath      文件路径
     */
    private void create03(File parentFile,String filePath){
        // 实例化待创建文件对象
        File file = new File(parentFile,filePath);
        try {
            file.createNewFile();
            System.out.println("parent file: "+ parentFile + ",file: " + filePath + "创建成功");
        } catch (IOException e) {
            System.out.println("parent file: "+ parentFile + ",file: " + filePath + "创建失败");
            e.printStackTrace();
        }

    }


}
