package com.caicode.lease.web.admin.service;

import com.caicode.lease.model.entity.FeeKey;
import com.caicode.lease.web.admin.vo.fee.FeeKeyVo;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
* @author caicode
* @description 针对表【fee_key(杂项费用名称表)】的数据库操作Service
*/
public interface FeeKeyService extends IService<FeeKey> {

    List<FeeKeyVo> feeInfoList();
}
