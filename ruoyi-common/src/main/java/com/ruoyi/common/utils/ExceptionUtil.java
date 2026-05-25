package com.ruoyi.common.utils;

import java.io.PrintWriter;
import java.io.StringWriter;
import org.apache.commons.lang3.exception.ExceptionUtils;

/**
 * é”™è¯¯ä¿¡æ¯å¤„ç†ç±»ã€?
 *
 * @author ÄãµÄÃû×Ö
 */
public class ExceptionUtil
{
    /**
     * è·å–exceptionçš„è¯¦ç»†é”™è¯¯ä¿¡æ¯ã€?
     */
    public static String getExceptionMessage(Throwable e)
    {
        StringWriter sw = new StringWriter();
        e.printStackTrace(new PrintWriter(sw, true));
        return sw.toString();
    }

    public static String getRootErrorMessage(Exception e)
    {
        Throwable root = ExceptionUtils.getRootCause(e);
        root = (root == null ? e : root);
        if (root == null)
        {
            return "";
        }
        String msg = root.getMessage();
        if (msg == null)
        {
            return "null";
        }
        return StringUtils.defaultString(msg);
    }
}
