package com.ruoyi.common.utils;

/**
 * 脱敏工具�?
 *
 * @author �������
 */
public class DesensitizedUtil
{
    /**
     * 密码的全部字符都�?代替，比如：******
     *
     * @param password 密码
     * @return 脱敏后的密码
     */
    public static String password(String password)
    {
        if (StringUtils.isBlank(password))
        {
            return StringUtils.EMPTY;
        }
        return StringUtils.repeat('*', password.length());
    }

    /**
     * 车牌中间�?代替，如果是错误的车牌，不处�?
     *
     * @param carLicense 完整的车牌号
     * @return 脱敏后的车牌
     */
    public static String carLicense(String carLicense)
    {
        if (StringUtils.isBlank(carLicense))
        {
            return StringUtils.EMPTY;
        }
        // 普通车�?
        if (carLicense.length() == 7)
        {
            carLicense = StringUtils.hide(carLicense, 3, 6);
        }
        else if (carLicense.length() == 8)
        {
            // 新能源车�?
            carLicense = StringUtils.hide(carLicense, 3, 7);
        }
        return carLicense;
    }
}
