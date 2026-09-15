package com.example.filemanager;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;


//文件服务
public class FileService {
    //1:查看目录
    public void showFiles(String path){
        File file = new File(path);
        File[] files = file.listFiles();
        if(files == null){
            System.out.println("路径不存在，或者该路径不是文件夹");
            return;
        }
        for(File f : files){
            System.out.println(f.getName());
        }
    }

    //2:查看文件信息
    public void showFileInfo(String path){
        File file = new File(path);
        if(!file.exists()){
            System.out.println("文件不存在");
            return;
        }
        System.out.println("文件名：" + file.getName());
        System.out.println("绝对路径：" + file.getAbsolutePath());
        System.out.println("是否是文件：" + file.isFile());
        System.out.println("是否是文件夹：" + file.isDirectory());
        System.out.println("文件大小：" + file.length() + " 字节");
    }

    //3.创建文件夹
    public void createDirectory(String path){
        File file = new File(path);
        boolean result = file.mkdir();
        if(result){
            System.out.println("文件夹创建成功");
        } else {
            System.out.println("文件夹创建失败");
        }
    }

    //4.创建文件
    public void createFile(String path){
        File file = new File(path);
        try{
            boolean result = file.createNewFile();
            if (result) {
                System.out.println("文件创建成功");
        }else{
            System.out.println("文件已经存在");
        }
    }catch(IOException e){
            System.out.println("文件创建失败");
        }
    }

    //5.删除文件
    public void deleterFile(String path){
        File file = new File(path);
        if(!file.exists()){
            System.out.println("文件不存在");
        }
        boolean result = file.delete();
        if(result){
            System.out.println("删除成功");
        }else{
            System.out.println("删除失败");
        }
    }

    //6.复制文件
    public void copyFile(String source,String target){
        try{
            FileInputStream fis = new FileInputStream(source);
            FileOutputStream fos = new FileOutputStream(target);

            byte[] buffer = new byte[1024];
            int len;
            while((len = fis.read(buffer)) != -1){
                fos.write(buffer,0,len);
            }
            fis.close();
            fos.close();
            System.out.println("文件复制成功");

        }catch(IOException e){
            System.out.println("文件复制失败");
        }
    }

}


