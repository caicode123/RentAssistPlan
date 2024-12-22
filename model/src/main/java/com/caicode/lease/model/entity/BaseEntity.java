package com.caicode.lease.model.entity;

import com.baomidou.mybatisplus.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class BaseEntity implements Serializable {

    @Schema(description = "主键")
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @Schema(description = "创建时间")
    @TableField(value = "create_time",fill = FieldFill.INSERT)
    @JsonIgnore//转换成json时忽略该属性的注解
    private Date createTime;

    @Schema(description = "更新时间")
    @TableField(value = "update_time",fill = FieldFill.UPDATE)
    @JsonIgnore
    private Date updateTime;

    @Schema(description = "逻辑删除")
    @TableField("is_deleted")
    @TableLogic//增加mybatisplus的逻辑删除识别字段标识，不用再每次查询的时候手动添加筛选条件
    @JsonIgnore
    private Byte isDeleted;

}