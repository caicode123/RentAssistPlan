package com.caicode.lease.web.app.service;

import com.caicode.lease.model.entity.LeaseAgreement;
import com.baomidou.mybatisplus.extension.service.IService;
import com.caicode.lease.web.app.vo.agreement.AgreementItemVo;

import java.util.List;

/**
* @author caicode
* @description 针对表【lease_agreement(租约信息表)】的数据库操作Service
*/
public interface LeaseAgreementService extends IService<LeaseAgreement> {
    List<AgreementItemVo> listItemByPhone(String username);
}
