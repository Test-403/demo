package com.ruoyi.common.enums;

/**
 * ç”¨æˆ·çŠ¶æ€?
 * 
 * @author ÄãµÄÃû×Ö
 */
public enum UserStatus
{
    OK("0", "æ­£å¸¸"), DISABLE("1", "åœç”¨"), DELETED("2", "åˆ é™¤");

    private final String code;
    private final String info;

    UserStatus(String code, String info)
    {
        this.code = code;
        this.info = info;
    }

    public String getCode()
    {
        return code;
    }

    public String getInfo()
    {
        return info;
    }
}
