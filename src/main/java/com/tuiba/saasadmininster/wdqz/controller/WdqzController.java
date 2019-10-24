package com.tuiba.saasadmininster.wdqz.controller;

import com.tuiba.saasadmininster.Exception.ResultUtil;
import com.tuiba.saasadmininster.Exception.Results;
import com.tuiba.saasadmininster.entity.PageResult;
import com.tuiba.saasadmininster.wdqz.bean.Wdqz;
import com.tuiba.saasadmininster.wdqz.service.WdqzService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 * @author : yangzhi
 * @date : 12:00 2019/10/17
 */
@RestController
@RequestMapping(value = "/wdqz")
public class WdqzController {

    @Autowired
    private WdqzService wdqzService;

    /**
     * 保存信息
     *
     * @param wdqz
     * @return
     */
    /**
     * showdoc
     *
     * @param wdqz 必选     商品实体
     *             * @return {"code": 200,"msg": "成功","data": {"wdqzId": 2,"forumId": 8,"userId": 68,"wdqzTitle": "768","wdqzContent": "8678","wdqzImg": null,"wdqzVoice": "768678","wdqzScore": null,"wdqzDianzan": null,"wdqzPublishTime": null,"wdqzModifyTime": null,"wdqzAdoption": null,"wdqzStatus": 1,"wdqzTopTime": null,"wdqzCanceTopTime": null,"bak1": null}}
     * @catalog 测试文档/问答求助相关
     * @title 保存问答求助信息
     * @description 用户保存问答求助信息的接口
     * @method post
     * @url /wdqz/saveWdqz
     * @return_param code int 返回状态码
     * @return_param msg string 返回状态码提示
     * @return_param data json 返回数据
     * @return_param wdqzId int 问答求助帖id
     * @return_param forumId int 求助版块ID
     * @return_param userId int 用户id
     * @return_param wdqzTitle varchar 求助问答标题
     * @return_param wdqzContent varchar 求助问答评论
     * @return_param wdqzImg varchar 求助问答图片
     * @return_param wdqzVoice varchar 求助问答音频
     * @return_param wdqzDianzan int 求助问答点赞数
     * @return_param wdqzPublishTime bigint 求助问答发帖时间
     * @return_param wdqzModifyTime bigint 求助问答审核时间
     * @return_param wdqzAdoption int 采纳评论
     * @return_param wdqzStatus int 求助问答审核时间
     * @return_param wdqzTopTime bigint 求助问答置顶时间
     * @return_param wdqzCanceTopTime bigint 求助问答取消置顶时间
     * @return_param bak1 bigint 预留字段
     * @remark 备注信息
     */
    @PostMapping(value = "/saveWdqz")
    public Results saveWdqz(@RequestBody Wdqz wdqz) {
        return wdqzService.saveWdqz(wdqz);
    }

    /**
     * 查询所有
     *
     * @return
     */
    /**
     * showdoc
     * <p>
     * * @return {"code": 200,"msg": "成功","data": {"wdqzId": 2,"forumId": 8,"userId": 68,"wdqzTitle": "768","wdqzContent": "8678","wdqzImg": null,"wdqzVoice": "768678","wdqzScore": null,"wdqzDianzan": null,"wdqzPublishTime": null,"wdqzModifyTime": null,"wdqzAdoption": null,"wdqzStatus": 1,"wdqzTopTime": null,"wdqzCanceTopTime": null,"bak1": null}}
     *
     * @catalog 测试文档/问答求助相关
     * @title 查询所有问答求助信息
     * @description 用户查询所有问答求助信息的接口
     * @method get
     * @url /wdqz/saveWdqz
     * @return_param code int 返回状态码
     * @return_param msg string 返回状态码提示
     * @return_param data json 返回数据
     * @return_param wdqzId int 问答求助帖id
     * @return_param forumId int 求助版块ID
     * @return_param userId int 用户id
     * @return_param wdqzTitle varchar 求助问答标题
     * @return_param wdqzContent varchar 求助问答评论
     * @return_param wdqzImg varchar 求助问答图片
     * @return_param wdqzVoice varchar 求助问答音频
     * @return_param wdqzDianzan int 求助问答点赞数
     * @return_param wdqzPublishTime bigint 求助问答发帖时间
     * @return_param wdqzModifyTime bigint 求助问答审核时间
     * @return_param wdqzAdoption int 采纳评论
     * @return_param wdqzStatus int 求助问答审核时间
     * @return_param wdqzTopTime bigint 求助问答置顶时间
     * @return_param wdqzCanceTopTime bigint 求助问答取消置顶时间
     * @return_param bak1 bigint 预留字段
     * @remark 备注信息
     */
    @GetMapping(value = "/findAllWdqz")
    public Results findAllWdqz() {
        return wdqzService.findAllWdqz();
    }

    /**
     * 根据id查询
     *
     * @param wdqzId
     * @return
     */
    /**
     * showdoc
     * <p>
     * * @return {"code": 200,"msg": "成功","data": {"wdqzId": 2,"forumId": 8,"userId": 68,"wdqzTitle": "768","wdqzContent": "8678","wdqzImg": null,"wdqzVoice": "768678","wdqzScore": null,"wdqzDianzan": null,"wdqzPublishTime": null,"wdqzModifyTime": null,"wdqzAdoption": null,"wdqzStatus": 1,"wdqzTopTime": null,"wdqzCanceTopTime": null,"bak1": null}}
     *
     * @catalog 测试文档/问答求助相关
     * @title 根据id查询问答求助信息
     * @description 用户根据id查询问答求助信息的接口
     * @method get
     * @url /wdqz/findById/{wdqzId}
     * @return_param code int 返回状态码
     * @return_param msg string 返回状态码提示
     * @return_param data json 返回数据
     * @return_param wdqzId int 问答求助帖id
     * @return_param forumId int 求助版块ID
     * @return_param userId int 用户id
     * @return_param wdqzTitle varchar 求助问答标题
     * @return_param wdqzContent varchar 求助问答评论
     * @return_param wdqzImg varchar 求助问答图片
     * @return_param wdqzVoice varchar 求助问答音频
     * @return_param wdqzDianzan int 求助问答点赞数
     * @return_param wdqzPublishTime bigint 求助问答发帖时间
     * @return_param wdqzModifyTime bigint 求助问答审核时间
     * @return_param wdqzAdoption int 采纳评论
     * @return_param wdqzStatus int 求助问答审核时间
     * @return_param wdqzTopTime bigint 求助问答置顶时间
     * @return_param wdqzCanceTopTime bigint 求助问答取消置顶时间
     * @return_param bak1 bigint 预留字段
     * @remark 备注信息
     */
    @GetMapping(value = "/findById/{wdqzId}")
    public Results findById(@PathVariable Integer wdqzId) {
        return wdqzService.findById(wdqzId);
    }

    /**
     * 根据用户id查询
     *
     * @param userId
     * @return
     */
    /**
     * showdoc
     * <p>
     * * @return {"code": 200,"msg": "成功","data": {"wdqzId": 2,"forumId": 8,"userId": 68,"wdqzTitle": "768","wdqzContent": "8678","wdqzImg": null,"wdqzVoice": "768678","wdqzScore": null,"wdqzDianzan": null,"wdqzPublishTime": null,"wdqzModifyTime": null,"wdqzAdoption": null,"wdqzStatus": 1,"wdqzTopTime": null,"wdqzCanceTopTime": null,"bak1": null}}
     *
     * @catalog 测试文档/问答求助相关
     * @title 根据用户id查询问答求助信息
     * @description 用户根据用户id查询问答求助信息的接口
     * @method get
     * @url /wdqz/findByUserId/{userId}
     * @return_param code int 返回状态码
     * @return_param msg string 返回状态码提示
     * @return_param data json 返回数据
     * @return_param wdqzId int 问答求助帖id
     * @return_param forumId int 求助版块ID
     * @return_param userId int 用户id
     * @return_param wdqzTitle varchar 求助问答标题
     * @return_param wdqzContent varchar 求助问答评论
     * @return_param wdqzImg varchar 求助问答图片
     * @return_param wdqzVoice varchar 求助问答音频
     * @return_param wdqzDianzan int 求助问答点赞数
     * @return_param wdqzPublishTime bigint 求助问答发帖时间
     * @return_param wdqzModifyTime bigint 求助问答审核时间
     * @return_param wdqzAdoption int 采纳评论
     * @return_param wdqzStatus int 求助问答审核时间
     * @return_param wdqzTopTime bigint 求助问答置顶时间
     * @return_param wdqzCanceTopTime bigint 求助问答取消置顶时间
     * @return_param bak1 bigint 预留字段
     * @remark 备注信息
     */
    @GetMapping(value = "/findByUserId/{userId}")
    public Results findByUserId(@PathVariable Integer userId) {
        return wdqzService.findByUserId(userId);
    }

    /**
     * 根据发帖时间查询
     *
     * @param wdqzPublishTime
     * @return
     */
    /**
     * showdoc
     * <p>
     * * @return {"code": 200,"msg": "成功","data": {"wdqzId": 2,"forumId": 8,"userId": 68,"wdqzTitle": "768","wdqzContent": "8678","wdqzImg": null,"wdqzVoice": "768678","wdqzScore": null,"wdqzDianzan": null,"wdqzPublishTime": null,"wdqzModifyTime": null,"wdqzAdoption": null,"wdqzStatus": 1,"wdqzTopTime": null,"wdqzCanceTopTime": null,"bak1": null}}
     *
     * @catalog 测试文档/问答求助相关
     * @title 根据用户发帖时间查询问答求助信息
     * @description 用户根据用户发帖时间查询问答求助信息的接口
     * @method get
     * @url /wdqz/findByPublishTime/{wdqzPublishTime}
     * @return_param code int 返回状态码
     * @return_param msg string 返回状态码提示
     * @return_param data json 返回数据
     * @return_param wdqzId int 问答求助帖id
     * @return_param forumId int 求助版块ID
     * @return_param userId int 用户id
     * @return_param wdqzTitle varchar 求助问答标题
     * @return_param wdqzContent varchar 求助问答评论
     * @return_param wdqzImg varchar 求助问答图片
     * @return_param wdqzVoice varchar 求助问答音频
     * @return_param wdqzDianzan int 求助问答点赞数
     * @return_param wdqzPublishTime bigint 求助问答发帖时间
     * @return_param wdqzModifyTime bigint 求助问答审核时间
     * @return_param wdqzAdoption int 采纳评论
     * @return_param wdqzStatus int 求助问答审核时间
     * @return_param wdqzTopTime bigint 求助问答置顶时间
     * @return_param wdqzCanceTopTime bigint 求助问答取消置顶时间
     * @return_param bak1 bigint 预留字段
     * @remark 备注信息
     */
    @GetMapping(value = "/findByPublishTime/{wdqzPublishTime}")
    public Results findByPublishTime(@PathVariable Long wdqzPublishTime) {
        return wdqzService.findByPublishTime(wdqzPublishTime);
    }

    /**
     * 根据发帖状态查询
     *
     * @param wdqzStatus
     * @return
     */
    /**
     * showdoc
     * <p>
     * * @return {"code": 200,"msg": "成功","data": {"wdqzId": 2,"forumId": 8,"userId": 68,"wdqzTitle": "768","wdqzContent": "8678","wdqzImg": null,"wdqzVoice": "768678","wdqzScore": null,"wdqzDianzan": null,"wdqzPublishTime": null,"wdqzModifyTime": null,"wdqzAdoption": null,"wdqzStatus": 1,"wdqzTopTime": null,"wdqzCanceTopTime": null,"bak1": null}}
     *
     * @catalog 测试文档/问答求助相关
     * @title 根据用户发帖状态查询问答求助信息
     * @description 用户根据用户发帖状态查询问答求助信息的接口
     * @method get
     * @url /wdqz/wdqzStatus/{wdqzStatus}
     * @return_param code int 返回状态码
     * @return_param msg string 返回状态码提示
     * @return_param data json 返回数据
     * @return_param wdqzId int 问答求助帖id
     * @return_param forumId int 求助版块ID
     * @return_param userId int 用户id
     * @return_param wdqzTitle varchar 求助问答标题
     * @return_param wdqzContent varchar 求助问答评论
     * @return_param wdqzImg varchar 求助问答图片
     * @return_param wdqzVoice varchar 求助问答音频
     * @return_param wdqzDianzan int 求助问答点赞数
     * @return_param wdqzPublishTime bigint 求助问答发帖时间
     * @return_param wdqzModifyTime bigint 求助问答审核时间
     * @return_param wdqzAdoption int 采纳评论
     * @return_param wdqzStatus int 求助问答审核时间
     * @return_param wdqzTopTime bigint 求助问答置顶时间
     * @return_param wdqzCanceTopTime bigint 求助问答取消置顶时间
     * @return_param bak1 bigint 预留字段
     * @remark 备注信息
     */
    @GetMapping(value = ("/wdqzStatus/{wdqzStatus}"))
    public Results findByStatus(@PathVariable Integer wdqzStatus) {
        return wdqzService.findByStatus(wdqzStatus);
    }

    /**
     * 发帖审核通过
     *
     * @param map
     * @return
     */
    /**
     * showdoc
     * <p>
     * * @return {"code": 200,"msg": "成功","data": {"wdqzId": 2,"forumId": 8,"userId": 68,"wdqzTitle": "768","wdqzContent": "8678","wdqzImg": null,"wdqzVoice": "768678","wdqzScore": null,"wdqzDianzan": null,"wdqzPublishTime": null,"wdqzModifyTime": null,"wdqzAdoption": null,"wdqzStatus": 1,"wdqzTopTime": null,"wdqzCanceTopTime": null,"bak1": null}}
     *
     * @catalog 测试文档/问答求助相关
     * @title 审核通过
     * @description 用户审核通过的接口
     * @method post
     * @url /wdqz/auditWdqz
     * @return_param code int 返回状态码
     * @return_param msg string 返回状态码提示
     * @return_param data json 返回数据
     * @return_param wdqzId int 问答求助帖id
     * @return_param forumId int 求助版块ID
     * @return_param userId int 用户id
     * @return_param wdqzTitle varchar 求助问答标题
     * @return_param wdqzContent varchar 求助问答评论
     * @return_param wdqzImg varchar 求助问答图片
     * @return_param wdqzVoice varchar 求助问答音频
     * @return_param wdqzDianzan int 求助问答点赞数
     * @return_param wdqzPublishTime bigint 求助问答发帖时间
     * @return_param wdqzModifyTime bigint 求助问答审核时间
     * @return_param wdqzAdoption int 采纳评论
     * @return_param wdqzStatus int 求助问答审核时间
     * @return_param wdqzTopTime bigint 求助问答置顶时间
     * @return_param wdqzCanceTopTime bigint 求助问答取消置顶时间
     * @return_param bak1 bigint 预留字段
     * @remark 备注信息
     */
    @PostMapping(value = "/auditWdqz")
    public Results auditWdqz(@RequestBody Map<String, Integer> map) {
        Integer wdqzId = map.get("wdqzId");
        return wdqzService.auditWdqz(wdqzId);
    }

    /**
     * 发帖审核不通过
     *
     * @param map
     * @return
     */
    /**
     * showdoc
     * <p>
     * * @return {"code": 200,"msg": "成功","data": {"wdqzId": 2,"forumId": 8,"userId": 68,"wdqzTitle": "768","wdqzContent": "8678","wdqzImg": null,"wdqzVoice": "768678","wdqzScore": null,"wdqzDianzan": null,"wdqzPublishTime": null,"wdqzModifyTime": null,"wdqzAdoption": null,"wdqzStatus": 2,"wdqzTopTime": null,"wdqzCanceTopTime": null,"bak1": null}}
     *
     * @catalog 测试文档/问答求助相关
     * @title 审核不通过
     * @description 用户审核不通过的接口
     * @method post
     * @url /wdqz/noAuditWdqz
     * @return_param code int 返回状态码
     * @return_param msg string 返回状态码提示
     * @return_param data json 返回数据
     * @return_param wdqzId int 问答求助帖id
     * @return_param forumId int 求助版块ID
     * @return_param userId int 用户id
     * @return_param wdqzTitle varchar 求助问答标题
     * @return_param wdqzContent varchar 求助问答评论
     * @return_param wdqzImg varchar 求助问答图片
     * @return_param wdqzVoice varchar 求助问答音频
     * @return_param wdqzDianzan int 求助问答点赞数
     * @return_param wdqzPublishTime bigint 求助问答发帖时间
     * @return_param wdqzModifyTime bigint 求助问答审核时间
     * @return_param wdqzAdoption int 采纳评论
     * @return_param wdqzStatus int 求助问答审核时间
     * @return_param wdqzTopTime bigint 求助问答置顶时间
     * @return_param wdqzCanceTopTime bigint 求助问答取消置顶时间
     * @return_param bak1 bigint 预留字段
     * @remark 备注信息
     */
    @PostMapping(value = "/noAuditWdqz")
    public Results noAuditWdqz(@RequestBody Map<String, Integer> map) {
        Integer wdqzId = map.get("wdqzId");
        return wdqzService.noAuditWdqz(wdqzId);

    }

    /**
     * 删除帖子
     *
     * @param map
     * @return
     */
    /**
     * showdoc
     * <p>
     * * @return {"code": 200,"msg": "成功","data": {"操作成功！"}}
     *
     * @catalog 测试文档/问答求助相关
     * @title 删除帖子
     * @description 用户删除帖子的接口
     * @method Delete
     * @url /wdqz/delWdqz
     * @return_param code int 返回状态码
     * @return_param msg string 返回状态码提示
     * @return_param data json 返回数据
     * @return_param wdqzId int 问答求助帖id
     * @return_param forumId int 求助版块ID
     * @return_param userId int 用户id
     * @return_param wdqzTitle varchar 求助问答标题
     * @return_param wdqzContent varchar 求助问答评论
     * @return_param wdqzImg varchar 求助问答图片
     * @return_param wdqzVoice varchar 求助问答音频
     * @return_param wdqzDianzan int 求助问答点赞数
     * @return_param wdqzPublishTime bigint 求助问答发帖时间
     * @return_param wdqzModifyTime bigint 求助问答审核时间
     * @return_param wdqzAdoption int 采纳评论
     * @return_param wdqzStatus int 求助问答审核时间
     * @return_param wdqzTopTime bigint 求助问答置顶时间
     * @return_param wdqzCanceTopTime bigint 求助问答取消置顶时间
     * @return_param bak1 bigint 预留字段
     * @remark 备注信息
     */
    @DeleteMapping(value = "/delWdqz")
    public Results delWdqz(@RequestBody Map<String, Integer[]> map) {
        Integer[] wdqzIds = map.get("wdqzId");
        return wdqzService.delWdqz(wdqzIds);
    }

    /**
     * 帖子置顶
     *
     * @param map
     * @return
     */
    /**
     * showdoc
     * <p>
     * * @return {"code": 200,"msg": "成功","data": {"wdqzId": 2,"forumId": 8,"userId": 68,"wdqzTitle": "768","wdqzContent": "8678","wdqzImg": null,"wdqzVoice": "768678","wdqzScore": null,"wdqzDianzan": null,"wdqzPublishTime": null,"wdqzModifyTime": null,"wdqzAdoption": null,"wdqzStatus": 4,"wdqzTopTime": null,"wdqzCanceTopTime": null,"bak1": null}}
     *
     * @catalog 测试文档/问答求助相关
     * @title 帖子置顶
     * @description 用户帖子置顶的接口
     * @method post
     * @url /wdqz/topWdqz
     * @return_param code int 返回状态码
     * @return_param msg string 返回状态码提示
     * @return_param data json 返回数据
     * @return_param wdqzId int 问答求助帖id
     * @return_param forumId int 求助版块ID
     * @return_param userId int 用户id
     * @return_param wdqzTitle varchar 求助问答标题
     * @return_param wdqzContent varchar 求助问答评论
     * @return_param wdqzImg varchar 求助问答图片
     * @return_param wdqzVoice varchar 求助问答音频
     * @return_param wdqzDianzan int 求助问答点赞数
     * @return_param wdqzPublishTime bigint 求助问答发帖时间
     * @return_param wdqzModifyTime bigint 求助问答审核时间
     * @return_param wdqzAdoption int 采纳评论
     * @return_param wdqzStatus int 求助问答审核时间
     * @return_param wdqzTopTime bigint 求助问答置顶时间
     * @return_param wdqzCanceTopTime bigint 求助问答取消置顶时间
     * @return_param bak1 bigint 预留字段
     * @remark 备注信息
     */
    @PostMapping(value = "/topWdqz")
    public Results topWdqz(@RequestBody Map<String, Integer> map) {
        Integer wdqzId = map.get("wdqzId");
        return wdqzService.topWdqz(wdqzId);

    }

    /**
     * 帖子取消置顶
     *
     * @param map
     * @return
     */
    /**
     * showdoc
     * <p>
     * * @return {"code": 200,"msg": "成功","data": {"wdqzId": 2,"forumId": 8,"userId": 68,"wdqzTitle": "768","wdqzContent": "8678","wdqzImg": null,"wdqzVoice": "768678","wdqzScore": null,"wdqzDianzan": null,"wdqzPublishTime": null,"wdqzModifyTime": null,"wdqzAdoption": null,"wdqzStatus": 5,"wdqzTopTime": null,"wdqzCanceTopTime": null,"bak1": null}}
     *
     * @catalog 测试文档/问答求助相关
     * @title 帖子取消置顶
     * @description 用户帖子取消置顶的接口
     * @method post
     * @url /wdqz/noTopWdqz
     * @return_param code int 返回状态码
     * @return_param msg string 返回状态码提示
     * @return_param data json 返回数据
     * @return_param wdqzId int 问答求助帖id
     * @return_param forumId int 求助版块ID
     * @return_param userId int 用户id
     * @return_param wdqzTitle varchar 求助问答标题
     * @return_param wdqzContent varchar 求助问答评论
     * @return_param wdqzImg varchar 求助问答图片
     * @return_param wdqzVoice varchar 求助问答音频
     * @return_param wdqzDianzan int 求助问答点赞数
     * @return_param wdqzPublishTime bigint 求助问答发帖时间
     * @return_param wdqzModifyTime bigint 求助问答审核时间
     * @return_param wdqzAdoption int 采纳评论
     * @return_param wdqzStatus int 求助问答审核时间
     * @return_param wdqzTopTime bigint 求助问答置顶时间
     * @return_param wdqzCanceTopTime bigint 求助问答取消置顶时间
     * @return_param bak1 bigint 预留字段
     * @remark 备注信息
     */
    @PostMapping(value = "/noTopWdqz")
    public Results noTopWdqz(@RequestBody Map<String, Integer> map) {
        Integer wdqzId = map.get("wdqzId");
        return wdqzService.noTopWdqz(wdqzId);

    }

    /**
     * 根据置顶状态时间查询
     *
     * @param wdqzStatus
     * @return
     */

    /**
     * showdoc
     * <p>
     * * @return {"code": 200,"msg": "成功","data": [{"wdqzId": 6,"forumId": 98,"userId": 98,"wdqzTitle": "98","wdqzContent": "43","wdqzImg": null,"wdqzVoice": "32","wdqzScore": null,"wdqzDianzan": 32,"wdqzPublishTime": null,"wdqzModifyTime": null,"wdqzAdoption": 23,"wdqzStatus": 4,"wdqzTopTime": 1571388685722,"wdqzCanceTopTime": null,"bak1": null},{"wdqzId": 5,"forumId": 678,"userId": 43,"wdqzTitle": "7688678","wdqzContent": "878","wdqzImg": null,"wdqzVoice": "32","wdqzScore": null,"wdqzDianzan": null,"wdqzPublishTime": null,"wdqzModifyTime": null,"wdqzAdoption": null,"wdqzStatus": 4,"wdqzTopTime": 1571388636115,"wdqzCanceTopTime": null,"bak1": null}]}
     *
     * @catalog 测试文档/问答求助相关
     * @title   帖子时间置顶
     * @description 用户帖子时间置顶的接口
     * @method get
     * @url /wdqz/findStatus/{wdqzStatus}
     * @return_param code int 返回状态码
     * @return_param msg string 返回状态码提示
     * @return_param data json 返回数据
     * @return_param wdqzId int 问答求助帖id
     * @return_param forumId int 求助版块ID
     * @return_param userId int 用户id
     * @return_param wdqzTitle varchar 求助问答标题
     * @return_param wdqzContent varchar 求助问答评论
     * @return_param wdqzImg varchar 求助问答图片
     * @return_param wdqzVoice varchar 求助问答音频
     * @return_param wdqzDianzan int 求助问答点赞数
     * @return_param wdqzPublishTime bigint 求助问答发帖时间
     * @return_param wdqzModifyTime bigint 求助问答审核时间
     * @return_param wdqzAdoption int 采纳评论
     * @return_param wdqzStatus int 求助问答审核时间
     * @return_param wdqzTopTime bigint 求助问答置顶时间
     * @return_param wdqzCanceTopTime bigint 求助问答取消置顶时间
     * @return_param bak1 bigint 预留字段
     * @remark 备注信息
     */
    @GetMapping(value = "/findStatus/{wdqzStatus}")
    public Results findStatus(@PathVariable Integer wdqzStatus) {
        return wdqzService.findStatus(wdqzStatus);
    }

    /**s
     * 分页查询
     */

    /**
     * showdoc
     * <p>
     * * @return {"code": 200,"msg": "成功","data": {"total": 6,"rows": [{"wdqzId": 1,"forumId": 2,"userId": 3,"wdqzTitle": "34","wdqzContent": "434","wdqzImg": "43","wdqzVoice": "43","wdqzScore": null,"wdqzDianzan": 443,"wdqzPublishTime": null,"wdqzModifyTime": null,"wdqzAdoption": null,"wdqzStatus": 0,"wdqzTopTime": null,"wdqzCanceTopTime": null,"bak1": null},{"wdqzId": 2,"forumId": 8,"userId": 68,"wdqzTitle": "768","wdqzContent": "8678","wdqzImg": null,"wdqzVoice": "768678","wdqzScore": null,"wdqzDianzan": null,"wdqzPublishTime": null,"wdqzModifyTime": null,"wdqzAdoption": null,"wdqzStatus": 1,"wdqzTopTime": null,"wdqzCanceTopTime": null,"bak1": null}]}}
     *
     * @catalog 测试文档/问答求助相关
     * @title   分页查询
     * @description 用户分页查询的接口
     * @param page  必选 int 当前页
     * @param size  必选 int 当前页显示条数
     * @method get
     * @url /wdqz/findPage/{page}/{size}
     * @return_param code int 返回状态码
     * @return_param msg string 返回状态码提示
     * @return_param data json 返回数据
     * @return_param wdqzId int 问答求助帖id
     * @return_param forumId int 求助版块ID
     * @return_param userId int 用户id
     * @return_param wdqzTitle varchar 求助问答标题
     * @return_param wdqzContent varchar 求助问答评论
     * @return_param wdqzImg varchar 求助问答图片
     * @return_param wdqzVoice varchar 求助问答音频
     * @return_param wdqzDianzan int 求助问答点赞数
     * @return_param wdqzPublishTime bigint 求助问答发帖时间
     * @return_param wdqzModifyTime bigint 求助问答审核时间
     * @return_param wdqzAdoption int 采纳评论
     * @return_param wdqzStatus int 求助问答审核时间
     * @return_param wdqzTopTime bigint 求助问答置顶时间
     * @return_param wdqzCanceTopTime bigint 求助问答取消置顶时间
     * @return_param bak1 bigint 预留字段
     * @remark 备注信息
     */
    @GetMapping(value = "/findPage/{page}/{size}")
    public Results findPage(@PathVariable int page, @PathVariable int size) {
        PageResult page1 = wdqzService.findPage(page, size);
        return ResultUtil.successce(page1);
    }
}
