package com.ruoyi.common.exception.user;

/**
 * éªŒè¯ç é”™è¯¯å¼‚å¸¸ç±»
 * 
 * @author ÄãµÄÃû×Ö
 */
public class CaptchaException extends UserException
{
    private static final long serialVersionUID = 1L;

    public CaptchaException()
    {
        super("user.jcaptcha.error", null);
    }
}
