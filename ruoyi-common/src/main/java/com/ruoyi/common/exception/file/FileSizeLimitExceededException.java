package com.ruoyi.common.exception.file;

/**
 * æ–‡ä»¶åå¤§å°é™åˆ¶å¼‚å¸¸ç±»
 * 
 * @author ÄãµÄÃû×Ö
 */
public class FileSizeLimitExceededException extends FileException
{
    private static final long serialVersionUID = 1L;

    public FileSizeLimitExceededException(long defaultMaxSize)
    {
        super("upload.exceed.maxSize", new Object[] { defaultMaxSize });
    }
}
