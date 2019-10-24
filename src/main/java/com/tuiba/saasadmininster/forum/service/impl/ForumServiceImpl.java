package com.tuiba.saasadmininster.forum.service.impl;

import com.tuiba.saasadmininster.Exception.MyException;
import com.tuiba.saasadmininster.Exception.ResultEnum;
import com.tuiba.saasadmininster.Exception.ResultUtil;
import com.tuiba.saasadmininster.Exception.Results;
import com.tuiba.saasadmininster.forum.bean.Forum;
import com.tuiba.saasadmininster.forum.bean.ForumExample;
import com.tuiba.saasadmininster.forum.dao.ForumMapper;
import com.tuiba.saasadmininster.forum.service.ForumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * @author : yangzhi
 * @date : 14:40 2019/10/18
 */
@Service
public class ForumServiceImpl implements ForumService {

    @Autowired
    private ForumMapper forumMapper;

    /**
     * 保存信息
     *
     * @param forum
     */
    @Override
    public Results saveForum(Forum forum) {
      /*  Forum forum1 = new Forum();
        forum1.setForumName(forum.getForumName());      //求助版块名称
        forum1.setForumDate(new Date().getTime());      //添加时间
        forum1.setForumType(forum.getForumType());      //版块内容类型
        forum1.setProductId(forum.getProductId());      //产品id
        forum1.setForumModifyDate(forum.getForumModifyDate());      //上次修改时间
        forumMapper.insert(forum1);*/
        Integer forumId = forum.getForumId();
        Forum forum1 = forumMapper.selectByPrimaryKey(forumId);
        if (forum1 == null) {
            throw new MyException(ResultEnum.ERROR_POINTERNUll.getCode(), ResultEnum.ERROR_POINTERNUll.getMsg());
        }
        forum1.setForumName(forum.getForumName());      //求助版块名称
        forum1.setForumDate(new Date().getTime());      //添加时间
        forum1.setForumType(forum.getForumType());      //版块内容类型
        forum1.setProductId(forum.getProductId());      //产品id
        forum1.setForumModifyDate(forum.getForumModifyDate());      //上次修改时间
        forumMapper.updateByPrimaryKeySelective(forum1);
        return ResultUtil.successce(forum1);
    }

    /**
     * 查询所有
     *
     * @return
     */
    @Override
    public Results findAllForum() {
        List<Forum> forums = forumMapper.selectByExample(null);
        return ResultUtil.successce(forums);
    }

    /**
     * 根据id查询
     *
     * @param forumId
     * @return
     */
    @Override
    public Results findById(Integer forumId) {
        Forum forum = forumMapper.selectByPrimaryKey(forumId);
        if (forum == null) {
            throw new MyException(ResultEnum.ERROR_QUERYFILD.getCode(), ResultEnum.ERROR_QUERYFILD.getMsg());
        }
        return ResultUtil.successce(forum);
    }

    /**
     * 根据版块名称查询
     * @param forumName
     * @return
     */
    @Override
    public Results findByForumName(String forumName) {
        ForumExample forumExample = new ForumExample();
        forumExample.createCriteria().andForumNameEqualTo(forumName);
        List<Forum> forums = forumMapper.selectByExample(forumExample);
        if (forums == null) {
            throw new MyException(ResultEnum.ERROR_QUERYFILD.getCode(), ResultEnum.ERROR_QUERYFILD.getMsg());
        }
        return ResultUtil.successce(forums);
    }

    /**
     *  删除版块
     * @param forumId
     * @return
     */
    @Override
    public Results delFourm(Integer[] forumId) {
        for (int i = 0; i < forumId.length; i++) {
            Forum forum = forumMapper.selectByPrimaryKey(forumId[i]);
            if (forum == null) {
                throw new MyException(ResultEnum.ERROR_POINTERNUll.getCode(), ResultEnum.ERROR_POINTERNUll.getMsg());
            }
            forumMapper.deleteByPrimaryKey(forumId[i]);
        }
        return ResultUtil.success();
    }
}
