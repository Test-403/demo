package com.ruoyi.system.mapper;

import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;
import com.ruoyi.system.domain.SysNotice;
import com.ruoyi.system.domain.SysNoticeRead;

/**
 * 公告已读记录 数据�?
 *
 * @author �������
 */
public interface SysNoticeReadMapper
{
    /**
     * 新增已读记录（忽略重复）
     *
     * @param noticeRead 已读记录
     * @return 结果
     */
    public int insertNoticeRead(SysNoticeRead noticeRead);

    /**
     * 查询某用户未读公告数�?
     *
     * @param userId 用户ID
     * @return 未读数量
     */
    public int selectUnreadCount(@Param("userId") Long userId);

    /**
     * 查询某用户是否已读某公告
     *
     * @param noticeId 公告ID
     * @param userId   用户ID
     * @return 已读记录数（0未读 1已读�?
     */
    public int selectIsRead(@Param("noticeId") Long noticeId, @Param("userId") Long userId);

    /**
     * 批量标记已读
     *
     * @param userId    用户ID
     * @param noticeIds 公告ID数组
     * @return 结果
     */
    public int insertNoticeReadBatch(@Param("userId") Long userId, @Param("noticeIds") Long[] noticeIds);

    /**
     * 查询带已读状态的公告列表（SQL层限制条数，一次查询完成）
     *
     * @param userId 用户ID
     * @param limit  最多返回条�?
     * @return �?isRead 标记的公告列�?
     */
    public List<SysNotice> selectNoticeListWithReadStatus(@Param("userId") Long userId, @Param("limit") int limit);

    /**
     * 查询已阅读某公告的用户列�?
     *
     * @param noticeId 公告ID
     * @param searchValue 搜索�?
     * @return 已读用户列表
     */
    public List<Map<String, Object>> selectReadUsersByNoticeId(@Param("noticeId") Long noticeId, @Param("searchValue") String searchValue);

    /**
     * 公告删除时清理对应已读记�?
     *
     * @param noticeIds 公告ID数组
     * @return 结果
     */
    public int deleteByNoticeIds(@Param("noticeIds") Long[] noticeIds);
}
