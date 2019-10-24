package com.tuiba.saasadmininster.forum.service;

import com.tuiba.saasadmininster.Exception.Results;
import com.tuiba.saasadmininster.forum.bean.Forum;

/**
 * @author : yangzhi
 * @date : 14:38 2019/10/18
 */
public interface ForumService {

    /**
     * 保存信息
     * @param forum
     */
    public Results saveForum(Forum forum);

    /**
     *  查询所有
     * @return
     */
    public Results findAllForum();

    /**
     * 根据id查询
     * @param forumId
     * @return
     */
    public Results findById(Integer forumId);

    /**
     * 根据版块名称查询
     * @param forumName
     * @return
     */
    public Results findByForumName(String forumName);

    /**
     *  删除版块
     * @param forumId
     * @return
     */
    public Results delFourm(Integer[] forumId);
}
