package io.file;

import java.io.File;
import java.io.IOException;

/**
 * @Author Summer
 * @Date 2022/8/20 22:02
 * @Version 1.0
 * @Descrption  file.delete 可删除文件亦可删除目录
 */
public class DoFile {
    public static void main(String[] args) {
        DoFile doFile = new DoFile();
        //doFile.delete("e:\\Projects\\hello_5.txt");
        //doFile.delete("hello_1.txt");
        //doFile.saveFile("e:\\Projects\\hello");
        //System.out.println(new File("e:\\Projects\\hello").isDirectory());
        //doFile.saveDirectory("e:\\Projects\\hello");
        //System.out.println(new File("e:\\Projects\\hello").isDirectory());
    }


    /**
     * 删除操作 文件若存在则删除，否则不操作
     * @param filePath  文件路径
     */
    private void delete(String filePath){
        File file = new File(filePath);
        if(file.exists()){
            System.out.println("filePath:" + filePath + ",存在，准备删除");
            if(file.delete()){
                System.out.println("filePath:" + filePath + "删除成功");
            }{
                System.out.println("filePath:" + filePath + "删除失败");
            }
        }else{
            System.out.println("filePath:" + filePath + "不存在");
        }
    }



    /**
     * 保存操作，文件若存在在显示存在，不存在则创建
     * @param filePath  文件路径
     */
    private void saveFile(String filePath){
        File file = new File(filePath);
        if(file.exists()){
            System.out.println("filePath:" + filePath + "存在");
        }else{
            System.out.println("filePath:" + filePath + "不存在,准备创建");
            try {
                file.createNewFile();
                System.out.println("filePath:" + filePath + "创建成功");
            } catch (IOException e) {
                System.out.println("filePath:" + filePath + "创建失败");
                e.printStackTrace();
            }
        }
    }

    /**
     * 保存操作，目录若存在在显示存在，不存在则创建
     * @param direct  目录
     */
    private void saveDirectory(String direct){
        File file = new File(direct);
        if(file.exists()){
            System.out.println("direct:" + direct + "存在");
        }else{
            System.out.println("direct:" + direct + "不存在,准备创建");
            file.mkdirs();
            System.out.println("direct:" + direct + "创建成功");
        }
    }

}
