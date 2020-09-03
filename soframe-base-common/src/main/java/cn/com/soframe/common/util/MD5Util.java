package cn.com.soframe.common.util;

import org.springframework.util.DigestUtils;

/**
 * @author fujh
 * @since 2020年9月3日10:19:44
 * MD5加密工具
 *  加密采用了SpringBoot自带的 org.springframework.util.DigestUtils的加密工具。
 */
public class MD5Util {

    /**
     * MD5加盐：SOFRAME
     * 加盐目的为加大暴利破解加密
     */
    public static final String salt = "SOFRAME";

    /**
     * 获取MD5加密字符串
     * @return
     */
    public static String getMD5(String pwd){
        //加盐，混合加密
        pwd = pwd + MD5Util.salt;
        return DigestUtils.md5DigestAsHex(pwd.getBytes());
    }

    /**
     * 测试一下
     * @param args
     */
    public static void main(String[] args) {
        System.out.println(MD5Util.getMD5("123"));
        System.out.println(MD5Util.getMD5("234"));
    }
}
