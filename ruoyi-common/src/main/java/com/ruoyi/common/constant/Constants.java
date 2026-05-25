package com.ruoyi.common.constant;

import java.util.Locale;
import io.jsonwebtoken.Claims;

/**
 * 通用常量信息
 * 
 * @author �������
 */
public class Constants
{
    /**
     * UTF-8 字符�?
     */
    public static final String UTF8 = "UTF-8";

    /**
     * GBK 字符�?
     */
    public static final String GBK = "GBK";

    /**
     * 系统语言
     */
    public static final Locale DEFAULT_LOCALE = Locale.SIMPLIFIED_CHINESE;

    /**
     * www主域
     */
    public static final String WWW = "www.";

    /**
     * http请求
     */
    public static final String HTTP = "http://";

    /**
     * https请求
     */
    public static final String HTTPS = "https://";

    /**
     * 通用成功标识
     */
    public static final String SUCCESS = "0";

    /**
     * 通用失败标识
     */
    public static final String FAIL = "1";

    /**
     * 登录成功
     */
    public static final String LOGIN_SUCCESS = "Success";

    /**
     * 注销
     */
    public static final String LOGOUT = "Logout";

    /**
     * 注册
     */
    public static final String REGISTER = "Register";

    /**
     * 登录失败
     */
    public static final String LOGIN_FAIL = "Error";

    /**
     * 所有权限标�?
     */
    public static final String ALL_PERMISSION = "*:*:*";

    /**
     * 管理员角色权限标�?
     */
    public static final String SUPER_ADMIN = "admin";

    /**
     * 角色权限分隔�?
     */
    public static final String ROLE_DELIMITER = ",";

    /**
     * 权限标识分隔�?
     */
    public static final String PERMISSION_DELIMITER = ",";

    /**
     * 验证码有效期（分钟）
     */
    public static final Integer CAPTCHA_EXPIRATION = 2;

    /**
     * 令牌
     */
    public static final String TOKEN = "token";

    /**
     * 令牌前缀
     */
    public static final String TOKEN_PREFIX = "Bearer ";

    /**
     * 令牌前缀
     */
    public static final String LOGIN_USER_KEY = "login_user_key";

    /**
     * 用户ID
     */
    public static final String JWT_USERID = "userid";

    /**
     * 用户名称
     */
    public static final String JWT_USERNAME = Claims.SUBJECT;

    /**
     * 用户头像
     */
    public static final String JWT_AVATAR = "avatar";

    /**
     * 创建时间
     */
    public static final String JWT_CREATED = "created";

    /**
     * 用户权限
     */
    public static final String JWT_AUTHORITIES = "authorities";

    /**
     * 资源映射路径 前缀
     */
    public static final String RESOURCE_PREFIX = "/profile";

    /**
     * RMI 远程方法调用
     */
    public static final String LOOKUP_RMI = "rmi:";

    /**
     * LDAP 远程方法调用
     */
    public static final String LOOKUP_LDAP = "ldap:";

    /**
     * LDAPS 远程方法调用
     */
    public static final String LOOKUP_LDAPS = "ldaps:";

    /**
     * 自动识别json对象白名单配置（仅允许解析的包名，范围越小越安全�?
     */
    public static final String[] JSON_WHITELIST_STR = { "com.ruoyi" };

    /**
     * 部门相关常量
     */
    public static class Dept
    {
        /**
         * 全部数据权限
         */
        public static final String DATA_SCOPE_ALL = "1";

        /**
         * 自定数据权限
         */
        public static final String DATA_SCOPE_CUSTOM = "2";

        /**
         * 部门数据权限
         */
        public static final String DATA_SCOPE_DEPT = "3";

        /**
         * 部门及以下数据权�?
         */
        public static final String DATA_SCOPE_DEPT_AND_CHILD = "4";

        /**
         * 仅本人数据权�?
         */
        public static final String DATA_SCOPE_SELF = "5";
    }
}
