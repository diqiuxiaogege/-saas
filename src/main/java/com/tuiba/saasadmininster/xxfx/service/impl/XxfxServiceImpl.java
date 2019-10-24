package com.tuiba.saasadmininster.xxfx.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.tuiba.saasadmininster.Exception.MyException;
import com.tuiba.saasadmininster.Exception.ResultEnum;
import com.tuiba.saasadmininster.Exception.ResultUtil;
import com.tuiba.saasadmininster.Exception.Results;
import com.tuiba.saasadmininster.entity.PageResult;
import com.tuiba.saasadmininster.xxfx.bean.Xxfx;
import com.tuiba.saasadmininster.xxfx.bean.XxfxExample;
import com.tuiba.saasadmininster.xxfx.dao.XxfxMapper;
import com.tuiba.saasadmininster.xxfx.service.XxfxService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * @author : yangzhi
 * @date : 9:48 2019/10/18
 */
@Service
public class XxfxServiceImpl implements XxfxService {

    @Autowired
    private XxfxMapper xxfxMapper;

    /**
     * 保存信息
     * @param xxfx
     */
    @Override
    public Results saveXxfx(Xxfx xxfx) {
       /* Xxfx xxfx1 = new Xxfx();
        xxfx1.setUserId(xxfx.getUserId());      //用户id
        xxfx1.setForumId(xxfx.getForumId());    //问答求助版块id
        xxfx1.setXxfxTitle(xxfx.getXxfxTitle());//标题
        xxfx1.setXxfxContent(xxfx.getXxfxContent());//内容
        xxfx1.setXxfxProductType(xxfx.getXxfxProductType());//产品分类
        xxfx1.setXxfxDianzan(xxfx.getXxfxDianzan());        //点赞数
        xxfx1.setXxfxTime(xxfx.getXxfxTime());              //发帖时间
        xxfx1.setXxfxModifyTime(xxfx.getXxfxModifyTime());  //审核时间
        xxfx1.setXxfxStatus(0);                             //审核状态
        xxfxMapper.insert(xxfx1);*/
        Integer xxfxId = xxfx.getXxfxId();
        Xxfx xxfx1 = xxfxMapper.selectByPrimaryKey(xxfxId);
        if (xxfx1==null){
            throw new MyException(ResultEnum.ERROR_POINTERNUll.getCode(), ResultEnum.ERROR_POINTERNUll.getMsg());
        }
        xxfx1.setForumId(xxfx.getForumId());    //问答求助版块id
        xxfx1.setXxfxTitle(xxfx.getXxfxTitle());//标题
        xxfx1.setXxfxContent(xxfx.getXxfxContent());//内容
        xxfx1.setXxfxProductType(xxfx.getXxfxProductType());//产品分类
        xxfx1.setXxfxDianzan(xxfx.getXxfxDianzan());        //点赞数
        xxfx1.setXxfxTime(xxfx.getXxfxTime());              //发帖时间
        xxfx1.setXxfxModifyTime(xxfx.getXxfxModifyTime());  //审核时间
        xxfx1.setXxfxStatus(0);                             //审核状态
        xxfxMapper.updateByPrimaryKeySelective(xxfx1);
        return ResultUtil.successce(xxfx1);
    }

    /**
     *  查询所有
     * @return
     */
    @Override
    public Results findAllXxfx() {
        //获取实体对象并创建集合
        List<Xxfx> xxfxList = xxfxMapper.selectByExample(null);
        return ResultUtil.successce(xxfxList);
    }

    /**
     * 根据id查询
     * @param xxfxId
     * @return
     */
    @Override
    public Results findById(Integer xxfxId) {
        Xxfx xxfxList = xxfxMapper.selectByPrimaryKey(xxfxId);
        if (xxfxList == null) {
            throw new MyException(ResultEnum.ERROR_POINTERNUll.getCode(), ResultEnum.ERROR_POINTERNUll.getMsg());
        }
        return ResultUtil.successce(xxfxList);
    }

    /**
     * 根据用户id查询
     * @param userId
     * @return
     */
    @Override
    public Results findByUserId(Integer userId) {
        XxfxExample xxfxExample = new XxfxExample();
        XxfxExample.Criteria criteria = xxfxExample.createCriteria();
        criteria.andUserIdEqualTo(userId);
        List<Xxfx> xxfxes = xxfxMapper.selectByExample(xxfxExample);
        if (xxfxes.size() == 0) {
            throw new MyException(ResultEnum.ERROR_POINTERNUll.getCode(), ResultEnum.ERROR_POINTERNUll.getMsg());
        }
        return ResultUtil.successce(xxfxes);
    }

    /**
     * 根据子版块id查询
     * @param forumId
     * @return
     */
    @Override
    public Results findByForumId(Integer forumId) {
        XxfxExample xxfxExample = new XxfxExample();
        XxfxExample.Criteria criteria = xxfxExample.createCriteria();
        criteria.andForumIdEqualTo(forumId);
        List<Xxfx> xxfxes = xxfxMapper.selectByExample(xxfxExample);
        if (xxfxes.size() == 0) {
            throw new MyException(ResultEnum.ERROR_POINTERNUll.getCode(), ResultEnum.ERROR_POINTERNUll.getMsg());
        }
        return ResultUtil.successce(xxfxes);
    }

    /**
     *  根据发帖时间查询
     * @param xxfxTime
     * @return
     */
    @Override
    public Results findByXxfxTime(Long xxfxTime) {
        XxfxExample xxfxExample = new XxfxExample();
        XxfxExample.Criteria criteria = xxfxExample.createCriteria();
        criteria.andXxfxTimeEqualTo(xxfxTime);
        List<Xxfx> xxfxes = xxfxMapper.selectByExample(xxfxExample);
        if (xxfxes.size() == 0) {
            throw new MyException(ResultEnum.ERROR_POINTERNUll.getCode(), ResultEnum.ERROR_POINTERNUll.getMsg());
        }
        return ResultUtil.successce(xxfxes);
    }

    /**
     *  根据帖子状态查询
     * @param xxfxStatus
     * @return
     */
    @Override
    public Results findByXxfxStatus(Integer xxfxStatus) {
        XxfxExample xxfxExample = new XxfxExample();
        XxfxExample.Criteria criteria = xxfxExample.createCriteria();
        criteria.andXxfxStatusEqualTo(xxfxStatus);
        List<Xxfx> xxfxes = xxfxMapper.selectByExample(xxfxExample);
        if (xxfxes.size() == 0) {
            throw new MyException(ResultEnum.ERROR_POINTERNUll.getCode(), ResultEnum.ERROR_POINTERNUll.getMsg());
        }
        return ResultUtil.successce(xxfxes);
    }

    /**
     * 审核通过
     * @param xxfxId
     * @return
     */
    @Override
    public Results auditXxfx(Integer xxfxId) {
        //通过id获取所有状态
        Xxfx xxfx = xxfxMapper.selectByPrimaryKey(xxfxId);
        if (xxfx == null) {
            throw new MyException(ResultEnum.ERROR_QUERYFILD.getCode(), ResultEnum.ERROR_QUERYFILD.getMsg());
        }
        Integer xxfxStatus = xxfx.getXxfxStatus();
        if (xxfxStatus==0){ //如果状态为0（待审核）修改为1（通过）并重新修改
            xxfx.setXxfxStatus(1);
            xxfx.setXxfxModifyTime(new Date().getTime());//审核通过时间
            xxfxMapper.updateByPrimaryKeySelective(xxfx);
        }
        return ResultUtil.successce(xxfx);
    }

    /**
     * 审核不通过
     * @param xxfxId
     * @return
     */
    @Override
    public Results noAuditXxfx(Integer xxfxId) {
        //通过id获取所有状态
        Xxfx xxfx = xxfxMapper.selectByPrimaryKey(xxfxId);
        if (xxfx == null) {
            throw new MyException(ResultEnum.ERROR_QUERYFILD.getCode(), ResultEnum.ERROR_QUERYFILD.getMsg());
        }
        Integer xxfxStatus = xxfx.getXxfxStatus();
        if (xxfxStatus==0){ //如果状态为0（待审核）修改为2（不通过）并重新修改
            xxfx.setXxfxStatus(2);
            xxfx.setXxfxModifyTime(new Date().getTime());//审核不通过时间
            xxfxMapper.updateByPrimaryKeySelective(xxfx);
        }
        return ResultUtil.successce(xxfx);
    }

    /**
     * 删除帖子
     * @param xxfxId
     * @return
     */
    @Override
    public Results delXxfx(Integer[] xxfxId) {
        for (int i = 0; i < xxfxId.length; i++) {
            Xxfx xxfx = xxfxMapper.selectByPrimaryKey(xxfxId[i]);
            if (xxfx == null) {
                throw new MyException(ResultEnum.ERROR_POINTERNUll.getCode(), ResultEnum.ERROR_POINTERNUll.getMsg());
            }
            xxfxMapper.deleteByPrimaryKey(xxfxId[i]);
        }
        return ResultUtil.success();
    }

    /**
     * 帖子置顶
     * @param xxfxId
     * @return
     */
    @Override
    public Results topXxfx(Integer xxfxId) {
        //通过id获取所有状态
        Xxfx xxfx = xxfxMapper.selectByPrimaryKey(xxfxId);
        if (xxfx == null) {
            throw new MyException(ResultEnum.ERROR_QUERYFILD.getCode(), ResultEnum.ERROR_QUERYFILD.getMsg());
        }
        Integer xxfxStatus = xxfx.getXxfxStatus();
        if (xxfxStatus==1){ //如果状态为1（通过）修改为4（置顶）并重新修改
            xxfx.setXxfxStatus(4);
            xxfx.setXxfxModifyTime(new Date().getTime());//审核时间
            xxfxMapper.updateByPrimaryKeySelective(xxfx);
        }
        return ResultUtil.successce(xxfx);
    }

    /**
     * 取消置顶
     * @param xxfxId
     * @return
     */
    @Override
    public Results noTopXxfx(Integer xxfxId) {
        //通过id获取所有状态
        Xxfx xxfx = xxfxMapper.selectByPrimaryKey(xxfxId);
        if (xxfx == null) {
            throw new MyException(ResultEnum.ERROR_QUERYFILD.getCode(), ResultEnum.ERROR_QUERYFILD.getMsg());
        }
        Integer xxfxStatus = xxfx.getXxfxStatus();
        if (xxfxStatus==4){ //如果状态为4（通过）修改为5（不置顶）并重新修改
            xxfx.setXxfxStatus(5);
            xxfx.setXxfxModifyTime(new Date().getTime());//审核时间
            xxfxMapper.updateByPrimaryKeySelective(xxfx);
        }
        return ResultUtil.successce(xxfx);
    }

    /**
     * 根据置顶状态时间查询
     *
     * @param xxfxStatus
     * @return
     */
    @Override
    public Results findAllStatus(Integer xxfxStatus) {
        if (xxfxStatus == 4) {
            List<Xxfx> xxfxes = xxfxMapper.selectByStatusExample(xxfxStatus);
            return ResultUtil.successce(xxfxes);
        }
        throw new MyException("尚未有置顶");
    }

    /**
     * 分页查询
     *
     * @param page
     * @param size
     * @return
     */
    @Override
    public PageResult findPage(int page, int size) {
        PageHelper.startPage(page, size);
        Page<Xxfx> xxfxes = (Page<Xxfx>) xxfxMapper.selectByExample(null);
        return new PageResult(xxfxes.getTotal(), xxfxes.getResult());
    }

}
