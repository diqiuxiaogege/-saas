package com.tuiba.saasadmininster.wdqzComment.service;

import com.tuiba.saasadmininster.Exception.Results;
import com.tuiba.saasadmininster.wdqzComment.bean.Wdqz_comment;

/**
 * @author : yangzhi
 * @date : 20:48 2019/10/17
 */
public interface Wdqz_commentService {

    /**
     * 保存信息
     * @param wdqz_comment
     */
    public Results saveWdqz_comment(Wdqz_comment wdqz_comment);

    /**
     * 查询所有
     * @return
     */
    public Results findAllWdqz_comment();

    /**
     * 根据id查询
     * @param wdqzCommentId
     * @return
     */
    public Results findById(Integer wdqzCommentId);

    /**
     *  根据评论时间查询
     * @param wqdzCommentDate
     * @return
     */
    public Results findByCommentDate(Long wqdzCommentDate);

    /**
     * 根据用户id查询
     * @param userId
     * @return
     */
    public Results findByUserId(Integer userId);

    /**
     * 审核通过
     * @param wdqzCommentId
     * @return
     */
    public Results auditWdqz_comment(Integer wdqzCommentId);

    /**
     * 审核不通过
     * @param wdqzCommentId
     * @return
     */
    public Results noAuditWdqz_comment(Integer wdqzCommentId);

    /**
     *  删除评论
     * @param wdqzCommentId
     * @return
     */
    public Results delWdqz_comment(Integer[] wdqzCommentId);
}
