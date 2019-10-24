package com.tuiba.saasadmininster.wdqzComment.controller;

import com.tuiba.saasadmininster.Exception.Results;
import com.tuiba.saasadmininster.wdqzComment.bean.Wdqz_comment;
import com.tuiba.saasadmininster.wdqzComment.service.Wdqz_commentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 * @author : yangzhi
 * @date : 16:49 2019/10/19
 */
@RequestMapping(value = "wdqzComment")
@RestController
public class WdqzCommentController {

    @Autowired
    private Wdqz_commentService wdqz_commentService;

    /**
     * 保存信息
     *
     * @param wdqz_comment
     * @return
     */
    /**
     * showdoc
     * @param wdqz_comment 必选     商品实体
     * * @return {"code": 200,"msg": "成功","data": {"wdqzCommentId": 1,"userId": 2,"wdqzId": 3,"wdqzCommentContent": "32","wqdzCommentDate": 212,"wqdzCommentTypeId": 323,"wdqzCommentStatus": 1,"wdqzCommentStatusTime": 32,"bak1": null}}
     * @catalog 测试文档/问答求助评论相关
     * @title 保存问答求助评论信息
     * @description 用户保存问答求助评论信息的接口
     * @method post
     * @url /wdqzComment/saveWdqz_comment
     * @return_param code int 返回状态码
     * @return_param msg string 返回状态码提示
     * @return_param data json 返回数据
     * @return_param wdqzCommentId int 问答求助帖评论id
     * @return_param wdqzId int 问答求助帖ID
     * @return_param userid int 用户ID
     * @return_param wdqzCommentContent varchar 问答求助帖评论内容
     * @return_param wqdzCommentDate bigint 问答求助帖评论时间
     * @return_param wqdzCommentTypeId int 问答求助帖评论者id
     * @return_param wdqzCommentStatus int 问答求助帖评论审核状态
     * @return_param wdqzCommentStatusTime bigint 问答求助帖评论审核时间
     * @return_param bak1 bigint 预留字段
     * @remark 备注信息
     */
    @PostMapping(value = "/saveWdqz_comment")
    public Results saveWdqz_comment(@RequestBody Wdqz_comment wdqz_comment) {
        return wdqz_commentService.saveWdqz_comment(wdqz_comment);

    }

    /**
     * 查询所有
     *
     * @return
     */
    /**
     * showdoc
     * <p>
     * * @return {"code": 200,"msg": "成功","data": {"wdqzCommentId": 1,"userId": 2,"wdqzId": 3,"wdqzCommentContent": "32","wqdzCommentDate": 212,"wqdzCommentTypeId": 323,"wdqzCommentStatus": 1,"wdqzCommentStatusTime": 32,"bak1": null}}
     *
     * @catalog 测试文档/问答求助评论相关
     * @title 查询问答求助评论信息
     * @description 用户查询问答求助评论信息的接口
     * @method get
     * @url /wdqzComment/findAllWdqz_comment
     * @return_param code int 返回状态码
     * @return_param msg string 返回状态码提示
     * @return_param data json 返回数据
     * @return_param wdqzCommentId int 问答求助帖评论id
     * @return_param wdqzId int 问答求助帖ID
     * @return_param wdqzCommentContent varchar 问答求助帖评论内容
     * @return_param wqdzCommentDate bigint 问答求助帖评论时间
     * @return_param wqdzCommentTypeId int 问答求助帖评论者id
     * @return_param wdqzCommentStatus int 问答求助帖评论审核状态
     * @return_param wdqzCommentStatusTime bigint 问答求助帖评论审核时间
     * @return_param bak1 bigint 预留字段
     * @remark 备注信息
     */
    @GetMapping(value = "/findAllWdqz_comment")
    public Results findAllWdqz_comment() {
        return wdqz_commentService.findAllWdqz_comment();
    }

    /**
     * 根据id查询
     *
     * @param wdqzCommentId
     * @return
     */
    /**
     * showdoc
     *
     * @param wdqzCommentId 必选   int  评论id
     *                      * @return {"code": 200,"msg": "成功","data": {"wdqzCommentId": 1,"userId": 2,"wdqzId": 3,"wdqzCommentContent": "32","wqdzCommentDate": 212,"wqdzCommentTypeId": 323,"wdqzCommentStatus": 1,"wdqzCommentStatusTime": 32,"bak1": null}}
     * @catalog 测试文档/问答求助评论相关
     * @title 根据id查询问答求助评论信息
     * @description 用户根据id查询问答求助评论信息的接口
     * @method get
     * @url /wdqzComment/findById/{wdqzCommentId}
     * @return_param code int 返回状态码
     * @return_param msg string 返回状态码提示
     * @return_param data json 返回数据
     * @return_param wdqzCommentId int 问答求助帖评论id
     * @return_param wdqzId int 问答求助帖ID
     * @return_param wdqzCommentContent varchar 问答求助帖评论内容
     * @return_param wqdzCommentDate bigint 问答求助帖评论时间
     * @return_param wqdzCommentTypeId int 问答求助帖评论者id
     * @return_param wdqzCommentStatus int 问答求助帖评论审核状态
     * @return_param wdqzCommentStatusTime bigint 问答求助帖评论审核时间
     * @return_param bak1 bigint 预留字段
     * @remark 备注信息
     */
    @GetMapping(value = "/findById/{wdqzCommentId}")
    public Results findById(@PathVariable Integer wdqzCommentId) {
        return wdqz_commentService.findById(wdqzCommentId);
    }

    /**
     * 根据评论时间查询
     *
     * @param wqdzCommentDate
     * @return
     */
    /**
     * showdoc
     *
     * @param wqdzCommentDate 必选   bigint  评论时间
     *                        * @return {"code": 200,"msg": "成功","data": {"wdqzCommentId": 1,"userId": 2,"wdqzId": 3,"wdqzCommentContent": "32","wqdzCommentDate": 212,"wqdzCommentTypeId": 323,"wdqzCommentStatus": 1,"wdqzCommentStatusTime": 32,"bak1": null}}
     * @catalog 测试文档/问答求助评论相关
     * @title 根据时间查询问答求助评论信息
     * @description 用户根据时间查询问答求助评论信息的接口
     * @method get
     * @url /wdqzComment/findByCommentDate/{wqdzCommentDate}
     * @return_param code int 返回状态码
     * @return_param msg string 返回状态码提示
     * @return_param data json 返回数据
     * @return_param wdqzCommentId int 问答求助帖评论id
     * @return_param wdqzId int 问答求助帖ID
     * @return_param wdqzCommentContent varchar 问答求助帖评论内容
     * @return_param wqdzCommentDate bigint 问答求助帖评论时间
     * @return_param wqdzCommentTypeId int 问答求助帖评论者id
     * @return_param wdqzCommentStatus int 问答求助帖评论审核状态
     * @return_param wdqzCommentStatusTime bigint 问答求助帖评论审核时间
     * @return_param bak1 bigint 预留字段
     * @remark 备注信息
     */
    @GetMapping(value = "/findByCommentDate/{wqdzCommentDate}")
    public Results findByCommentDate(Long wqdzCommentDate) {
        return wdqz_commentService.findByCommentDate(wqdzCommentDate);
    }

    /**
     * 根据用户id查询
     *
     * @param userId
     * @return
     */
    /**
     * showdoc
     *
     * @param userId 必选   int  评论用户时间
     *               * @return {"code": 200,"msg": "成功","data": {"wdqzCommentId": 1,"userId": 2,"wdqzId": 3,"wdqzCommentContent": "32","wqdzCommentDate": 212,"wqdzCommentTypeId": 323,"wdqzCommentStatus": 1,"wdqzCommentStatusTime": 32,"bak1": null}}
     * @catalog 测试文档/问答求助评论相关
     * @title 根据用户id查询问答求助评论信息
     * @description 用户根据用户id查询问答求助评论信息的接口
     * @method get
     * @url /wdqzComment/findByUserId/{userId}
     * @return_param code int 返回状态码
     * @return_param msg string 返回状态码提示
     * @return_param data json 返回数据
     * @return_param wdqzCommentId int 问答求助帖评论id
     * @return_param wdqzId int 问答求助帖ID
     * @return_param wdqzCommentContent varchar 问答求助帖评论内容
     * @return_param wqdzCommentDate bigint 问答求助帖评论时间
     * @return_param wqdzCommentTypeId int 问答求助帖评论者id
     * @return_param wdqzCommentStatus int 问答求助帖评论审核状态
     * @return_param wdqzCommentStatusTime bigint 问答求助帖评论审核时间
     * @return_param bak1 bigint 预留字段
     * @remark 备注信息
     */
    @GetMapping(value = "/findByUserId/{userId}")
    public Results findByUserId(Integer userId) {
        return wdqz_commentService.findByUserId(userId);
    }

    /**
     * 审核通过
     *
     * @param map
     * @return
     */
    /**
     * showdoc
     *
     * @param wdqzCommentId 必选   int  评论用户时间
     *               * @return {"code": 200,"msg": "成功","data": {"wdqzCommentId": 1,"userId": 2,"wdqzId": 3,"wdqzCommentContent": "32","wqdzCommentDate": 212,"wqdzCommentTypeId": 323,"wdqzCommentStatus": 1,"wdqzCommentStatusTime": 32,"bak1": null}}
     * @catalog 测试文档/问答求助评论相关
     * @title 审核通过
     * @description 用户审核通过的接口
     * @method post
     * @url /wdqzComment/auditXxfx_comment
     * @return_param code int 返回状态码
     * @return_param msg string 返回状态码提示
     * @return_param data json 返回数据
     * @return_param wdqzCommentId int 问答求助帖评论id
     * @return_param wdqzId int 问答求助帖ID
     * @return_param wdqzCommentContent varchar 问答求助帖评论内容
     * @return_param wqdzCommentDate bigint 问答求助帖评论时间
     * @return_param wqdzCommentTypeId int 问答求助帖评论者id
     * @return_param wdqzCommentStatus int 问答求助帖评论审核状态
     * @return_param wdqzCommentStatusTime bigint 问答求助帖评论审核时间
     * @return_param bak1 bigint 预留字段
     * @remark 备注信息
     */
    @PostMapping(value = "/auditXxfx_comment")
    public Results auditXxfx_comment(@RequestBody Map<String, Integer> map) {
        Integer wdqzCommentId = map.get("wdqzCommentId");
        return wdqz_commentService.auditWdqz_comment(wdqzCommentId);

    }

    /**
     * 审核不通过
     *
     * @param map
     * @return
     */
    /**
     * showdoc
     *
     * @param wdqzCommentId 必选   int  评论用户时间
     *               * @return {"code": 200,"msg": "成功","data": {"wdqzCommentId": 1,"userId": 2,"wdqzId": 3,"wdqzCommentContent": "32","wqdzCommentDate": 212,"wqdzCommentTypeId": 323,"wdqzCommentStatus": 2,"wdqzCommentStatusTime": 32,"bak1": null}}
     * @catalog 测试文档/问答求助评论相关
     * @title 审核不通过
     * @description 用户审核不通过的接口
     * @method post
     * @url /wdqzComment/noAuditXxfx_comment
     * @return_param code int 返回状态码
     * @return_param msg string 返回状态码提示
     * @return_param data json 返回数据
     * @return_param wdqzCommentId int 问答求助帖评论id
     * @return_param wdqzId int 问答求助帖ID
     * @return_param wdqzCommentContent varchar 问答求助帖评论内容
     * @return_param wqdzCommentDate bigint 问答求助帖评论时间
     * @return_param wqdzCommentTypeId int 问答求助帖评论者id
     * @return_param wdqzCommentStatus int 问答求助帖评论审核状态
     * @return_param wdqzCommentStatusTime bigint 问答求助帖评论审核时间
     * @return_param bak1 bigint 预留字段
     * @remark 备注信息
     */
    @PostMapping(value = "/noAuditXxfx_comment")
    public Results noAuditXxfx_comment(@RequestBody Map<String, Integer> map) {
        Integer wdqzCommentId = map.get("wdqzCommentId");
        return wdqz_commentService.auditWdqz_comment(wdqzCommentId);

    }

    /**
     * 删除
     *
     * @param map
     * @return
     */
    /**
     * showdoc
     *
     * @param wdqzCommentId 必选   int  评论用户时间
     *               * @return {"code": 200,"msg": "成功","data": {"操作成功！"}}
     * @catalog 测试文档/问答求助评论相关
     * @title 审核不通过
     * @description 用户审核不通过的接口
     * @method Delete
     * @url /wdqzComment/noAuditXxfx_comment
     * @return_param code int 返回状态码
     * @return_param msg string 返回状态码提示
     * @return_param data json 返回数据
     * @return_param wdqzCommentId int 问答求助帖评论id
     * @return_param wdqzId int 问答求助帖ID
     * @return_param wdqzCommentContent varchar 问答求助帖评论内容
     * @return_param wqdzCommentDate bigint 问答求助帖评论时间
     * @return_param wqdzCommentTypeId int 问答求助帖评论者id
     * @return_param wdqzCommentStatus int 问答求助帖评论审核状态
     * @return_param wdqzCommentStatusTime bigint 问答求助帖评论审核时间
     * @return_param bak1 bigint 预留字段
     * @remark 备注信息
     */
    @DeleteMapping(value = "/delWdqz_comment")
    public Results delWdqz_comment(@RequestBody Map<String, Integer[]> map) {
        Integer[] wdqzCommentIds = map.get("wdqzCommentId");
        return wdqz_commentService.delWdqz_comment(wdqzCommentIds);
    }

}
