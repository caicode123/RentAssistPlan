package com.caicode.lease.web.app.service.impl;

import com.caicode.lease.model.entity.LeaseAgreement;
import com.caicode.lease.web.app.mapper.LeaseAgreementMapper;
import com.caicode.lease.web.app.service.LeaseAgreementService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.caicode.lease.web.app.vo.agreement.AgreementItemVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.rmi.dgc.Lease;
import java.util.List;

/**
 * @author caicode
 * @description 针对表【lease_agreement(租约信息表)】的数据库操作Service实现
 */
@Service
public class LeaseAgreementServiceImpl extends ServiceImpl<LeaseAgreementMapper, LeaseAgreement>
        implements LeaseAgreementService {

    @Autowired
    private LeaseAgreementMapper leaseAgreementMapper;

    @Override
    public List<AgreementItemVo> listItemByPhone(String phone) {
        return leaseAgreementMapper.listItemByPhone(phone);
    }
}




