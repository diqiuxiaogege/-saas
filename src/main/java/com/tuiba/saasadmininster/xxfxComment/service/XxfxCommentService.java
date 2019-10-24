package com.tuiba.saasadmininster.xxfxComment.service;

import com.tuiba.saasadmininster.Exception.Results;
import com.tuiba.saasadmininster.xxfxComment.bean.Xxfx_comment;

/**
 * @author : yangzhi
 * @date : 10:58 2019/10/18
 */
public interface XxfxCommentService {

    /**
     *  保存信息
     * @param xxfxComment  实体
     */
    public Results saveXxfxComment(Xxfx_comment xxfxComment);

    /**
     *  查询所有
     * @return
     */
    public Results findAllXxfx_comment();

    /**
     * 根据id查询
     * @param xxfxCommentId
     * @return
     */
    public Results findById(Integer xxfxCommentId);

    /**
     * 根据分享id查询
     * @param xxfxId
     * @return
     */
    public Results findByXxfxId(Integer xxfxId);

    /**
     *  根据用户id查询
     * @param userId
     * @return
     */
    public Results findByUserId(Integer userId);

    /**
     *  删除帖子
     * @param xxfxCommentId
     * @return
     */
    public Results delXxfxComment(Integer[] xxfxCommentId);

    /**
     * 审核通过
     * @param xxfxCommentId
     * @return
     */
    public Results auditXxfx_comment(Integer xxfxCommentId);

    /**
     * 审核不通过
     * @param xxfxCommentId
     * @return
     */
    public Results noAuditXxfx_comment(Integer xxfxCommentId);
}
