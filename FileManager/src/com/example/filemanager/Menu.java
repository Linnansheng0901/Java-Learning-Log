package com.example.filemanager;
import java.util.Scanner;

//菜单、交互
public class Menu {

    private Scanner sc = new Scanner(System.in);
    public int showMenu(){

        System.out.println("====== 文件管理系统 ======");
        System.out.println("1. 查看当前目录");
        System.out.println("2. 查看文件");
        System.out.println("3. 创建文件夹");
        System.out.println("4. 创建文件");
        System.out.println("5. 删除文件");
        System.out.println("6. 复制文件");
        System.out.println("7. 退出");
        System.out.println("========================");
        System.out.print("请选择：");

        return sc.nextInt();
    }

    public String inputPath(){
        System.out.print("请输入路径：");
        return sc.next();
    }

}
