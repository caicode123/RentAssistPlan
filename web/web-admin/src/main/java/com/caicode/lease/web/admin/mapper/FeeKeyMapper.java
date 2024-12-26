package com.caicode.lease.web.admin.mapper;

import com.caicode.lease.model.entity.FeeKey;
import com.caicode.lease.web.admin.vo.fee.FeeKeyVo;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

/**
* @author caicode
* @description 针对表【fee_key(杂项费用名称表)】的数据库操作Mapper
* @Entity com.caicode.lease.model.FeeKey
*/
public interface FeeKeyMapper extends BaseMapper<FeeKey> {

    List<FeeKeyVo> feeInfoList();
}




