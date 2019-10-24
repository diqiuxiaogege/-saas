package com.tuiba.saasadmininster.shop.controller;

import com.tuiba.saasadmininster.Exception.ResultUtil;
import com.tuiba.saasadmininster.Exception.Results;
import com.tuiba.saasadmininster.entity.PageResult;
import com.tuiba.saasadmininster.shop.bean.Shop;
import com.tuiba.saasadmininster.shop.service.ShopService;
import org.apache.commons.net.ftp.FTPClient;
import org.apache.commons.net.ftp.FTPReply;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MaxUploadSizeExceededException;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import java.util.UUID;

/**
 * @author : yangzhi
 * @date : 18:20 2019/10/11
 */

@RestController
@RequestMapping("/shop")
public class ShopController {

    @Autowired
    private ShopService shopService;

    @Value("${web_upload_path}")
    private String web_upload_path;

    /**
     * 保存商品
     *
     * @param shop 商品实体
     * @return
     */
    /**
     * showdoc
     *
     * @param shopId         必选 int 商品ID
     * @param ShopStatus     必选 int 商品状态（0上架 1下架）
     * @param ShopDeleteType 必选 int 商品删除状态(0 正常 1 删除)
     *                       * @return {   "code": 200,"msg": "成功","data": {"shopId": 1,"shopName": "瓜子","shopNum": 10,"shopScore": 5,"shopAddDate": 1571652657098,"shopModifyDate": null,"shopImg": null,"shopMiaoshu": "洽洽瓜子","shopStatus": 0,"shopDeleteType": 0,"bak1": null,"shopXiangqing": "你看它这个瓜子，瓜子仁多还有味道，得劲！！"}}
     * @catalog 测试文档/商城相关
     * @title 保存商品
     * @description 用户保存商品的接口
     * @method post
     * @url /shop/saveShops
     * @return_param code int 返回状态码
     * @return_param msg string 返回状态码提示
     * @return_param data json 返回数据
     * @return_param shopId int 商品id
     * @return_param shopName String 商品名称
     * @return_param shopNum int 商品数量
     * @return_param shopScore int 商品所需积分
     * @return_param shopAddDate bigint 商品添加时间
     * @return_param shopModifyDate bigint 商品修改时间
     * @return_param shopImg varchar 商品图片
     * @return_param shopMiaoshu varchar 商品描述
     * @return_param shopStatus int 商品状态
     * @return_param shopDeleteType int 商品删除状态
     * @return_param shopXiangqing text 商品详情
     * @return_param bak1 bigint 预留字段
     * @remark 备注信息
     */
    @PostMapping(value = "/saveShops")
    public Results saveShops(@RequestBody Shop shop) {
        return shopService.saveShops(shop);
    }

    /**
     * 删除商品
     *
     * @param
     * @return
     */
    /**
     * showdoc
     *
     * @param shopId 必选 int 部门ID
     *               * @return {  "code": 200,"msg": "成功","data": {"操作成功！"}}
     * @catalog 测试文档/商城相关
     * @title 删除商品
     * @description 用户删除批量删除或单个删除的接口
     * @method delete
     * @url /shop/delShops
     * @return_param code int 返回状态码
     * @return_param msg string 返回状态码提示
     * @return_param data json 返回数据结果
     * @return_param shopId int 商品id
     * @return_param shopName String 商品名称
     * @return_param shopNum int 商品数量
     * @return_param shopScore int 商品所需积分
     * @return_param shopAddDate bigint 商品添加时间
     * @return_param shopModifyDate bigint 商品修改时间
     * @return_param shopImg varchar 商品图片
     * @return_param shopMiaoshu varchar 商品描述
     * @return_param shopStatus int 商品状态
     * @return_param shopDeleteType int 商品删除状态
     * @return_param shopXiangqing text 商品详情
     * @return_param bak1 bigint 预留字段
     * @remark 备注信息
     */
    @DeleteMapping(value = "/delShops")
    public Results delShops(@RequestBody Map<String, Integer[]> map) {
        Integer[] shopIds = map.get("shopId");
        return shopService.delShops(shopIds);

    }

    /**
     * 按照ID查询商品
     *
     * @param shop_id 商品id
     * @return
     */
    /**
     * showdoc
     *
     * @param shop_id 必选 int 商品ID
     *                * @return {   "code": 200,"msg": "成功","data": {"shopId": 1,"shopName": "瓜子","shopNum": 10,"shopScore": 5,"shopAddDate": 1571652657098,"shopModifyDate": null,"shopImg": null,"shopMiaoshu": "洽洽瓜子","shopStatus": 0,"shopDeleteType": 0,"bak1": null,"shopXiangqing": null}}
     * @catalog 测试文档/商城相关
     * @title 根据商品ID查询
     * @description 用户根据商品ID查询的接口
     * @method get
     * @url /shop/getShopAll/{shop_id}
     * @return_param code int 返回状态码
     * @return_param msg string 返回状态码提示
     * @return_param data json 返回数据结果
     * @return_param shopId int 商品id
     * @return_param shopName String 商品名称
     * @return_param shopNum int 商品数量
     * @return_param shopScore int 商品所需积分
     * @return_param shopAddDate bigint 商品添加时间
     * @return_param shopModifyDate bigint 商品修改时间
     * @return_param shopImg varchar 商品图片
     * @return_param shopMiaoshu varchar 商品描述
     * @return_param shopStatus int 商品状态
     * @return_param shopDeleteType int 商品删除状态
     * @return_param shopXiangqing text 商品详情
     * @return_param bak1 bigint 预留字段
     * @remark 备注信息
     */
    @GetMapping(value = "/getShopAll/{shop_id}")
    public Results getShopAll(@PathVariable Integer shop_id) {
        return shopService.getShopAll(shop_id);
    }

    /**
     * 图片上传
     *
     * @param file 文件
     * @param shop 实体
     * @return
     * @throws IOException
     */
    /**
     * showdoc
     *
     * @param shop_id 必选 int 商品ID
     *                * @return {   "code": 200,"msg": "成功","data": {"shopId": 1,"shopName": "瓜子","shopNum": 10,"shopScore": 5,"shopAddDate": 1571652657098,"shopModifyDate": null,"shopImg": null,"shopMiaoshu": "洽洽瓜子","shopStatus": 0,"shopDeleteType": 0,"bak1": null,"shopXiangqing": null}}
     * @catalog 测试文档/商城相关
     * @title 商品图片上传
     * @description 用户商品图片上传的接口
     * @method post
     * @url /shop/addFile.do
     * @return_param code int 返回状态码
     * @return_param msg string 返回状态码提示
     * @return_param data json 返回数据结果
     * @return_param shopId int 商品id
     * @return_param shopName String 商品名称
     * @return_param shopNum int 商品数量
     * @return_param shopScore int 商品所需积分
     * @return_param shopAddDate bigint 商品添加时间
     * @return_param shopModifyDate bigint 商品修改时间
     * @return_param shopImg varchar 商品图片
     * @return_param shopMiaoshu varchar 商品描述
     * @return_param shopStatus int 商品状态
     * @return_param shopDeleteType int 商品删除状态
     * @return_param shopXiangqing text 商品详情
     * @return_param bak1 bigint 预留字段
     * @remark 备注信息
     */

    @RequestMapping("/upload")
    @ResponseBody
    public Results saveImg(@RequestParam("file") MultipartFile file) {
        Results jsonResultVO = new Results();
        try {
            //上传的文件的字节数组
//            byte[] bytes = file.getBytes();
            //上传文件流
            InputStream inputStream = file.getInputStream();

            //获取文件原名称
            String filename = file.getOriginalFilename();

            //将上传的文件通过FTP传递到Nginx服务器所在的图片目录。

            try {
                FTPClient ftp = new FTPClient();
                //连接FTP服务器，默认端口是21
                ftp.connect("192.168.0.100", 21);
                //匿名用户必须使用anonymous登录，密码是邮箱
                boolean login = ftp.login("FTPUPLODE", "tuibatuiba@qq.com");
                System.out.println(login);

                //获取ftp服务器的响应
                int replyCode = ftp.getReplyCode();
                if (!FTPReply.isPositiveCompletion(replyCode)) {
                    System.out.println("获取响应失败");
                    jsonResultVO.setCode(1);
                    return jsonResultVO;
                }
                //设置接收文件类型为二进制文件
                ftp.setFileType(FTPClient.BINARY_FILE_TYPE);
                //服务器上创建images文件夹
                ftp.makeDirectory("image");
                //切换ftp默认文件夹
                ftp.changeWorkingDirectory("image");

                //将本地图片上传到ftp服务器上
                String remoteFileName = System.currentTimeMillis() + filename;
                //参数1：远程服务器的文件名称
                //参数2：上传文件流
                ftp.storeFile(remoteFileName, inputStream);
                //退出登录
                ftp.logout();

                jsonResultVO.setCode(0);
                //将图片在Nginx中的路径返回给页面
                jsonResultVO.setData("http://192.168.0.100/image/" + remoteFileName);
                String msg = String.valueOf(jsonResultVO.getData());

                System.out.println(msg);
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (MaxUploadSizeExceededException e) {
            jsonResultVO.setCode(1);
            jsonResultVO.setMsg("超过最大上传限制200KB");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return jsonResultVO;
    }


    /**
     * 编辑商品
     *
     * @param shop 商品实体
     * @return
     */
    /**
     * showdoc
     *
     * @param shop_id 必选 int 商品ID
     *                * @return {  "code": 200,"msg": "成功","data": {"shopId": 1,"shopName": "大西瓜","shopNum": 10,"shopScore": 5,"shopAddDate": 1571652657098,"shopModifyDate": 1571657613597,"shopImg": null,"shopMiaoshu": "洽洽西瓜","shopStatus": 0,"shopDeleteType": 0,"bak1": null,"shopXiangqing": "你看它这个瓜子，瓜子仁多还有味道，得劲！！"}}
     * @catalog 测试文档/商城相关
     * @title 商品编辑
     * @description 用户商品编辑的接口
     * @method post
     * @url /shop/updateShop
     * @return_param code int 返回状态码
     * @return_param msg string 返回状态码提示
     * @return_param data json 返回数据结果
     * @return_param shopId int 商品id
     * @return_param shopName String 商品名称
     * @return_param shopNum int 商品数量
     * @return_param shopScore int 商品所需积分
     * @return_param shopAddDate bigint 商品添加时间
     * @return_param shopModifyDate bigint 商品修改时间
     * @return_param shopImg varchar 商品图片
     * @return_param shopMiaoshu varchar 商品描述
     * @return_param shopStatus int 商品状态
     * @return_param shopDeleteType int 商品删除状态
     * @return_param shopXiangqing text 商品详情
     * @return_param bak1 bigint 预留字段
     * @remark 备注信息
     */
    @PostMapping(value = "/updateShop")
    public Results updateShop(@RequestBody Shop shop) {
        return shopService.updateShop(shop);
    }

    /**
     * 分页查询
     *
     * @param page 当前页
     * @param size 条数
     * @return
     */
    /**
     * showdoc
     *
     * @param page 必选 int 当前页
     * @param page 必选 int 当前页条数
     *             * @return {   "code": 200,"msg": "成功","data": {"total": 1,"rows": [{"shopId": 1,"shopName": "大西瓜","shopNum": 10,"shopScore": 5,"shopAddDate": 1571652657098,"shopModifyDate": 1571657613597,"shopImg": null,"shopMiaoshu": "洽洽西瓜","shopStatus": 0,"shopDeleteType": 0,"bak1": null,"shopXiangqing": null}]}}
     * @catalog 测试文档/商城相关
     * @title 分页查询
     * @description 用户分页查询的接口
     * @method get
     * @url /shop/findPage/{page}/{size}
     * @return_param code int 返回状态码
     * @return_param msg string 返回状态码提示
     * @return_param data json 返回数据结果
     * @return_param shopId int 商品id
     * @return_param shopName String 商品名称
     * @return_param shopNum int 商品数量
     * @return_param shopScore int 商品所需积分
     * @return_param shopAddDate bigint 商品添加时间
     * @return_param shopModifyDate bigint 商品修改时间
     * @return_param shopImg varchar 商品图片
     * @return_param shopMiaoshu varchar 商品描述
     * @return_param shopStatus int 商品状态
     * @return_param shopDeleteType int 商品删除状态
     * @return_param shopXiangqing text 商品详情
     * @return_param bak1 bigint 预留字段
     * @remark 备注信息
     */
    @GetMapping(value = "/findPage/{page}/{size}")
    public Results findPage(@PathVariable int page, @PathVariable int size) {
        PageResult page1 = shopService.findPage(page, size);
        return ResultUtil.successce(page1);
    }

    /**
     * 查询所有
     *
     * @return
     */

    /**
     * showdoc
     * <p>
     * * @return {"code": 200,"msg": "成功","data": [{"shopId": 1,"shopName": "大西瓜","shopNum": 10,"shopScore": 5,"shopAddDate": 1571652657098,"shopModifyDate": 1571657613597,"shopImg": null,"shopMiaoshu": "洽洽西瓜","shopStatus": 0,"shopDeleteType": 0,"bak1": null,"shopXiangqing": null}}
     *
     * @catalog 测试文档/商城相关
     * @title 查询所有
     * @description 用户查询所有的接口
     * @method get
     * @url /shop/findAllShop
     * @return_param code int 返回状态码
     * @return_param msg string 返回状态码提示
     * @return_param data json 返回数据结果
     * @return_param shopId int 商品id
     * @return_param shopName String 商品名称
     * @return_param shopNum int 商品数量
     * @return_param shopScore int 商品所需积分
     * @return_param shopAddDate bigint 商品添加时间
     * @return_param shopModifyDate bigint 商品修改时间
     * @return_param shopImg varchar 商品图片
     * @return_param shopMiaoshu varchar 商品描述
     * @return_param shopStatus int 商品状态
     * @return_param shopDeleteType int 商品删除状态
     * @return_param shopXiangqing text 商品详情
     * @return_param bak1 bigint 预留字段
     * @remark 备注信息
     */
    @GetMapping(value = "/findAllShop")
    public Results findAllShop() {
        return shopService.findAllShop();
    }

    /**
     * 商品上架    0：上架   1：下架
     *
     * @param
     * @return
     */
    /**
     * showdoc
     *
     * @param page 必选 int 当前页
     * @param page 必选 int 当前页条数
     *             * @return {"code": 200,"msg": "成功","data": [{"shopId": 1,"shopName": "大西瓜","shopNum": 10,"shopScore": 5,"shopAddDate": 1571652657098,"shopModifyDate": 1571657613597,"shopImg": null,"shopMiaoshu": "洽洽西瓜","shopStatus": 0,"shopDeleteType": 0,"bak1": null,"shopXiangqing": null}}
     * @catalog 测试文档/商城相关
     * @title 商品上架
     * @description 用户商品上架的接口
     * @method post
     * @url /shop/onShop
     * @return_param code int 返回状态码
     * @return_param msg string 返回状态码提示
     * @return_param data json 返回数据结果
     * @return_param shopId int 商品id
     * @return_param shopName String 商品名称
     * @return_param shopNum int 商品数量
     * @return_param shopScore int 商品所需积分
     * @return_param shopAddDate bigint 商品添加时间
     * @return_param shopModifyDate bigint 商品修改时间
     * @return_param shopImg varchar 商品图片
     * @return_param shopMiaoshu varchar 商品描述
     * @return_param shopStatus int 商品状态
     * @return_param shopDeleteType int 商品删除状态
     * @return_param shopXiangqing text 商品详情
     * @return_param bak1 bigint 预留字段
     * @remark 备注信息
     */
    @PostMapping(value = "/onShop")
    public Results onShop(@RequestBody Map<String, Integer> map) {
        Integer shopId = map.get("shopId");
        return shopService.onShop(shopId);
    }

    /**
     * 商品下架    0：上架   1：下架
     *
     * @param map
     * @return
     */

    /**
     * showdoc
     *
     * @param page 必选 int 当前页
     * @param page 必选 int 当前页条数
     *             * @return {"code": 200,"msg": "成功","data": [{"shopId": 1,"shopName": "大西瓜","shopNum": 10,"shopScore": 5,"shopAddDate": 1571652657098,"shopModifyDate": 1571657613597,"shopImg": null,"shopMiaoshu": "洽洽西瓜","shopStatus": 1,"shopDeleteType": 0,"bak1": null,"shopXiangqing": null}}
     * @catalog 测试文档/商城相关
     * @title 商品下架
     * @description 用户商品下架的接口
     * @method post
     * @url /shop/underShop
     * @return_param code int 返回状态码
     * @return_param msg string 返回状态码提示
     * @return_param data json 返回数据结果
     * @return_param shopId int 商品id
     * @return_param shopName String 商品名称
     * @return_param shopNum int 商品数量
     * @return_param shopScore int 商品所需积分
     * @return_param shopAddDate bigint 商品添加时间
     * @return_param shopModifyDate bigint 商品修改时间
     * @return_param shopImg varchar 商品图片
     * @return_param shopMiaoshu varchar 商品描述
     * @return_param shopStatus int 商品状态
     * @return_param shopDeleteType int 商品删除状态
     * @return_param shopXiangqing text 商品详情
     * @return_param bak1 bigint 预留字段
     * @remark 备注信息
     */
    @PostMapping(value = "/underShop")
    public Results underShop(@RequestBody Map<String, Integer> map) {
        Integer shopId = map.get("shopId");
        return shopService.underShop(shopId);
    }
}
