package com.tuiba.saasadmininster.xxfx.service;

import com.tuiba.saasadmininster.Exception.Results;
import com.tuiba.saasadmininster.entity.PageResult;
import com.tuiba.saasadmininster.xxfx.bean.Xxfx;

/**
 * @author : yangzhi
 * @date : 9:47 2019/10/18
 */
public interface XxfxService {

    /**
     * 保存信息
     * @param xxfx
     */
    public Results saveXxfx(Xxfx xxfx);

    /**
     *  查询所有
     * @return
     */
    public Results findAllXxfx();

    /**
     * 根据id查询
     * @param xxfxId
     * @return
     */
    public Results findById(Integer xxfxId);

    /**
     *  根据用户id查询s
     * @param userId
     * @return
     */
    public Results findByUserId(Integer userId);

    /**
     *  根据子版块id查询
     * @param forumId
     * @return
     */
    public Results findByForumId(Integer forumId);

    /**
     *  根据发帖时间查询
     * @param xxfxTime
     * @return
     */
    public Results findByXxfxTime(Long xxfxTime);

    /**
     *  根据帖子状态查询
     * @param xxfxStatus
     * @return
     */
    public Results findByXxfxStatus(Integer xxfxStatus);

    /**
     *  帖子审核通过
     * @param xxfxId
     * @return
     */
    public Results auditXxfx(Integer xxfxId);

    /**
     *  帖子审核通过
     * @param xxfxId
     * @return
     */
    public Results noAuditXxfx(Integer xxfxId);

    /**
     *  删除帖子
     * @param xxfxId
     * @return
     */
    public Results delXxfx(Integer[] xxfxId);

    /**
     *  帖子置顶
     * @param xxfxId
     * @return
     */
    public Results topXxfx(Integer xxfxId);

    /**
     *  帖子取消置顶
     * @param xxfxId
     * @return
     */
    public Results noTopXxfx(Integer xxfxId);

    /**
     * 根据置顶状态时间查询
     *
     * @param xxfxStatus
     * @return
     */
    public Results findAllStatus(Integer xxfxStatus);

    /**
     * 分页查询
     */
    public PageResult findPage(int page, int size);

}
