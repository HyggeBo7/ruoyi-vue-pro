package cn.iocoder.yudao.module.mp.controller.admin.fansmsgres.vo;

import lombok.*;

import java.util.*;

import io.swagger.annotations.*;
import org.springframework.format.annotation.DateTimeFormat;

import static cn.iocoder.yudao.framework.common.util.date.DateUtils.FORMAT_YEAR_MONTH_DAY_HOUR_MINUTE_SECOND;

@ApiModel(value = "管理后台 - 回复粉丝消息历史表  Excel 导出 Request VO", description = "参数和 WxFansMsgResPageReqVO 是一致的")
@Data
public class WxFansMsgResExportReqVO {

    @ApiModelProperty(value = "粉丝消息ID")
    private String fansMsgId;

    @ApiModelProperty(value = "回复内容")
    private String resContent;

    @DateTimeFormat(pattern = FORMAT_YEAR_MONTH_DAY_HOUR_MINUTE_SECOND)
    @ApiModelProperty(value = "开始创建时间")
    private Date beginCreateTime;

    @DateTimeFormat(pattern = FORMAT_YEAR_MONTH_DAY_HOUR_MINUTE_SECOND)
    @ApiModelProperty(value = "结束创建时间")
    private Date endCreateTime;

}