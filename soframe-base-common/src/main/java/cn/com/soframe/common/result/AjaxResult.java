package cn.com.soframe.common.result;

import com.baomidou.mybatisplus.core.metadata.IPage;

import java.util.HashMap;

/**
 * @author fujh
 * @since 2020年9月2日16:00:55
 * 返回结果类
 */
public class AjaxResult extends HashMap<String,Object> {

    /**
     * 状态码KEY
     */
    public static final String RESULT_KEY_CODE = "code";

    /**
     * 响应说明KEY
     */
    public static final String RESULT_KEY_MSG = "msg";

    /**
     * 响应数据KEY
     */
    public static final String RESULT_KEY_DATA = "data";

    /**
     * 响应页KEY
     */
    public static final String RESULT_KEY_PAGE = "page";

    /**
     * 默认响应成功
     */
    public AjaxResult(){
        super.put(RESULT_KEY_CODE,200);
        super.put(RESULT_KEY_MSG,"成功");
    }

    /**
     * @param code 请求状态码
     * @param msg 返回消息
     */
    public AjaxResult(int code, String msg){
        super.put(RESULT_KEY_CODE,code);
        super.put(RESULT_KEY_MSG,msg);
    }

    /**
     * @param code 请求状态码
     * @param msg 返回消息
     * @param data 返回数据
     */
    public AjaxResult(int code, String msg, Object data){
        super.put(RESULT_KEY_CODE,code);
        super.put(RESULT_KEY_MSG,msg);
        if(data!=null){
            super.put(RESULT_KEY_DATA,data);
        }
    }

    /**
     * 只返回结果
     * @param data
     */
    public AjaxResult(Object data){
        super.put(RESULT_KEY_CODE,200);
        super.put(RESULT_KEY_MSG,"成功");
        if(data!=null){
            super.put(RESULT_KEY_DATA,data);
        }
    }

    /**
     * 响应分页查询结果
     * @param page
     */
    public AjaxResult(IPage<?> page){
        super.put(RESULT_KEY_CODE,200);
        super.put(RESULT_KEY_MSG,"成功");
        //返回数据
        super.put(RESULT_KEY_DATA,page.getRecords());
        final Integer current = (int)page.getCurrent();
        final Integer total = (int)page.getTotal();
        final Integer pages = (int)page.getPages();
        final Integer size = (int)page.getSize();
        //分页数据
        super.put(RESULT_KEY_PAGE,new HashMap<String,Integer>(){{
            put("currentPage", current);
            put("total", total);
            put("pages", pages);
            put("pageSize", size);
        }});
    }


    /**
     * 响应失败
     * @return
     */
    public static AjaxResult error(){
        return AjaxResult.error("异常");
    }

    /**
     * 响应失败
     * @param msg
     * @return
     */
    public static AjaxResult error(String msg){
        return AjaxResult.error(msg,null);
    }

    /**
     * 响应失败
     * @param msg
     * @param data
     * @return
     */
    public static AjaxResult error(String msg, Object data){
        return new AjaxResult(500,msg,data);
    }

    /**
     * 响应成功
     * @param msg
     * @return
     */
    public static AjaxResult success(String msg){
        return AjaxResult.success(msg,null);
    }

    /**
     * 响应成功
     * @param data
     * @return
     */
    public static AjaxResult success(Object data){
        return AjaxResult.success("成功",data);
    }

    /**
     * 响应成功
     * @param page
     * @return
     */
    public static AjaxResult success(IPage<?> page){
        return new AjaxResult(page);
    }

    /**
     * 响应成功
     * @param data
     * @return
     */
    public static AjaxResult success(String msg,Object data){
        return new AjaxResult(200,msg,data);
    }

    /**
     * 获取状态码
     * @return
     */
    public int getCode(){
        return Integer.parseInt(super.get(RESULT_KEY_CODE).toString());
    }

    /**
     * 获取数据
     * @return
     */
    public Object getData(){
        return super.get(RESULT_KEY_CODE);
    }

}
