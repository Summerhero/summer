package thread;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author summer
 * @create 2022-08-29 18:07
 * @Description
 */
class CopyPicture {

    String source;
    String destination;

    public  CopyPicture(){}

    public  CopyPicture(String source,String destination){
        this.source = source;
        this.destination = destination;
    }


    /**
     * 文件复制操作
     */
    public void copy() {
        File sourceFile = new File(source);
        // 源文件检查
        if(!sourceFile.exists()){
            System.out.println("源文件不存在: "+ source);
        }
        // 目的路径检查
        File  destinationFile = new File(destination);
        // 源文件检查
        if(!destinationFile.exists()){
            System.out.println("目的路径不存在: "+ destinationFile);
        }
        // 定义字节读取流
        FileInputStream inputStream = null;
        // 定义字节输出流
        FileOutputStream outputStream = null;
        // 读取缓存数组
        byte[] buffer = new byte[1024];
        // 读取长度
        int readLen;
        try {
            inputStream = new FileInputStream(sourceFile);
            outputStream = new FileOutputStream(destination + "\\" + sourceFile.getName());
            while ((readLen = inputStream.read(buffer)) != -1) {
                outputStream.write(buffer,0,readLen);
            }
            System.out.println("sourceFile: " + sourceFile.getName() + "复制结束！");
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                inputStream.close();
                outputStream.close();
            }catch (IOException e) {
                e.printStackTrace();
            }

        }
    }
}
