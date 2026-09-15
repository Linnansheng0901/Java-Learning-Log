package com.example.filemanager;

import java.util.Scanner;


//整个程序的运行
public class Main {
    public static void main(String[] args){
        Menu menu = new Menu();

        Scanner sc = new Scanner(System.in);

        FileService fileService = new FileService();

        while (true) {

            int choice = menu.showMenu();

            switch (choice) {
                case 1:
                    //遍历指定文件名的目录
                    String path = menu.inputPath();
                    fileService.showFiles(path);
                    break;

                case 2:
                    //查看文件信息
                    path = menu.inputPath();
                    fileService.showFileInfo(path);
                    break;

                case 3:
                    //创建文件夹
                    path = menu.inputPath();
                    fileService.createDirectory(path);
                    break;

                case 4:
                    //创建文件
                    path = menu.inputPath();
                    fileService.createFile(path);

                    break;

                case 5:
                    //删除文件
                    path = menu.inputPath();
                    fileService.deleterFile(path);
                    break;

                case 6:
                    //复制文件
                    String source = menu.inputPath();
                    String target = menu.inputPath();
                    fileService.copyFile(source,target);
                    break;

                case 7:
                    System.out.println("程序退出");
                    return;

                default:
                    System.out.println("输入错误，请重新选择");
            }
        }
    }
}
