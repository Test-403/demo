package com.ruoyi.common.exception.user;

/**
 * éªŒè¯ç å¤±æ•ˆå¼‚å¸¸ç±»
 * 
 * @author ÄãµÄÃû×Ö
 */
public class CaptchaExpireException extends UserException
{
    private static final long serialVersionUID = 1L;

    public CaptchaExpireException()
    {
        super("user.jcaptcha.expire", null);
    }
}
