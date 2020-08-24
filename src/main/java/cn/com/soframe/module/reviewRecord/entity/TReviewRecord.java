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
 * 审核记录表
 * </p>
 *
 * @author fujh
 * @since 2020-08-21
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("t_review_record")
@ApiModel(value="TReviewRecord对象", description="审核记录表")
public class TReviewRecord implements Serializable {

    private static final long serialVersionUID=1L;

    @ApiModelProperty(value = "主键ID")
    private String id;

    @ApiModelProperty(value = "业务表ID")
    private String businessId;

    @ApiModelProperty(value = "审核类型（1：接口发布 2：报表发布  3：接口申请 4：报表申请）")
    private String dataType;

    @ApiModelProperty(value = "申请备注")
    private String remark;

    @ApiModelProperty(value = "审核人ID")
    private String reviewerId;

    @ApiModelProperty(value = "审核人")
    private String reviewer;

    @ApiModelProperty(value = "最终审核时间")
    private Date reviewTime;

    @ApiModelProperty(value = "申请发起人ID")
    private String submitterId;

    @ApiModelProperty(value = "申请发起人")
    private String submitter;

    @ApiModelProperty(value = "发起时间")
    private Date submitTime;

    @ApiModelProperty(value = "最终审核结果（N：审核不通过，D：待审核，Y：审核通过）")
    private String result;


}
