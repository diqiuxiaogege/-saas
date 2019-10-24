package com.tuiba.saasadmininster.forum.controller;

import com.tuiba.saasadmininster.Exception.Results;
import com.tuiba.saasadmininster.forum.bean.Forum;
import com.tuiba.saasadmininster.forum.service.ForumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 * @author : yangzhi
 * @date : 17:10 2019/10/19
 */
@RestController
@RequestMapping(value = "/forum")
public class ForumController {
    @Autowired
    private ForumService forumService;

    /**
     * 保存信息
     *
     * @param forum
     */
    /**
     * showdoc
     * * @return {"code": 200,"msg": "成功","data": {"forumId": 1,"forumName": "2","forumDate": null,"forumModifyDate": null,"forumType": 3,"productId": 2,"bak1": null}}
     * @catalog 测试文档/问答求助版块评论相关
     * @title 保存信息
     * @description 用户保存信息的接口
     * @method post
     * @url /forum/saveForum
     * @return_param code int 返回状态码
     * @return_param msg string 返回状态码提示
     * @return_param data json 返回数据
     * @return_param forumId int 问答求助版块id
     * @return_param forumName varchar 问答求助版块名称
     * @return_param forumDate bigint 问答求助版块添加时间
     * @return_param forumModifyDate bigint 问答求助版块修改时间
     * @return_param forumType int 问答求助板块内容类型
     * @return_param productId int 产品id
     * @return_param bak1 bigint 预留字段
     * @remark 备注信息
     */
    @PostMapping(value = "/saveForum")
    public Results saveForum(@RequestBody Forum forum) {
        return forumService.saveForum(forum);
    }

    /**
     * 查询所有
     *
     * @return
     */
    /**
     * showdoc
     * * @return {"code": 200,"msg": "成功","data": {"forumId": 1,"forumName": "2","forumDate": null,"forumModifyDate": null,"forumType": 3,"productId": 2,"bak1": null}}
     * @catalog 测试文档/问答求助版块评论相关
     * @title 查询所有
     * @description 用户查询所有的接口
     * @method get
     * @url /forum/findAllForum
     * @return_param code int 返回状态码
     * @return_param msg string 返回状态码提示
     * @return_param data json 返回数据
     * @return_param forumId int 问答求助版块id
     * @return_param forumName varchar 问答求助版块名称
     * @return_param forumDate bigint 问答求助版块添加时间
     * @return_param forumModifyDate bigint 问答求助版块修改时间
     * @return_param forumType int 问答求助板块内容类型
     * @return_param productId int 产品id
     * @return_param bak1 bigint 预留字段
     * @remark 备注信息
     */
    @GetMapping(value = "/findAllForum")
    public Results findAllForum() {
        return forumService.findAllForum();
    }

    /**
     * 根据id查询
     *
     * @param forumId
     * @return
     */
    /**
     * showdoc
     * @param forumId 必选 int 版块id
     * * @return {"code": 200,"msg": "成功","data": {"forumId": 1,"forumName": "2","forumDate": null,"forumModifyDate": null,"forumType": 3,"productId": 2,"bak1": null}}
     * @catalog 测试文档/问答求助版块评论相关
     * @title 根据id查询
     * @description 用户根据id查询的接口
     * @method get
     * @url /forum/findById/{forumId}
     * @return_param code int 返回状态码
     * @return_param msg string 返回状态码提示
     * @return_param data json 返回数据
     * @return_param forumId int 问答求助版块id
     * @return_param forumName varchar 问答求助版块名称
     * @return_param forumDate bigint 问答求助版块添加时间
     * @return_param forumModifyDate bigint 问答求助版块修改时间
     * @return_param forumType int 问答求助板块内容类型
     * @return_param productId int 产品id
     * @return_param bak1 bigint 预留字段
     * @remark 备注信息
     */
    @GetMapping(value = "/findById/{forumId}")
    public Results findById(@PathVariable Integer forumId) {
        return forumService.findById(forumId);
    }

    /**
     * 根据版块名称查询
     *
     * @param forumName
     * @return
     */
    /**
     * showdoc
     * @param forumName 必选 string 版块名称
     * * @return {"code": 200,"msg": "成功","data": {"forumId": 1,"forumName": "2","forumDate": null,"forumModifyDate": null,"forumType": 3,"productId": 2,"bak1": null}}
     * @catalog 测试文档/问答求助版块评论相关
     * @title 根据版块名称查询
     * @description 用户根据版块名称查询的接口
     * @method get
     * @url /forum/findByForumName/{forumName}
     * @return_param code int 返回状态码
     * @return_param msg string 返回状态码提示
     * @return_param data json 返回数据
     * @return_param forumId int 问答求助版块id
     * @return_param forumName varchar 问答求助版块名称
     * @return_param forumDate bigint 问答求助版块添加时间
     * @return_param forumModifyDate bigint 问答求助版块修改时间
     * @return_param forumType int 问答求助板块内容类型
     * @return_param productId int 产品id
     * @return_param bak1 bigint 预留字段
     * @remark 备注信息
     */
    @GetMapping(value = "/findByForumName/{forumName}")
    public Results findByForumName(@PathVariable String forumName) {
        return forumService.findByForumName(forumName);
    }

    /**
     * 删除版块
     *
     * @param map
     * @return
     */
    /**
     * showdoc
     * @param forumId 必选 int 版块id
     * * @return {"code": 200,"msg": "成功","data": {"forumId": 1,"forumName": "2","forumDate": null,"forumModifyDate": null,"forumType": 3,"productId": 2,"bak1": null}}
     * @catalog 测试文档/问答求助版块评论相关
     * @title 删除版块
     * @description 用户删除版块的接口
     * @method Delete
     * @url /forum/delWdqz_comment
     * @return_param code int 返回状态码
     * @return_param msg string 返回状态码提示
     * @return_param data json 返回数据
     * @return_param forumId int 问答求助版块id
     * @return_param forumName varchar 问答求助版块名称
     * @return_param forumDate bigint 问答求助版块添加时间
     * @return_param forumModifyDate bigint 问答求助版块修改时间
     * @return_param forumType int 问答求助板块内容类型
     * @return_param productId int 产品id
     * @return_param bak1 bigint 预留字段
     * @remark 备注信息
     */
    @DeleteMapping(value = "/delWdqz_comment")
    public Results delFourm(@RequestBody Map<String, Integer[]> map) {
        Integer[] forumIds = map.get("forumId");
        return forumService.delFourm(forumIds);
    }
}
