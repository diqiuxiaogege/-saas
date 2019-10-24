package com.tuiba.saasadmininster.xxfx.controller;

import com.tuiba.saasadmininster.Exception.ResultUtil;
import com.tuiba.saasadmininster.Exception.Results;
import com.tuiba.saasadmininster.entity.PageResult;
import com.tuiba.saasadmininster.xxfx.bean.Xxfx;
import com.tuiba.saasadmininster.xxfx.service.XxfxService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 * @author : yangzhi
 * @date : 10:07 2019/10/18
 */
@RestController
@RequestMapping("/xxfx")
public class XxfxController {

    @Autowired
    private XxfxService xxfxService;

    /**
     * 保存信息
     *
     * @param xxfx
     * @return
     */
    /**
     * showdoc
     * <p>
     * * @return { "code": 200,"msg": "成功","data": {"xxfxId": 1,"userId": 12,"forumId": null,"xxfxTitle": null,"xxfxContent": "43","xxfxProductType": "43","xxfxDianzan": 43,"xxfxTime": 43,"xxfxModifyTime": null,"xxfxStatus": 5,"xxfxTopTime": 1571393485229,"xxfxCanceTopTime": null,"bak1": null}}
     *
     * @catalog 测试文档/学习分享相关
     * @title 保存学习分享信息
     * @description 用户保存学习分享信息的接口
     * @method post
     * @url /xxfx/saveXxfx
     * @return_param code int 返回状态码
     * @return_param msg string 返回状态码提示
     * @return_param data json 返回数据
     * @return_param xxfxId int 学习分享id
     * @return_param forumId int 子板块ID
     * @return_param userId int 用户id
     * @return_param xxfxTitle TEXT 学习分享标题
     * @return_param xxfxContent TEXT 学习分享评论
     * @return_param xxfxProductType varchar 学习分享分类
     * @return_param xxfxDianzan bigint 学习分享发帖时间
     * @return_param xxfxModifyTime bigint 学习分享审核时间
     * @return_param xxfxStatus int 学习分享审核状态
     * @return_param xxfxTopTime bigint 学习分享置顶时间
     * @return_param xxfxCanceTopTime bigint 学习分享取消置顶时间
     * @return_param bak1 bigint 预留字段
     * @remark 备注信息
     */
    @PostMapping(value = "/saveXxfx")
    public Results saveXxfx(@RequestBody Xxfx xxfx) {
        return xxfxService.saveXxfx(xxfx);
    }

    /**
     * 查询所有
     *
     * @return
     */
    /**
     * showdoc
     * <p>
     * * @return { "code": 200,"msg": "成功","data": {"xxfxId": 1,"userId": 12,"forumId": null,"xxfxTitle": null,"xxfxContent": "43","xxfxProductType": "43","xxfxDianzan": 43,"xxfxTime": 43,"xxfxModifyTime": null,"xxfxStatus": 5,"xxfxTopTime": 1571393485229,"xxfxCanceTopTime": null,"bak1": null}}
     *
     * @catalog 测试文档/学习分享相关
     * @title 查询学习分享所有信息
     * @description 用户查询学习分享所有信息的接口
     * @method GET
     * @url /xxfx/findAllXxfx
     * @return_param code int 返回状态码
     * @return_param msg string 返回状态码提示
     * @return_param data json 返回数据
     * @return_param xxfxId int 学习分享id
     * @return_param forumId int 子板块ID
     * @return_param userId int 用户id
     * @return_param xxfxTitle TEXT 学习分享标题
     * @return_param xxfxContent TEXT 学习分享评论
     * @return_param xxfxProductType varchar 学习分享分类
     * @return_param xxfxDianzan bigint 学习分享发帖时间
     * @return_param xxfxModifyTime bigint 学习分享审核时间
     * @return_param xxfxStatus int 学习分享审核状态
     * @return_param xxfxTopTime bigint 学习分享置顶时间
     * @return_param xxfxCanceTopTime bigint 学习分享取消置顶时间
     * @return_param bak1 bigint 预留字段
     * @remark 备注信息
     */
    @GetMapping(value = "/findAllXxfx")
    public Results findAllXxfx() {
        return xxfxService.findAllXxfx();
    }

    /**
     * 根据id获取
     *
     * @param xxfxId
     * @return
     */
    /**
     * showdoc
     * <p>
     * * @return { "code": 200,"msg": "成功","data": {"xxfxId": 1,"userId": 12,"forumId": null,"xxfxTitle": null,"xxfxContent": "43","xxfxProductType": "43","xxfxDianzan": 43,"xxfxTime": 43,"xxfxModifyTime": null,"xxfxStatus": 5,"xxfxTopTime": 1571393485229,"xxfxCanceTopTime": null,"bak1": null}}
     *
     * @catalog 测试文档/学习分享相关
     * @title 根据id查询学习分享所有信息
     * @description 用户根据id查询学习分享所有信息的接口
     * @method GET
     * @url /xxfx/findById/{xxfxId}
     * @return_param code int 返回状态码
     * @return_param msg string 返回状态码提示
     * @return_param data json 返回数据
     * @return_param xxfxId int 学习分享id
     * @return_param forumId int 子板块ID
     * @return_param userId int 用户id
     * @return_param xxfxTitle TEXT 学习分享标题
     * @return_param xxfxContent TEXT 学习分享评论
     * @return_param xxfxProductType varchar 学习分享分类
     * @return_param xxfxDianzan bigint 学习分享发帖时间
     * @return_param xxfxModifyTime bigint 学习分享审核时间
     * @return_param xxfxStatus int 学习分享审核状态
     * @return_param xxfxTopTime bigint 学习分享置顶时间
     * @return_param xxfxCanceTopTime bigint 学习分享取消置顶时间
     * @return_param bak1 bigint 预留字段
     * @remark 备注信息
     */
    @GetMapping(value = "/findById/{xxfxId}")
    public Results findById(@PathVariable Integer xxfxId) {
        return xxfxService.findById(xxfxId);
    }

    /**
     * 根据用户id查询
     *s
     * @param userId
     * @return
     */
    /**
     * showdoc
     * <p>
     * * @return { "code": 200,"msg": "成功","data": {"xxfxId": 1,"userId": 12,"forumId": null,"xxfxTitle": null,"xxfxContent": "43","xxfxProductType": "43","xxfxDianzan": 43,"xxfxTime": 43,"xxfxModifyTime": null,"xxfxStatus": 5,"xxfxTopTime": 1571393485229,"xxfxCanceTopTime": null,"bak1": null}}
     *
     * @catalog 测试文档/学习分享相关
     * @title 根据用户id查询学习分享所有信息
     * @description 用户根据用户id查询学习分享所有信息的接口
     * @method GET
     * @url /xxfx/findByUserId/{userId}
     * @return_param code int 返回状态码
     * @return_param msg string 返回状态码提示
     * @return_param data json 返回数据
     * @return_param xxfxId int 学习分享id
     * @return_param forumId int 子板块ID
     * @return_param userId int 用户id
     * @return_param xxfxTitle TEXT 学习分享标题
     * @return_param xxfxContent TEXT 学习分享评论
     * @return_param xxfxProductType varchar 学习分享分类
     * @return_param xxfxDianzan bigint 学习分享发帖时间
     * @return_param xxfxModifyTime bigint 学习分享审核时间
     * @return_param xxfxStatus int 学习分享审核状态
     * @return_param xxfxTopTime bigint 学习分享置顶时间
     * @return_param xxfxCanceTopTime bigint 学习分享取消置顶时间
     * @return_param bak1 bigint 预留字段
     * @remark 备注信息
     */
    @GetMapping(value = "/findByUserId/{userId}")
    public Results findByUserId(@PathVariable Integer userId) {
        return xxfxService.findByUserId(userId);
    }

    /**
     * 根据子版块id查询
     *
     * @param forumId
     * @return
     */
    /**
     * showdoc
     * <p>
     * * @return { "code": 200,"msg": "成功","data": {"xxfxId": 1,"userId": 12,"forumId": null,"xxfxTitle": null,"xxfxContent": "43","xxfxProductType": "43","xxfxDianzan": 43,"xxfxTime": 43,"xxfxModifyTime": null,"xxfxStatus": 5,"xxfxTopTime": 1571393485229,"xxfxCanceTopTime": null,"bak1": null}}
     *
     * @catalog 测试文档/学习分享相关
     * @title 根据子版块id查询学习分享所有信息
     * @description 用户根据子版块id查询学习分享所有信息的接口
     * @method GET
     * @url /xxfx/findByforumId/{forumId}
     * @return_param code int 返回状态码
     * @return_param msg string 返回状态码提示
     * @return_param data json 返回数据
     * @return_param xxfxId int 学习分享id
     * @return_param forumId int 子板块ID
     * @return_param userId int 用户id
     * @return_param xxfxTitle TEXT 学习分享标题
     * @return_param xxfxContent TEXT 学习分享评论
     * @return_param xxfxProductType varchar 学习分享分类
     * @return_param xxfxDianzan bigint 学习分享发帖时间
     * @return_param xxfxModifyTime bigint 学习分享审核时间
     * @return_param xxfxStatus int 学习分享审核状态
     * @return_param xxfxTopTime bigint 学习分享置顶时间
     * @return_param xxfxCanceTopTime bigint 学习分享取消置顶时间
     * @return_param bak1 bigint 预留字段
     * @remark 备注信息
     */
    @GetMapping(value = "/findByforumId/{forumId}")
    public Results findByForumId(Integer forumId) {
        return xxfxService.findByForumId(forumId);
    }

    /**
     * 根据发帖时间查询
     *
     * @param xxfxTime
     * @return
     */
    /**
     * showdoc
     * <p>
     * * @return { "code": 200,"msg": "成功","data": {"xxfxId": 1,"userId": 12,"forumId": null,"xxfxTitle": null,"xxfxContent": "43","xxfxProductType": "43","xxfxDianzan": 43,"xxfxTime": 43,"xxfxModifyTime": null,"xxfxStatus": 1,"xxfxTopTime": 1571393485229,"xxfxCanceTopTime": null,"bak1": null}}
     *
     * @catalog 测试文档/学习分享相关
     * @title 根据发帖时间查询学习分享所有信息
     * @description 用户根据发帖时间查询学习分享所有信息的接口
     * @method GET
     * @url /xxfx/findByXxfxTime/{xxfxTime}
     * @return_param code int 返回状态码
     * @return_param msg string 返回状态码提示
     * @return_param data json 返回数据
     * @return_param xxfxId int 学习分享id
     * @return_param forumId int 子板块ID
     * @return_param userId int 用户id
     * @return_param xxfxTitle TEXT 学习分享标题
     * @return_param xxfxContent TEXT 学习分享评论
     * @return_param xxfxProductType varchar 学习分享分类
     * @return_param xxfxDianzan bigint 学习分享发帖时间
     * @return_param xxfxModifyTime bigint 学习分享审核时间
     * @return_param xxfxStatus int 学习分享审核状态
     * @return_param xxfxTopTime bigint 学习分享置顶时间
     * @return_param xxfxCanceTopTime bigint 学习分享取消置顶时间
     * @return_param bak1 bigint 预留字段
     * @remark 备注信息
     */
    @GetMapping(value = "/findByXxfxTime/{xxfxTime}")
    public Results findByXxfxTime(Long xxfxTime) {
        return xxfxService.findByXxfxTime(xxfxTime);
    }

    /**
     * 根据帖子状态查询
     *
     * @param xxfxStatus
     * @return
     */
    /**
     * showdoc
     * <p>
     * * @return { "code": 200,"msg": "成功","data": {"xxfxId": 1,"userId": 12,"forumId": null,"xxfxTitle": null,"xxfxContent": "43","xxfxProductType": "43","xxfxDianzan": 43,"xxfxTime": 43,"xxfxModifyTime": null,"xxfxStatus": 1,"xxfxTopTime": 1571393485229,"xxfxCanceTopTime": null,"bak1": null}}
     *
     * @catalog 测试文档/学习分享相关
     * @title 根据帖子状态查询学习分享所有信息
     * @description 用户根据帖子状态查询学习分享所有信息的接口
     * @method GET
     * @url /xxfx/findByXxfxStatus/{xxfxStatus}
     * @return_param code int 返回状态码
     * @return_param msg string 返回状态码提示
     * @return_param data json 返回数据
     * @return_param xxfxId int 学习分享id
     * @return_param forumId int 子板块ID
     * @return_param userId int 用户id
     * @return_param xxfxTitle TEXT 学习分享标题
     * @return_param xxfxContent TEXT 学习分享评论
     * @return_param xxfxProductType varchar 学习分享分类
     * @return_param xxfxDianzan bigint 学习分享发帖时间
     * @return_param xxfxModifyTime bigint 学习分享审核时间
     * @return_param xxfxStatus int 学习分享审核状态
     * @return_param xxfxTopTime bigint 学习分享置顶时间
     * @return_param xxfxCanceTopTime bigint 学习分享取消置顶时间
     * @return_param bak1 bigint 预留字段
     * @remark 备注信息
     */
    @GetMapping(value = "/findByXxfxStatus/{xxfxStatus}")
    public Results findByXxfxStatus(Integer xxfxStatus) {
        return xxfxService.findByXxfxStatus(xxfxStatus);
    }

    /**
     * 审核通过
     *
     * @param map
     * @return
     */
    /**
     * showdoc
     * <p>
     * * @return { "code": 200,"msg": "成功","data": {"xxfxId": 1,"userId": 12,"forumId": null,"xxfxTitle": null,"xxfxContent": "43","xxfxProductType": "43","xxfxDianzan": 43,"xxfxTime": 43,"xxfxModifyTime": null,"xxfxStatus": 1,"xxfxTopTime": 1571393485229,"xxfxCanceTopTime": null,"bak1": null}}
     *
     * @catalog 测试文档/学习分享相关
     * @title 审核通过
     * @description 用户审核通过的接口
     * @method post
     * @url /xxfx/auditXxfx
     * @return_param code int 返回状态码
     * @return_param msg string 返回状态码提示
     * @return_param data json 返回数据
     * @return_param xxfxId int 学习分享id
     * @return_param forumId int 子板块ID
     * @return_param userId int 用户id
     * @return_param xxfxTitle TEXT 学习分享标题
     * @return_param xxfxContent TEXT 学习分享评论
     * @return_param xxfxProductType varchar 学习分享分类
     * @return_param xxfxDianzan bigint 学习分享发帖时间
     * @return_param xxfxModifyTime bigint 学习分享审核时间
     * @return_param xxfxStatus int 学习分享审核状态
     * @return_param xxfxTopTime bigint 学习分享置顶时间
     * @return_param xxfxCanceTopTime bigint 学习分享取消置顶时间
     * @return_param bak1 bigint 预留字段
     * @remark 备注信息
     */
    @PostMapping(value = "/auditXxfx")
    public Results auditXxfx(@RequestBody Map<String, Integer> map) {
        Integer xxfxId = map.get("xxfxId");
        return xxfxService.auditXxfx(xxfxId);
    }

    /**
     * 审核不通过
     *
     * @param map
     * @return
     */
    /**
     * showdoc
     * <p>
     * * @return { "code": 200,"msg": "成功","data": {"xxfxId": 1,"userId": 12,"forumId": null,"xxfxTitle": null,"xxfxContent": "43","xxfxProductType": "43","xxfxDianzan": 43,"xxfxTime": 43,"xxfxModifyTime": null,"xxfxStatus": 2,"xxfxTopTime": 1571393485229,"xxfxCanceTopTime": null,"bak1": null}}
     *
     * @catalog 测试文档/学习分享相关
     * @title 审核不通过
     * @description 用户审核不通过的接口
     * @method post
     * @url /xxfx/noAuditXxfx
     * @return_param code int 返回状态码
     * @return_param msg string 返回状态码提示
     * @return_param data json 返回数据
     * @return_param xxfxId int 学习分享id
     * @return_param forumId int 子板块ID
     * @return_param userId int 用户id
     * @return_param xxfxTitle TEXT 学习分享标题
     * @return_param xxfxContent TEXT 学习分享评论
     * @return_param xxfxProductType varchar 学习分享分类
     * @return_param xxfxDianzan bigint 学习分享发帖时间
     * @return_param xxfxModifyTime bigint 学习分享审核时间
     * @return_param xxfxStatus int 学习分享审核状态
     * @return_param xxfxTopTime bigint 学习分享置顶时间
     * @return_param xxfxCanceTopTime bigint 学习分享取消置顶时间
     * @return_param bak1 bigint 预留字段
     * @remark 备注信息
     */
    @PostMapping(value = "/noAuditXxfx")
    public Results noAuditXxfx(@RequestBody Map<String, Integer> map) {
        Integer xxfxId = map.get("xxfxId");
        return xxfxService.auditXxfx(xxfxId);
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
     * * @return { "code": 200,"msg": "成功","data": {"操作成功！"}}
     *
     * @catalog 测试文档/学习分享相关
     * @title 删除帖子
     * @description 用户删除帖子的接口
     * @method Delete
     * @url /xxfx/delXxfx
     * @return_param code int 返回状态码
     * @return_param msg string 返回状态码提示
     * @return_param data json 返回数据
     * @return_param xxfxId int 学习分享id
     * @return_param forumId int 子板块ID
     * @return_param userId int 用户id
     * @return_param xxfxTitle TEXT 学习分享标题
     * @return_param xxfxContent TEXT 学习分享评论
     * @return_param xxfxProductType varchar 学习分享分类
     * @return_param xxfxDianzan bigint 学习分享发帖时间
     * @return_param xxfxModifyTime bigint 学习分享审核时间
     * @return_param xxfxStatus int 学习分享审核状态
     * @return_param xxfxTopTime bigint 学习分享置顶时间
     * @return_param xxfxCanceTopTime bigint 学习分享取消置顶时间
     * @return_param bak1 bigint 预留字段
     * @remark 备注信息
     */
    @DeleteMapping(value = "/delXxfx")
    public Results delXxfx(@RequestBody Map<String, Integer[]> map) {
        Integer[] xxfxIds = map.get("xxfxId");
        return xxfxService.delXxfx(xxfxIds);
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
     * * @return { "code": 200,"msg": "成功","data": {"xxfxId": 1,"userId": 12,"forumId": null,"xxfxTitle": null,"xxfxContent": "43","xxfxProductType": "43","xxfxDianzan": 43,"xxfxTime": 43,"xxfxModifyTime": null,"xxfxStatus": 4,"xxfxTopTime": 1571393485229,"xxfxCanceTopTime": null,"bak1": null}}
     *
     * @catalog 测试文档/学习分享相关
     * @title 帖子置顶
     * @description 用户帖子置顶的接口
     * @method post
     * @url /xxfx/topXxfx
     * @return_param code int 返回状态码
     * @return_param msg string 返回状态码提示
     * @return_param data json 返回数据
     * @return_param xxfxId int 学习分享id
     * @return_param forumId int 子板块ID
     * @return_param userId int 用户id
     * @return_param xxfxTitle TEXT 学习分享标题
     * @return_param xxfxContent TEXT 学习分享评论
     * @return_param xxfxProductType varchar 学习分享分类
     * @return_param xxfxDianzan bigint 学习分享发帖时间
     * @return_param xxfxModifyTime bigint 学习分享审核时间
     * @return_param xxfxStatus int 学习分享审核状态
     * @return_param xxfxTopTime bigint 学习分享置顶时间
     * @return_param xxfxCanceTopTime bigint 学习分享取消置顶时间
     * @return_param bak1 bigint 预留字段
     * @remark 备注信息
     */
    @PostMapping(value = "/topXxfx")
    public Results topXxfx(@RequestBody Map<String, Integer> map) {
        Integer xxfxId = map.get("xxfxId");
        return xxfxService.topXxfx(xxfxId);
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
     * * @return { "code": 200,"msg": "成功","data": {"xxfxId": 1,"userId": 12,"forumId": null,"xxfxTitle": null,"xxfxContent": "43","xxfxProductType": "43","xxfxDianzan": 43,"xxfxTime": 43,"xxfxModifyTime": null,"xxfxStatus": 5,"xxfxTopTime": 1571393485229,"xxfxCanceTopTime": null,"bak1": null}}
     *
     * @catalog 测试文档/学习分享相关
     * @title 帖子置顶
     * @description 用户帖子置顶的接口
     * @method post
     * @url /xxfx/topXxfx
     * @return_param code int 返回状态码
     * @return_param msg string 返回状态码提示
     * @return_param data json 返回数据
     * @return_param xxfxId int 学习分享id
     * @return_param forumId int 子板块ID
     * @return_param userId int 用户id
     * @return_param xxfxTitle TEXT 学习分享标题
     * @return_param xxfxContent TEXT 学习分享评论
     * @return_param xxfxProductType varchar 学习分享分类
     * @return_param xxfxDianzan bigint 学习分享发帖时间
     * @return_param xxfxModifyTime bigint 学习分享审核时间
     * @return_param xxfxStatus int 学习分享审核状态
     * @return_param xxfxTopTime bigint 学习分享置顶时间
     * @return_param xxfxCanceTopTime bigint 学习分享取消置顶时间
     * @return_param bak1 bigint 预留字段
     * @remark 备注信息
     */
    @PostMapping(value = "/noTopXxfx")
    public Results noTopXxfx(@RequestBody Map<String, Integer> map) {
        Integer xxfxId = map.get("xxfxId");
        return xxfxService.noTopXxfx(xxfxId);
    }

    /**
     * 根据置顶状态时间查询
     *
     * @param xxfxStatus
     * @return
     */
    /**
     * showdoc
     * <p>
     * * @return { "code": 200,"msg": "成功","data": {"xxfxId": 1,"userId": 12,"forumId": null,"xxfxTitle": null,"xxfxContent": "43","xxfxProductType": "43","xxfxDianzan": 43,"xxfxTime": 43,"xxfxModifyTime": null,"xxfxStatus": 5,"xxfxTopTime": 1571393485229,"xxfxCanceTopTime": null,"bak1": null}}
     *
     * @catalog 测试文档/学习分享相关
     * @title 根据置顶状态时间查询
     * @description 用户根据置顶状态时间查询的接口
     * @method post
     * @url /xxfx/findAllStatus/{xxfxStatus}
     * @return_param code int 返回状态码
     * @return_param msg string 返回状态码提示
     * @return_param data json 返回数据
     * @return_param xxfxId int 学习分享id
     * @return_param forumId int 子板块ID
     * @return_param userId int 用户id
     * @return_param xxfxTitle TEXT 学习分享标题
     * @return_param xxfxContent TEXT 学习分享评论
     * @return_param xxfxProductType varchar 学习分享分类
     * @return_param xxfxDianzan bigint 学习分享发帖时间
     * @return_param xxfxModifyTime bigint 学习分享审核时间
     * @return_param xxfxStatus int 学习分享审核状态
     * @return_param xxfxTopTime bigint 学习分享置顶时间
     * @return_param xxfxCanceTopTime bigint 学习分享取消置顶时间
     * @return_param bak1 bigint 预留字段
     * @remark 备注信息
     */
    @GetMapping(value = "/findAllStatus/{xxfxStatus}")
    public Results findAllStatus(@PathVariable Integer xxfxStatus) {
        return xxfxService.findAllStatus(xxfxStatus);
    }

    /**
     * 分页查询
     */
    /**
     * showdoc
     * <p>
     * * @return { "code": 200,"msg": "成功","data": {"xxfxId": 1,"userId": 12,"forumId": null,"xxfxTitle": null,"xxfxContent": "43","xxfxProductType": "43","xxfxDianzan": 43,"xxfxTime": 43,"xxfxModifyTime": null,"xxfxStatus": 5,"xxfxTopTime": 1571393485229,"xxfxCanceTopTime": null,"bak1": null}}
     *
     * @catalog 测试文档/学习分享相关
     * @title 分页查询
     * @description 用户分页查询的接口
     * @method post
     * @url /xxfx/findPage/{page}/{size}
     * @return_param code int 返回状态码
     * @return_param msg string 返回状态码提示
     * @return_param data json 返回数据
     * @return_param xxfxId int 学习分享id
     * @return_param forumId int 子板块ID
     * @return_param userId int 用户id
     * @return_param xxfxTitle TEXT 学习分享标题
     * @return_param xxfxContent TEXT 学习分享评论
     * @return_param xxfxProductType varchar 学习分享分类
     * @return_param xxfxDianzan bigint 学习分享发帖时间
     * @return_param xxfxModifyTime bigint 学习分享审核时间
     * @return_param xxfxStatus int 学习分享审核状态
     * @return_param xxfxTopTime bigint 学习分享置顶时间
     * @return_param xxfxCanceTopTime bigint 学习分享取消置顶时间
     * @return_param bak1 bigint 预留字段
     * @remark 备注信息
     */
    @GetMapping(value = "/findPage/{page}/{size}")
    public Results findPage(@PathVariable int page, @PathVariable int size) {
        PageResult page1 = xxfxService.findPage(page, size);
        return ResultUtil.successce(page1);
    }
}
