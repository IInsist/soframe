package cn.com.soframe.module.reviewRecord.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import java.util.Date;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 审核记录关联表
 * </p>
 *
 * @author fujh
 * @since 2020-08-21
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("t_review_record_r")
@ApiModel(value="TReviewRecordR对象", description="审核记录关联表")
public class TReviewRecordR implements Serializable {

    private static final long serialVersionUID=1L;

    @ApiModelProperty(value = "主键ID")
    private String id;

    @ApiModelProperty(value = "审核记录表ID")
    private String reviewRecordId;

    @ApiModelProperty(value = "创建日期")
    private Date createTime;

    @ApiModelProperty(value = "发起申请：发起人ID，审核：审核人ID")
    private String createUserId;

    @ApiModelProperty(value = "创建人名称")
    private String createUserName;

    @ApiModelProperty(value = "审核结果（N：审核不通过，D：待审核，Y：审核通过）")
    private String result;

    @ApiModelProperty(value = "操作类型：startApply：发起申请、review：审核")
    private String operationType;

    @ApiModelProperty(value = "处理意见")
    private String opinion;


}
