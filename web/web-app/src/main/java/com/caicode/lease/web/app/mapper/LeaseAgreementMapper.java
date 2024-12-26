package com.caicode.lease.web.app.mapper;

import com.caicode.lease.model.entity.LeaseAgreement;
import com.caicode.lease.web.app.vo.agreement.AgreementItemVo;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

/**
* @author caicode
* @description 针对表【lease_agreement(租约信息表)】的数据库操作Mapper
* @Entity com.caicode.lease.model.entity.LeaseAgreement
*/
public interface LeaseAgreementMapper extends BaseMapper<LeaseAgreement> {

    List<AgreementItemVo> listItemByPhone(String phone);
}




