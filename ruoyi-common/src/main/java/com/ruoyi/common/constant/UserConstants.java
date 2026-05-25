package com.ruoyi.common.constant;

/**
 * 用户常量信息
 * 
 * @author �������
 */
public class UserConstants
{
    /**
     * 平台内系统用户的唯一标志
     */
    public static final String SYS_USER = "SYS_USER";

    /** 正常状�?*/
    public static final String NORMAL = "0";

    /** 异常状�?*/
    public static final String EXCEPTION = "1";

    /** 用户封禁状�?*/
    public static final String USER_DISABLE = "1";

    /** 角色正常状�?*/
    public static final String ROLE_NORMAL = "0";

    /** 角色封禁状�?*/
    public static final String ROLE_DISABLE = "1";

    /** 部门正常状�?*/
    public static final String DEPT_NORMAL = "0";

    /** 部门停用状�?*/
    public static final String DEPT_DISABLE = "1";

    /** 字典正常状�?*/
    public static final String DICT_NORMAL = "0";

    /** 是否为系统默认（是） */
    public static final String YES = "Y";

    /** 是否菜单外链（是�?*/
    public static final String YES_FRAME = "0";

    /** 是否菜单外链（否�?*/
    public static final String NO_FRAME = "1";

    /** 菜单类型（目录） */
    public static final String TYPE_DIR = "M";

    /** 菜单类型（菜单） */
    public static final String TYPE_MENU = "C";

    /** 菜单类型（按钮） */
    public static final String TYPE_BUTTON = "F";

    /** Layout组件标识 */
    public final static String LAYOUT = "Layout";
    
    /** ParentView组件标识 */
    public final static String PARENT_VIEW = "ParentView";

    /** InnerLink组件标识 */
    public final static String INNER_LINK = "InnerLink";

    /** 校验是否唯一的返回标�?*/
    public final static boolean UNIQUE = true;
    public final static boolean NOT_UNIQUE = false;

    /**
     * 用户名长度限�?
     */
    public static final int USERNAME_MIN_LENGTH = 2;
    public static final int USERNAME_MAX_LENGTH = 20;

    /**
     * 密码长度限制
     */
    public static final int PASSWORD_MIN_LENGTH = 5;
    public static final int PASSWORD_MAX_LENGTH = 20;
}
