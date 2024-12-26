package com.caicode.lease.web.app.service.impl;

import com.caicode.lease.model.entity.LeaseTerm;
import com.caicode.lease.web.app.mapper.LeaseTermMapper;
import com.caicode.lease.web.app.service.LeaseTermService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author caicode
 * @description 针对表【lease_term(租期)】的数据库操作Service实现
 */
@Service
public class LeaseTermServiceImpl extends ServiceImpl<LeaseTermMapper, LeaseTerm>
        implements LeaseTermService {

    @Autowired
    private LeaseTermMapper leaseTermMapper;

    @Override
    public List<LeaseTerm> listByRoomId(Long id) {
        return leaseTermMapper.selectListByRoomId(id);
    }
}




