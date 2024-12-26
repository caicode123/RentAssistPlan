package com.caicode.lease.web.admin.mapper;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.caicode.lease.model.entity.LeaseAgreement;
import com.caicode.lease.web.admin.vo.agreement.AgreementQueryVo;
import com.caicode.lease.web.admin.vo.agreement.AgreementVo;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;

/**
* @author caicode
* @description 针对表【lease_agreement(租约信息表)】的数据库操作Mapper
* @Entity com.caicode.lease.model.LeaseAgreement
*/
public interface LeaseAgreementMapper extends BaseMapper<LeaseAgreement> {

    IPage<AgreementVo> pageAgreementByQuery(Page<AgreementVo> page, AgreementQueryVo queryVo);
}




