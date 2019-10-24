package com.tuiba.saasadmininster.wdqzComment.service.impl;

import com.tuiba.saasadmininster.Exception.MyException;
import com.tuiba.saasadmininster.Exception.ResultEnum;
import com.tuiba.saasadmininster.Exception.ResultUtil;
import com.tuiba.saasadmininster.Exception.Results;
import com.tuiba.saasadmininster.wdqzComment.bean.Wdqz_comment;
import com.tuiba.saasadmininster.wdqzComment.bean.Wdqz_commentExample;
import com.tuiba.saasadmininster.wdqzComment.dao.Wdqz_commentMapper;
import com.tuiba.saasadmininster.wdqzComment.service.Wdqz_commentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * @author : yangzhi
 * @date : 20:49 2019/10/17
 */
@Service
public class Wdqz_commentServiceImpl implements Wdqz_commentService {

    @Autowired
    private Wdqz_commentMapper wdqz_commentMapper;

    /**
     * 保存信息
     *
     * @param wdqz_comment
     */
    @Override
    public Results saveWdqz_comment(Wdqz_comment wdqz_comment) {
/*        //创建实体
        Wdqz_comment wdqz_comment1 = new Wdqz_comment();
        wdqz_comment1.setUserId(wdqz_comment.getUserId());      //用户id
        wdqz_comment1.setWdqzId(wdqz_comment.getWdqzId());      //问答求助贴id
        wdqz_comment1.setWdqzCommentContent(wdqz_comment.getWdqzCommentContent());  //评论内容
        wdqz_comment1.setWqdzCommentDate(wdqz_comment.getWqdzCommentDate());        //评论时间
        wdqz_comment1.setWdqzCommentId(wdqz_comment.getWdqzCommentId());            //评论id
        wdqz_comment1.setWdqzCommentStatus(0);                  //审核状态*/
        Integer wdqzCommentId = wdqz_comment.getWdqzCommentId();
        Wdqz_comment wdqz_comment1 = wdqz_commentMapper.selectByPrimaryKey(wdqzCommentId);
        if (wdqz_comment1 == null) {
            throw new MyException(ResultEnum.ERROR_POINTERNUll.getCode(), ResultEnum.ERROR_POINTERNUll.getMsg());
        }
        wdqz_comment1.setWdqzCommentStatus(0);                           //审核状态
        wdqz_comment1.setWdqzCommentStatusTime(new Date().getTime());   //审核时间
        wdqz_commentMapper.updateByPrimaryKeySelective(wdqz_comment1);
        return ResultUtil.successce(wdqz_comment1);
    }

    /**
     * 查询所有
     *
     * @return
     */
    @Override
    public Results findAllWdqz_comment() {
        List<Wdqz_comment> wdqz_comments = wdqz_commentMapper.selectByExample(null);
        return ResultUtil.successce(wdqz_comments);
    }

    /**
     * 根据id查询
     *
     * @param wdqzCommentId
     * @return
     */
    @Override
    public Results findById(Integer wdqzCommentId) {
        Wdqz_comment wdqz_comment = wdqz_commentMapper.selectByPrimaryKey(wdqzCommentId);
        if (wdqz_comment == null) {
            throw new MyException(ResultEnum.ERROR_QUERYFILD.getCode(), ResultEnum.ERROR_QUERYFILD.getMsg());
        }
        return ResultUtil.successce(wdqz_comment);
    }

    /**
     * 根据评论时间查询
     *
     * @param wqdzCommentDate
     * @return
     */
    @Override
    public Results findByCommentDate(Long wqdzCommentDate) {
        Wdqz_commentExample wdqz_commentExample = new Wdqz_commentExample();
        Wdqz_commentExample.Criteria criteria = wdqz_commentExample.createCriteria();
        criteria.andWqdzCommentDateEqualTo(wqdzCommentDate);
        List<Wdqz_comment> wdqz_comments = wdqz_commentMapper.selectByExample(wdqz_commentExample);
        if (wdqz_comments.size() == 0) {
            throw new MyException(ResultEnum.ERROR_QUERYFILD.getCode(), ResultEnum.ERROR_QUERYFILD.getMsg());
        }
        return ResultUtil.successce(wdqz_comments);
    }

    /**
     * 根据用户id查询
     *
     * @param userId
     * @return
     */
    @Override
    public Results findByUserId(Integer userId) {
        Wdqz_commentExample wdqz_commentExample = new Wdqz_commentExample();
        Wdqz_commentExample.Criteria criteria = wdqz_commentExample.createCriteria();
        criteria.andUserIdEqualTo(userId);
        List<Wdqz_comment> wdqz_comments = wdqz_commentMapper.selectByExample(wdqz_commentExample);
        if (wdqz_comments.size() == 0) {
            throw new MyException(ResultEnum.ERROR_QUERYFILD.getCode(), ResultEnum.ERROR_QUERYFILD.getMsg());
        }
        return ResultUtil.successce(wdqz_comments);
    }

    /**
     * 审核通过
     *
     * @param wdqzCommentId
     * @return
     */
    @Override
    public Results auditWdqz_comment(Integer wdqzCommentId) {
        //通过id获取所有状态
        Wdqz_comment wdqz_comment = wdqz_commentMapper.selectByPrimaryKey(wdqzCommentId);
        if (wdqz_comment == null) {
            throw new MyException(ResultEnum.ERROR_QUERYFILD.getCode(), ResultEnum.ERROR_QUERYFILD.getMsg());
        }
        Integer wdqzCommentStatus = wdqz_comment.getWdqzCommentStatus();
        if (wdqzCommentStatus == 0) { //如果状态为0（待审核）修改为1（通过）并重新修改
            wdqz_comment.setWdqzCommentStatus(1);
            wdqz_comment.setWdqzCommentStatusTime(new Date().getTime());//审核通过时间
            wdqz_commentMapper.updateByPrimaryKeySelective(wdqz_comment);
        }
        return ResultUtil.successce(wdqz_comment);
    }

    /**
     * 审核不通过
     *
     * @param wdqzCommentId
     * @return
     */
    @Override
    public Results noAuditWdqz_comment(Integer wdqzCommentId) {
        //通过id获取所有问答求助状态
        Wdqz_comment wdqz_comment = wdqz_commentMapper.selectByPrimaryKey(wdqzCommentId);
        if (wdqz_comment == null) {
            throw new MyException(ResultEnum.ERROR_QUERYFILD.getCode(), ResultEnum.ERROR_QUERYFILD.getMsg());
        }
        Integer wdqzCommentStatus = wdqz_comment.getWdqzCommentStatus();
        if (wdqzCommentStatus == 0) { //如果状态为0（待审核）修改为2（不通过）并重新修改
            wdqz_comment.setWdqzCommentStatus(2);
            wdqz_comment.setWdqzCommentStatusTime(new Date().getTime());//审核不通过时间
            wdqz_commentMapper.updateByPrimaryKeySelective(wdqz_comment);
        }
        return ResultUtil.successce(wdqz_comment);
    }

    /**
     * 删除评论
     *
     * @param wdqzCommentId
     * @return
     */
    @Override
    public Results delWdqz_comment(Integer[] wdqzCommentId) {
        for (int i = 0; i < wdqzCommentId.length; i++) {
            Wdqz_comment wdqz_comment = wdqz_commentMapper.selectByPrimaryKey(wdqzCommentId[i]);
            if (wdqz_comment == null) {
                throw new MyException(ResultEnum.ERROR_POINTERNUll.getCode(), ResultEnum.ERROR_POINTERNUll.getMsg());
            }
            wdqz_commentMapper.deleteByPrimaryKey(wdqzCommentId[i]);
        }
        return ResultUtil.success();
    }
}