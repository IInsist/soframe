package cn.com.soframe.common.util;

import java.util.UUID;

/**
 * @author fujh
 * @since 2020年9月3日10:05:50
 *  字符串工具类
 */
public class StringUtil {

    /**
     * 获取UUID
     * @return
     */
    public static String getUuid(){
        //java.util.UUID自带UUID工具类
        UUID uuid = UUID.randomUUID();
        return uuid.toString().replace("-","").toLowerCase();
    }

    /**
     * 判断是否为空字符串
     * @param str
     * @return
     */
    public static boolean isEmpty(String str){
        return str==null || "".equals(str.trim()) ? true : false;
    }

    /**
     * 判断是否为空字符串
     * @param str
     * @return
     */
    public static boolean isNotEmpty(String str){
        return !StringUtil.isEmpty(str);
    }

}
