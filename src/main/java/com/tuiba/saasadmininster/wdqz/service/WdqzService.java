package com.tuiba.saasadmininster.wdqz.service;

import com.tuiba.saasadmininster.Exception.Results;
import com.tuiba.saasadmininster.entity.PageResult;
import com.tuiba.saasadmininster.wdqz.bean.Wdqz;

/**
 * @author : yangzhi
 * @date : 11:33 2019/10/17
 */
public interface WdqzService {

    /**
     *  保存信息
     * @param wdqz  实体
     */
    public Results saveWdqz(Wdqz wdqz);

    /**
     *  查询所有
     * @return
     */
    public Results findAllWdqz();

    /**
     * 根据id查询
     * @param wdqzId
     * @return
     */
    public Results findById(Integer wdqzId);

    /**
     *  根据用户id查询
     * @param userId
     * @return
     */
    public Results findByUserId(Integer userId);

    /**
     *  根据发帖时间查询
     * @param wdqzPublishTime
     * @return
     */
    public Results findByPublishTime(Long wdqzPublishTime);

    /**
     *  根据帖子状态查询
     * @param wdqzStatus
     * @return
     */
    public Results findByStatus(Integer wdqzStatus);

    /**
     *  帖子审核通过
     * @param wdqzId
     * @return
     */
    public Results auditWdqz(Integer wdqzId);

    /**
     *  帖子审核不通过
     * @param wdqzId
     * @return
     */
    public Results noAuditWdqz(Integer wdqzId);

    /**
     *  删除帖子
     * @param wdqzId
     * @return
     */
    public Results delWdqz(Integer[] wdqzId);

    /**
     *  帖子置顶
     * @param wdqzId
     * @return
     */
    public Results topWdqz(Integer wdqzId);


    /**
     *  帖子取消置顶
     * @param wdqzId
     * @return
     */
    public Results noTopWdqz(Integer wdqzId);

    /**
     * 根据置顶状态时间查询
     *
     * @param wdqzStatus
     * @return
     */
    public Results findStatus(Integer wdqzStatus);

    /**
     * 分页查询
     */
    public PageResult findPage(int page, int size);

}
