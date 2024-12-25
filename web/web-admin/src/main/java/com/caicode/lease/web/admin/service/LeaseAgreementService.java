package com.caicode.lease.web.admin.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.caicode.lease.model.entity.LeaseAgreement;
import com.caicode.lease.web.admin.vo.agreement.AgreementQueryVo;
import com.caicode.lease.web.admin.vo.agreement.AgreementVo;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;

/**
* @author caicode123
* @description 针对表【lease_agreement(租约信息表)】的数据库操作Service
*/
public interface LeaseAgreementService extends IService<LeaseAgreement> {

    IPage<AgreementVo> pageAgreementByQuery(Page<AgreementVo> page, AgreementQueryVo queryVo);
}
