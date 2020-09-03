package cn.com.soframe.common.util;

import java.io.File;

/**
 * @author fujh
 * @sine 2020年9月3日10:47:20
 * 文件处理工具
 */
public class FileUtil {

    /**
     * 创建文件夹
     * @param folderPath
     */
    public static void createFolder(String folderPath){
        File file = new File(folderPath);
        if(!file.exists()){
            file.mkdir();
        }
    }

    /**
     * 创建文件夹
     * @param folderPath
     */
    public static void createFolders(String folderPath){
        File file = new File(folderPath);
        if(!file.exists()){
            file.mkdirs();
        }
    }
}
