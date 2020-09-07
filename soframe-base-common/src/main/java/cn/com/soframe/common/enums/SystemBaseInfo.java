package cn.com.soframe.common.enums;

import cn.com.soframe.common.constant.SoFrameSystemConstant;

/**
 * @author fujh
 * @since 2020年8月31日15:08:32
 * 系统基础枚举类信息
 */
public enum SystemBaseInfo {

    version1("1.0","SoFrame架构：基于SpringMVC、Spring、Mybatis-plus等集成开发的SpringBoot框架，团队1人。","现已集成Redis缓存，可通过cn.com.soframe.utils.RedisUtil进行调用");

    private static final String systemName = SoFrameSystemConstant.SYSTEM_NAME;
    private String version;
    private static final String author = SoFrameSystemConstant.SYSTEM_AUTHOR;
    private static final String phone = SoFrameSystemConstant.SYSTEM_AUTHOR_PHONE;
    private static final String email = SoFrameSystemConstant.SYSTEM_AUTHOR_EMAIL;
    private String content;
    private String remark;

    SystemBaseInfo(String version, String content, String remark) {
        this.version = version;
        this.content = content;
        this.remark = remark;
    }
}
