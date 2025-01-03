package com.caicode.lease.web.admin.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.caicode.lease.model.entity.LeaseTerm;
import com.caicode.lease.web.admin.service.LeaseTermService;
import com.caicode.lease.web.admin.mapper.LeaseTermMapper;
import org.springframework.stereotype.Service;

/**
* @author caicode
* @description 针对表【lease_term(租期)】的数据库操作Service实现
*/
@Service
public class LeaseTermServiceImpl extends ServiceImpl<LeaseTermMapper, LeaseTerm>
    implements LeaseTermService{

}




