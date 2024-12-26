package com.caicode.lease.web.app.service;

import com.caicode.lease.model.entity.LeaseTerm;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
* @author caicode
* @description 针对表【lease_term(租期)】的数据库操作Service
*/
public interface LeaseTermService extends IService<LeaseTerm> {
    List<LeaseTerm> listByRoomId(Long id);
}
