package com.tuiba.saasadmininster.wdqz.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.tuiba.saasadmininster.Exception.MyException;
import com.tuiba.saasadmininster.Exception.ResultEnum;
import com.tuiba.saasadmininster.Exception.ResultUtil;
import com.tuiba.saasadmininster.Exception.Results;
import com.tuiba.saasadmininster.entity.PageResult;
import com.tuiba.saasadmininster.wdqz.bean.Wdqz;
import com.tuiba.saasadmininster.wdqz.bean.WdqzExample;
import com.tuiba.saasadmininster.wdqz.dao.WdqzMapper;
import com.tuiba.saasadmininster.wdqz.service.WdqzService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * @author : yangzhi
 * @date : 11:36 2019/10/17
 */
@Service
public class wdqzServiceImpl implements WdqzService {


    @Autowired
    private WdqzMapper wdqzMapper;

    /**
     * 保存信息
     *
     * @param wdqz 实体
     */
    @Override
    public Results saveWdqz(Wdqz wdqz) {
        //重新创建对象
       /* Wdqz wdqz1 = new Wdqz();
        wdqz1.setForumId(wdqz.getForumId());                  //问答求助版块ID
        wdqz1.setUserId(wdqz.getUserId());                    //用户id
        wdqz1.setWdqzTitle(wdqz.getWdqzTitle());              //问答求助贴标题
        wdqz1.setWdqzContent(wdqz.getWdqzContent());          //问答求助贴内容
        wdqz1.setWdqzImg(wdqz.getWdqzImg());                  //问答求助贴图片地址
        wdqz1.setWdqzVoice(wdqz.getWdqzVoice());              //问答求助贴音频地址
        wdqz1.setWdqzScore(wdqz.getWdqzScore());              //问答求助贴悬赏积分
        wdqz1.setWdqzDianzan(wdqz.getWdqzDianzan());          //问答求助贴点赞数
        wdqz1.setWdqzPublishTime(wdqz.getWdqzPublishTime());  //问答求助贴发帖时间
        wdqz1.setWdqzAdoption(wdqz.getWdqzAdoption());        //采纳的评论
        wdqz1.setWdqzStatus(0);    //问答求助贴审核状态（0 未审核 1 已通过 2未通过 3显示 4 隐藏 5 置顶）
*/
        Integer wdqzId = wdqz.getWdqzId();
        Wdqz wdqz1 = wdqzMapper.selectByPrimaryKey(wdqzId);
        if (wdqz1==null){
            throw new MyException(ResultEnum.ERROR_POINTERNUll.getCode(), ResultEnum.ERROR_POINTERNUll.getMsg());
        }
        wdqz1.setWdqzTitle(wdqz.getWdqzTitle());              //问答求助贴标题
        wdqz1.setWdqzContent(wdqz.getWdqzContent());          //问答求助贴内容
        wdqz1.setWdqzImg(wdqz.getWdqzImg());                  //问答求助贴图片地址
        wdqz1.setWdqzVoice(wdqz.getWdqzVoice());              //问答求助贴音频地址
        wdqz1.setWdqzScore(wdqz.getWdqzScore());              //问答求助贴悬赏积分
        wdqz1.setWdqzDianzan(wdqz.getWdqzDianzan());          //问答求助贴点赞数
        wdqz1.setWdqzPublishTime(wdqz.getWdqzPublishTime());  //问答求助贴发帖时间
        wdqz1.setWdqzAdoption(wdqz.getWdqzAdoption());        //采纳的评论
        wdqz1.setWdqzStatus(0);    //问答求助贴审核状态（0 未审核 1 已通过 2未通过 3显示 4 隐藏 5 置顶）
        wdqzMapper.updateByPrimaryKeySelective(wdqz1);
        return ResultUtil.successce(wdqz1);
    }

    /**
     * 查询所有
     *
     * @return
     */
    @Override
    public Results findAllWdqz() {
        List<Wdqz> wdqzList = wdqzMapper.selectByExample(null);
        return ResultUtil.successce(wdqzList);
    }

    /**
     * 根据id查询
     *
     * @param wdqzId
     * @return
     */
    @Override
    public Results findById(Integer wdqzId) {
        Wdqz wdqzList = wdqzMapper.selectByPrimaryKey(wdqzId);
        if (wdqzList == null) {
            throw new MyException(ResultEnum.ERROR_QUERYFILD.getCode(), ResultEnum.ERROR_QUERYFILD.getMsg());
        }
        return ResultUtil.successce(wdqzList);
    }

    /**
     * 根据Userid查询
     *
     * @param userId
     * @return
     */
    @Override
    public Results findByUserId(Integer userId) {
        WdqzExample wdqzExample = new WdqzExample();
        WdqzExample.Criteria criteria = wdqzExample.createCriteria();
        criteria.andUserIdEqualTo(userId);
        List<Wdqz> wdqzs = wdqzMapper.selectByExample(wdqzExample);
        if (wdqzs.size()==0){
            throw new MyException(ResultEnum.ERROR_QUERYFILD.getCode(), ResultEnum.ERROR_QUERYFILD.getMsg());
        }
        return ResultUtil.successce(wdqzs);
    }

    /**
     * 根据发帖时间查询
     *
     * @param wdqzPublishTime
     * @return
     */
    @Override
    public Results findByPublishTime(Long wdqzPublishTime) {
        WdqzExample wdqzExample = new WdqzExample();
        WdqzExample.Criteria criteria = wdqzExample.createCriteria();
        criteria.andWdqzPublishTimeEqualTo(wdqzPublishTime);
        List<Wdqz> wdqzs = wdqzMapper.selectByExample(wdqzExample);
        if (wdqzs.size() == 0) {
            throw new MyException(ResultEnum.ERROR_QUERYFILD.getCode(), ResultEnum.ERROR_QUERYFILD.getMsg());
        }
        return ResultUtil.successce(wdqzs);
    }

    /**
     * 根据帖子状态查询
     *
     * @param wdqzStatus
     * @return
     */
    @Override
    public Results findByStatus(Integer wdqzStatus) {
        WdqzExample wdqzExample = new WdqzExample();
        WdqzExample.Criteria criteria = wdqzExample.createCriteria();
        criteria.andWdqzStatusEqualTo(wdqzStatus);
        List<Wdqz> wdqzs = wdqzMapper.selectByExample(wdqzExample);
        if (wdqzs.size() == 0) {
            throw new MyException(ResultEnum.ERROR_QUERYFILD.getCode(), ResultEnum.ERROR_QUERYFILD.getMsg());
        }
        return ResultUtil.successce(wdqzs);
    }

    /**
     * 审核通过
     *
     * @param wdqzId
     * @return
     */
    @Override
    public Results auditWdqz(Integer wdqzId) {
        //通过id获取所有问答求助状态
        Wdqz wdqz = wdqzMapper.selectByPrimaryKey(wdqzId);
        if (wdqz == null) {
            throw new MyException(ResultEnum.ERROR_QUERYFILD.getCode(), ResultEnum.ERROR_QUERYFILD.getMsg());
        }
        Integer wdqzWdqzStatus = wdqz.getWdqzStatus();
        if (wdqzWdqzStatus==0){ //如果状态为0（待审核）修改为1（通过）并重新修改
            wdqz.setWdqzStatus(1);
            wdqz.setWdqzModifyTime(new Date().getTime());//审核通过时间
            wdqzMapper.updateByPrimaryKeySelective(wdqz);
        }
        return ResultUtil.successce(wdqz);
    }

    /**
     * 帖子审核不通过
     *
     * @param wdqzId
     * @return
     */
    @Override
    public Results noAuditWdqz(Integer wdqzId) {
        //通过id获取所有问答求助状态
        Wdqz wdqz = wdqzMapper.selectByPrimaryKey(wdqzId);
        if (wdqz == null) {
            throw new MyException(ResultEnum.ERROR_QUERYFILD.getCode(), ResultEnum.ERROR_QUERYFILD.getMsg());
        }
        Integer wdqzWdqzStatus = wdqz.getWdqzStatus();
        if (wdqzWdqzStatus==0){ //如果状态为0（待审核）修改为2（不通过）并重新修改
            wdqz.setWdqzStatus(2);
            wdqz.setWdqzModifyTime(new Date().getTime());//审核通过时间
            wdqzMapper.updateByPrimaryKeySelective(wdqz);
        }
        return ResultUtil.successce(wdqz);
    }

    /**
     * 删除帖子
     *
     * @param wdqzId
     * @return
     */
    @Override
    public Results delWdqz(Integer[] wdqzId) {
        for (int i = 0; i < wdqzId.length; i++) {
            Wdqz wdqz = wdqzMapper.selectByPrimaryKey(wdqzId[i]);
            if (wdqz == null) {
                throw new MyException(ResultEnum.ERROR_POINTERNUll.getCode(), ResultEnum.ERROR_POINTERNUll.getMsg());
            }
            wdqzMapper.deleteByPrimaryKey(wdqzId[i]);
        }
        return ResultUtil.success();
    }

    /**
     * 帖子置顶
     *
     * @param wdqzId
     * @return
     */
    @Override
    public Results topWdqz(Integer wdqzId) {
        //通过id获取所有问答求助状态
        Wdqz wdqz = wdqzMapper.selectByPrimaryKey(wdqzId);
        if (wdqz == null) {
            throw new MyException(ResultEnum.ERROR_QUERYFILD.getCode(), ResultEnum.ERROR_QUERYFILD.getMsg());
        }
        Integer wdqzWdqzStatus = wdqz.getWdqzStatus();
        if (wdqzWdqzStatus==1){ //如果状态为1（通过）修改为4（不置顶）并重新修改
            wdqz.setWdqzStatus(4);
            wdqz.setWdqzModifyTime(new Date().getTime());//审核通过时间
            wdqzMapper.updateByPrimaryKeySelective(wdqz);
        }
        return ResultUtil.successce(wdqz);
    }

    /**
     * 取消置顶
     *
     * @param wdqzId
     * @return
     */
    @Override
    public Results noTopWdqz(Integer wdqzId) {
        //通过id获取所有问答求助状态
        Wdqz wdqz = wdqzMapper.selectByPrimaryKey(wdqzId);
        if (wdqz == null) {
            throw new MyException(ResultEnum.ERROR_QUERYFILD.getCode(), ResultEnum.ERROR_QUERYFILD.getMsg());
        }
        Integer wdqzWdqzStatus = wdqz.getWdqzStatus();
        if (wdqzWdqzStatus==4){ //如果状态为4（置顶）修改为5（取消置顶）并重新修改
            wdqz.setWdqzStatus(5);
            wdqz.setWdqzModifyTime(new Date().getTime());//审核通过时间
            wdqzMapper.updateByPrimaryKeySelective(wdqz);
        }
        return ResultUtil.successce(wdqz);
    }

    /**
     * 根据置顶状态时间查询
     *
     * @param wdqzStatus
     * @return
     */
    @Override
    public Results findStatus(Integer wdqzStatus) {
        if (wdqzStatus == 4) {
            List<Wdqz> wdqzs = wdqzMapper.selectByStatusExample(wdqzStatus);
            return ResultUtil.successce(wdqzs);
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
        Page<Wdqz> wdqzs = (Page<Wdqz>) wdqzMapper.selectByExample(null);
        return new PageResult(wdqzs.getTotal(), wdqzs.getResult());
    }
}
