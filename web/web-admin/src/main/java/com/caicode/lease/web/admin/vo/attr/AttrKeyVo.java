package com.caicode.lease.web.admin.vo.attr;

import com.caicode.lease.model.entity.AttrKey;
import com.caicode.lease.model.entity.AttrValue;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.util.List;


@Data
public class AttrKeyVo extends AttrKey {

    @Schema(description = "属性value列表")
    private List<AttrValue> attrValueList;//相当于sql语句中的外连接，一对多关系来连接两个表
}
