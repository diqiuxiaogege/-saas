package com.tuiba.saasadmininster.xxfxComment.controller;

import com.tuiba.saasadmininster.Exception.Results;
import com.tuiba.saasadmininster.xxfxComment.bean.Xxfx_comment;
import com.tuiba.saasadmininster.xxfxComment.service.XxfxCommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 * @author : yangzhi
 * @date : 11:12 2019/10/18
 */
@RestController
@RequestMapping("/xxfxComment")
public class XxfxCommentController {

    @Autowired
    private XxfxCommentService xxfxCommentService;

    /**
     * 保存信息
     *
     * @param xxfxComment
     * @return
     */
    /**
     * showdoc
     *
     * @param xxfxComment 必选     实体
     *                    * @return {"code": 200,"msg": "成功","data": {"wdqzCommentId": 1,"userId": 2,"wdqzId": 3,"wdqzCommentContent": "32","wqdzCommentDate": 212,"wqdzCommentTypeId": 323,"wdqzCommentStatus": 1,"wdqzCommentStatusTime": 32,"bak1": null}}
     * @catalog 测试文档/学习分享评论相关
     * @title 保存学习分享评论信息
     * @description 用户保存学习分享评论信息的接口
     * @method post
     * @url /xxfxComment/saveXxfxComment
     * @return_param code int 返回状态码
     * @return_param msg string 返回状态码提示
     * @return_param data json 返回数据
     * @return_param xxfxCommentId int 学习分享帖评论id
     * @return_param userId int 用户id
     * @return_param xxfxId int 学习分享ID
     * @return_param xxfxCommentContent varchar 学习分享帖评论内容
     * @return_param xxfxCommentDate bigint 学习分享评论时间
     * @return_param xxfxCommentTypeId int 学习分享评论id
     * @return_param xxfxCommentStatus int 学习分享评论审核状态
     * @return_param xxfxCommentStatusTime bigint 学习分享帖评论审核时间
     * @return_param bak1 bigint 预留字段
     * @remark 备注信息
     */
    @PostMapping(value = "/saveXxfxComment")
    public Results saveXxfxComment(@RequestBody Xxfx_comment xxfxComment) {
        return xxfxCommentService.saveXxfxComment(xxfxComment);

    }

    /**
     * 查询所有
     *
     * @return
     */
    /**
     * showdoc
     * * @return {"code": 200,"msg": "成功","data": {"wdqzCommentId": 1,"userId": 2,"wdqzId": 3,"wdqzCommentContent": "32","wqdzCommentDate": 212,"wqdzCommentTypeId": 323,"wdqzCommentStatus": 1,"wdqzCommentStatusTime": 32,"bak1": null}}
     *
     * @catalog 测试文档/学习分享评论相关
     * @title 查询所有学习分享评论信息
     * @description 用户查询所有学习分享评论信息的接口
     * @method get
     * @url /xxfxComment/findAllXxfx_comment
     * @return_param code int 返回状态码
     * @return_param msg string 返回状态码提示
     * @return_param data json 返回数据
     * @return_param xxfxCommentId int 学习分享帖评论id
     * @return_param userId int 用户id
     * @return_param xxfxId int 学习分享ID
     * @return_param xxfxCommentContent varchar 学习分享帖评论内容
     * @return_param xxfxCommentDate bigint 学习分享评论时间
     * @return_param xxfxCommentTypeId int 学习分享评论id
     * @return_param xxfxCommentStatus int 学习分享评论审核状态
     * @return_param xxfxCommentStatusTime bigint 学习分享帖评论审核时间
     * @return_param bak1 bigint 预留字段
     * @remark 备注信息
     */
    @GetMapping(value = "/findAllXxfx_comment")
    public Results findAllXxfx_comment() {
        return xxfxCommentService.findAllXxfx_comment();
    }

    /**
     * 根据id查询
     *
     * @param xxfxCommentId
     * @return
     */
    /**
     * showdoc
     * * @return {"code": 200,"msg": "成功","data": {"wdqzCommentId": 1,"userId": 2,"wdqzId": 3,"wdqzCommentContent": "32","wqdzCommentDate": 212,"wqdzCommentTypeId": 323,"wdqzCommentStatus": 1,"wdqzCommentStatusTime": 32,"bak1": null}}
     *
     * @catalog 测试文档/学习分享评论相关
     * @title 根据id查询学习分享评论信息
     * @description 用户根据id查询学习分享评论信息的接口
     * @method get
     * @url /xxfxComment/findById/{xxfxCommentId}
     * @return_param code int 返回状态码
     * @return_param msg string 返回状态码提示
     * @return_param data json 返回数据
     * @return_param xxfxCommentId int 学习分享帖评论id
     * @return_param userId int 用户id
     * @return_param xxfxId int 学习分享ID
     * @return_param xxfxCommentContent varchar 学习分享帖评论内容
     * @return_param xxfxCommentDate bigint 学习分享评论时间
     * @return_param xxfxCommentTypeId int 学习分享评论id
     * @return_param xxfxCommentStatus int 学习分享评论审核状态
     * @return_param xxfxCommentStatusTime bigint 学习分享帖评论审核时间
     * @return_param bak1 bigint 预留字段
     * @remark 备注信息
     */
    @GetMapping(value = "/findById/{xxfxCommentId}")
    public Results findById(@PathVariable Integer xxfxCommentId) {
        return xxfxCommentService.findById(xxfxCommentId);
    }

    /**
     * 根据分享id查询
     *
     * @param xxfxId
     * @return
     */
    /**
     * showdoc
     * * @return {"code": 200,"msg": "成功","data": {"wdqzCommentId": 1,"userId": 2,"wdqzId": 3,"wdqzCommentContent": "32","wqdzCommentDate": 212,"wqdzCommentTypeId": 323,"wdqzCommentStatus": 1,"wdqzCommentStatusTime": 32,"bak1": null}}
     *
     * @catalog 测试文档/学习分享评论相关
     * @title 根据分享id查询学习分享评论信息
     * @description 用户根据分享id查询学习分享评论信息的接口
     * @method get
     * @url /xxfxComment/findByXxfxId/{xxfxId}
     * @return_param code int 返回状态码
     * @return_param msg string 返回状态码提示
     * @return_param data json 返回数据
     * @return_param xxfxCommentId int 学习分享帖评论id
     * @return_param userId int 用户id
     * @return_param xxfxId int 学习分享ID
     * @return_param xxfxCommentContent varchar 学习分享帖评论内容
     * @return_param xxfxCommentDate bigint 学习分享评论时间
     * @return_param xxfxCommentTypeId int 学习分享评论id
     * @return_param xxfxCommentStatus int 学习分享评论审核状态
     * @return_param xxfxCommentStatusTime bigint 学习分享帖评论审核时间
     * @return_param bak1 bigint 预留字段
     * @remark 备注信息
     */
    @GetMapping(value = "/findByXxfxId/{xxfxId}")
    public Results findByXxfxId(@PathVariable Integer xxfxId) {
        return xxfxCommentService.findByXxfxId(xxfxId);
    }

    /**
     * 根据用户id查询
     *
     * @param userId
     * @return
     */
    /**
     * showdoc
     * * @return {"code": 200,"msg": "成功","data": {"wdqzCommentId": 1,"userId": 2,"wdqzId": 3,"wdqzCommentContent": "32","wqdzCommentDate": 212,"wqdzCommentTypeId": 323,"wdqzCommentStatus": 1,"wdqzCommentStatusTime": 32,"bak1": null}}
     * @catalog 测试文档/学习分享评论相关
     * @title 根据用户id查询学习分享评论信息
     * @description 用户根据用户id查询学习分享评论信息的接口
     * @method get
     * @url /xxfxComment/findByUserId/{userId}
     * @return_param code int 返回状态码
     * @return_param msg string 返回状态码提示
     * @return_param data json 返回数据
     * @return_param xxfxCommentId int 学习分享帖评论id
     * @return_param userId int 用户id
     * @return_param xxfxId int 学习分享ID
     * @return_param xxfxCommentContent varchar 学习分享帖评论内容
     * @return_param xxfxCommentDate bigint 学习分享评论时间
     * @return_param xxfxCommentTypeId int 学习分享评论id
     * @return_param xxfxCommentStatus int 学习分享评论审核状态
     * @return_param xxfxCommentStatusTime bigint 学习分享帖评论审核时间
     * @return_param bak1 bigint 预留字段
     * @remark 备注信息
     */
    @GetMapping(value = "/findByUserId/{userId}")
    public Results findByUserId(@PathVariable Integer userId) {
        return xxfxCommentService.findByUserId(userId);
    }

    /**
     * 删除
     *
     * @param map
     * @return
     */
    /**
     * showdoc
     * * @return {"code": 200,"msg": "成功","data": {"操作成功！"}}
     * @catalog 测试文档/学习分享评论相关
     * @title 删除
     * @description 用户删除的接口
     * @method post
     * @url /xxfxComment/auditXxfx_comment
     * @return_param code int 返回状态码
     * @return_param msg string 返回状态码提示
     * @return_param data json 返回数据
     * @return_param xxfxCommentId int 学习分享帖评论id
     * @return_param userId int 用户id
     * @return_param xxfxId int 学习分享ID
     * @return_param xxfxCommentContent varchar 学习分享帖评论内容
     * @return_param xxfxCommentDate bigint 学习分享评论时间
     * @return_param xxfxCommentTypeId int 学习分享评论id
     * @return_param xxfxCommentStatus int 学习分享评论审核状态
     * @return_param xxfxCommentStatusTime bigint 学习分享帖评论审核时间
     * @return_param bak1 bigint 预留字段
     * @remark 备注信息
     */
    @DeleteMapping(value = "/delXxfxComment")
    public Results delXxfxComment(@RequestBody Map<String, Integer[]> map) {
        Integer[] xxfxCommentIds = map.get("xxfxCommentId");
        return xxfxCommentService.delXxfxComment(xxfxCommentIds);
    }

    /**
     * 审核通过
     *
     * @param map
     * @return
     */
    /**
     * showdoc
     * * @return {"code": 200,"msg": "成功","data": {"wdqzCommentId": 1,"userId": 2,"wdqzId": 3,"wdqzCommentContent": "32","wqdzCommentDate": 212,"wqdzCommentTypeId": 323,"wdqzCommentStatus": 1,"wdqzCommentStatusTime": 32,"bak1": null}}
     * @catalog 测试文档/学习分享评论相关
     * @title 审核通过
     * @description 用户审核通过的接口
     * @method post
     * @url /xxfxComment/auditXxfx_comment
     * @return_param code int 返回状态码
     * @return_param msg string 返回状态码提示
     * @return_param data json 返回数据
     * @return_param xxfxCommentId int 学习分享帖评论id
     * @return_param userId int 用户id
     * @return_param xxfxId int 学习分享ID
     * @return_param xxfxCommentContent varchar 学习分享帖评论内容
     * @return_param xxfxCommentDate bigint 学习分享评论时间
     * @return_param xxfxCommentTypeId int 学习分享评论id
     * @return_param xxfxCommentStatus int 学习分享评论审核状态
     * @return_param xxfxCommentStatusTime bigint 学习分享帖评论审核时间
     * @return_param bak1 bigint 预留字段
     * @remark 备注信息
     */
    @PostMapping(value = "/auditXxfx_comment")
    public Results auditXxfx_comment(@RequestBody Map<String, Integer> map) {
        Integer xxfxCommentId = map.get("xxfxCommentId");
        return xxfxCommentService.auditXxfx_comment(xxfxCommentId);

    }

    /**
     * 审核不通过
     *
     * @param map
     * @return
     */
    /**
     * showdoc
     * * @return {"code": 200,"msg": "成功","data": {"wdqzCommentId": 1,"userId": 2,"wdqzId": 3,"wdqzCommentContent": "32","wqdzCommentDate": 212,"wqdzCommentTypeId": 323,"wdqzCommentStatus": 2,"wdqzCommentStatusTime": 32,"bak1": null}}
     * @catalog 测试文档/学习分享评论相关
     * @title 审核不通过
     * @description 用户审核不通过的接口
     * @method post
     * @url /xxfxComment/noAuditXxfx_comment
     * @return_param code int 返回状态码
     * @return_param msg string 返回状态码提示
     * @return_param data json 返回数据
     * @return_param xxfxCommentId int 学习分享帖评论id
     * @return_param userId int 用户id
     * @return_param xxfxId int 学习分享ID
     * @return_param xxfxCommentContent varchar 学习分享帖评论内容
     * @return_param xxfxCommentDate bigint 学习分享评论时间
     * @return_param xxfxCommentTypeId int 学习分享评论id
     * @return_param xxfxCommentStatus int 学习分享评论审核状态
     * @return_param xxfxCommentStatusTime bigint 学习分享帖评论审核时间
     * @return_param bak1 bigint 预留字段
     * @remark 备注信息
     */
    @PostMapping(value = "/noAuditXxfx_comment")
    public Results noAuditXxfx_comment(@RequestBody Map<String, Integer> map) {
        Integer xxfxCommentId = map.get("xxfxCommentId");
        return xxfxCommentService.auditXxfx_comment(xxfxCommentId);
    }
}
