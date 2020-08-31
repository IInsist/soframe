package cn.com.soframe.module.reviewRecord.controller;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 审核记录表 前端控制器
 * </p>
 *
 * @author fujh
 * @since 2020-08-21
 */
@RestController
@RequestMapping("/reviewRecord")
@Api(tags = "测试接口1")
public class TReviewRecordController {

    @ApiOperation(value = "测试的接口啦",notes = "测试的接口1223442")
    @GetMapping("/test")
    public String test(){
        return "helloworld";
    }
}