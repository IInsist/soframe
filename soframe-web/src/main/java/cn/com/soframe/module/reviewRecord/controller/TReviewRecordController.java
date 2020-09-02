package cn.com.soframe.module.reviewRecord.controller;


import cn.com.soframe.annotation.OperationLog;
import cn.com.soframe.common.result.AjaxResult;
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
@Api(tags = "测试模块接口")
public class TReviewRecordController {

    /**
     * 测试的请求：
     *  @OperationLog 该注解设定记录操作记录
     * @return
     */
    @OperationLog(modelId = "111111", modelName = "测试的啦")
    @ApiOperation(value = "测试AjaxResult.success()接口",notes = "11111111")
    @GetMapping("/success")
    public AjaxResult success(){
        return AjaxResult.success();
    }

    /**
     * 测试AjaxResult
     * @return
     */
    @ApiOperation(value = "测试AjaxResult.error()接口",notes = "11111111")
    @GetMapping("/error")
    public AjaxResult error(){
        return AjaxResult.error();
    }

    @ApiOperation(value = "测试inputStr",notes = "11111111")
    @GetMapping("/str")
    public String inputStr(){
        return AjaxResult.error().toString();
    }

    @ApiOperation(value = "测试strS",notes = "11111111")
    @GetMapping("/strS")
    public String strS(){
        return AjaxResult.success().toString();
    }

}