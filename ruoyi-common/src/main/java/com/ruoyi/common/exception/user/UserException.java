package com.ruoyi.common.exception.user;

import com.ruoyi.common.exception.base.BaseException;

/**
 * ç”¨æˆ·ä¿¡æ¯å¼‚å¸¸ç±?
 * 
 * @author ÄãµÄÃû×Ö
 */
public class UserException extends BaseException
{
    private static final long serialVersionUID = 1L;

    public UserException(String code, Object[] args)
    {
        super("user", code, args, null);
    }
}
