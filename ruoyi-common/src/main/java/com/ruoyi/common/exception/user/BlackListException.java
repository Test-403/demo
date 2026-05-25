package com.ruoyi.common.exception.user;

/**
 * é»‘åå•IPå¼‚å¸¸ç±?
 * 
 * @author ÄãµÄÃû×Ö
 */
public class BlackListException extends UserException
{
    private static final long serialVersionUID = 1L;

    public BlackListException()
    {
        super("login.blocked", null);
    }
}
