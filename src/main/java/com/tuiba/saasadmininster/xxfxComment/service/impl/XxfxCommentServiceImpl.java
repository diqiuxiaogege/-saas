package com.tuiba.saasadmininster.xxfxComment.service.impl;

import com.tuiba.saasadmininster.Exception.MyException;
import com.tuiba.saasadmininster.Exception.ResultEnum;
import com.tuiba.saasadmininster.Exception.ResultUtil;
import com.tuiba.saasadmininster.Exception.Results;
import com.tuiba.saasadmininster.xxfxComment.bean.Xxfx_comment;
import com.tuiba.saasadmininster.xxfxComment.bean.Xxfx_commentExample;
import com.tuiba.saasadmininster.xxfxComment.dao.Xxfx_commentMapper;
import com.tuiba.saasadmininster.xxfxComment.service.XxfxCommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * @author : yangzhi
 * @date : 11:01 2019/10/18
 */
@Service
public class XxfxCommentServiceImpl implements XxfxCommentService {

    @Autowired
    private Xxfx_commentMapper xxfx_commentMapper;

    /**
     * 保存信息
     *
     * @param xxfxComment 实体
     */
    @Override
    public Results saveXxfxComment(Xxfx_comment xxfxComment) {
        Integer xxfxCommentId = xxfxComment.getXxfxCommentId();
        Xxfx_comment xxfx_comment = xxfx_commentMapper.selectByPrimaryKey(xxfxCommentId);
        if (xxfx_comment == null) {
            throw new MyException(ResultEnum.ERROR_POINTERNUll.getCode(), ResultEnum.ERROR_POINTERNUll.getMsg());
        }
        xxfx_comment.setUserId(xxfxComment.getUserId());    //用户id
        xxfx_comment.setXxfxId(xxfxComment.getXxfxId());    //学习分享id
        xxfx_comment.setXxfxCommentContent(xxfxComment.getXxfxCommentContent());    //内容
        xxfx_comment.setXxfxCommentTypeId(xxfxComment.getXxfxCommentTypeId());      //评论回复id
        xxfx_comment.setXxfxCommentDate(xxfxComment.getXxfxCommentDate());          //分享学习评论时间
        xxfx_comment.setXxfxCommentStatus(0);               //审核状态
        xxfx_commentMapper.updateByPrimaryKeySelective(xxfx_comment);
        return ResultUtil.successce(xxfx_comment);
    }

    /**
     * 查询所有
     *
     * @return
     */
    @Override
    public Results findAllXxfx_comment() {
        List<Xxfx_comment> xxfx_comments = xxfx_commentMapper.selectByExample(null);
        return ResultUtil.successce(xxfx_comments);
    }

    /**
     * 根据id查询
     *
     * @param xxfxCommentId
     * @return
     */
    @Override
    public Results findById(Integer xxfxCommentId) {
        Xxfx_comment xxfx_comment = xxfx_commentMapper.selectByPrimaryKey(xxfxCommentId);
        if (xxfx_comment == null) {
            throw new MyException(ResultEnum.ERROR_QUERYFILD.getCode(), ResultEnum.ERROR_QUERYFILD.getMsg());
        }
        return ResultUtil.successce(xxfx_comment);
    }

    /**
     * 根据分享id查询
     *
     * @param xxfxId
     * @return
     */
    @Override
    public Results findByXxfxId(Integer xxfxId) {
        Xxfx_commentExample xxfx_commentExample = new Xxfx_commentExample();
        Xxfx_commentExample.Criteria criteria = xxfx_commentExample.createCriteria();
        criteria.andXxfxIdEqualTo(xxfxId);
        List<Xxfx_comment> xxfx_comments = xxfx_commentMapper.selectByExample(xxfx_commentExample);
        if (xxfx_comments.size() == 0) {
            throw new MyException(ResultEnum.ERROR_QUERYFILD.getCode(), ResultEnum.ERROR_QUERYFILD.getMsg());
        }
        return ResultUtil.successce(xxfx_comments);
    }

    /**
     * 根据用户id查询
     *
     * @param userId
     * @return
     */
    @Override
    public Results findByUserId(Integer userId) {
        Xxfx_commentExample xxfx_commentExample = new Xxfx_commentExample();
        Xxfx_commentExample.Criteria criteria = xxfx_commentExample.createCriteria();
        criteria.andUserIdEqualTo(userId);
        List<Xxfx_comment> xxfx_comments = xxfx_commentMapper.selectByExample(xxfx_commentExample);
        if (xxfx_comments.size() == 0) {
            throw new MyException(ResultEnum.ERROR_QUERYFILD.getCode(), ResultEnum.ERROR_QUERYFILD.getMsg());
        }
        return ResultUtil.successce(xxfx_comments);
    }

    /**
     * 删除评论
     *
     * @param xxfxCommentId
     * @return
     */
    @Override
    public Results delXxfxComment(Integer[] xxfxCommentId) {
        for (int i = 0; i < xxfxCommentId.length; i++) {
            Xxfx_comment xxfx_comment = xxfx_commentMapper.selectByPrimaryKey(xxfxCommentId[i]);
            if (xxfx_comment == null) {
                throw new MyException(ResultEnum.ERROR_POINTERNUll.getCode(), ResultEnum.ERROR_POINTERNUll.getMsg());
            }
            xxfx_commentMapper.deleteByPrimaryKey(xxfxCommentId[i]);
        }
        return ResultUtil.success();
    }


    /**
     * 审核通过
     *
     * @param xxfxCommentId
     * @return
     */
    @Override
    public Results auditXxfx_comment(Integer xxfxCommentId) {
        //通过id获取所有状态
        Xxfx_comment xxfx_comment = xxfx_commentMapper.selectByPrimaryKey(xxfxCommentId);
        if (xxfx_comment == null) {
            throw new MyException(ResultEnum.ERROR_QUERYFILD.getCode(), ResultEnum.ERROR_QUERYFILD.getMsg());
        }
        Integer xxfxCommentStatus = xxfx_comment.getXxfxCommentStatus();
        if (xxfxCommentStatus == 0) { //如果状态为0（待审核）修改为1（通过）并重新修改
            xxfx_comment.setXxfxCommentStatus(1);
            xxfx_comment.setXxfxCommentStatusTime(new Date().getTime());//审核通过时间
            xxfx_commentMapper.updateByPrimaryKeySelective(xxfx_comment);
        }
        return ResultUtil.successce(xxfx_comment);
    }

    /**
     * 审核不通过
     *
     * @param xxfxCommentId
     * @return
     */
    @Override
    public Results noAuditXxfx_comment(Integer xxfxCommentId) {
        //通过id获取所有状态
        Xxfx_comment xxfx_comment = xxfx_commentMapper.selectByPrimaryKey(xxfxCommentId);
        if (xxfx_comment == null) {
            throw new MyException(ResultEnum.ERROR_QUERYFILD.getCode(), ResultEnum.ERROR_QUERYFILD.getMsg());
        }
        Integer xxfxCommentStatus = xxfx_comment.getXxfxCommentStatus();
        if (xxfxCommentStatus == 0) { //如果状态为0（待审核）修改为2（不通过）并重新修改
            xxfx_comment.setXxfxCommentStatus(2);
            xxfx_comment.setXxfxCommentStatusTime(new Date().getTime());//审核时间
            xxfx_commentMapper.updateByPrimaryKeySelective(xxfx_comment);
        }
        return ResultUtil.successce(xxfx_comment);
    }
}
